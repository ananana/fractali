package fractali;

import fractali.FractalRenderer.RenderOps;
import java.util.Vector;

/**
 * Reprezentarea unui fractal tip L-sistem.
 *
 * @author Razvan
 */
public class LSystemFractal extends Fractal{
    
    /**
     * Simbolul(urile) de start.
     */
    private String axiom;
    /**
     * Membrii stangi ai productiilor. Ar trebui sa fie litere.
     */
    private String[] productionsLHS;
    /**
     * Membrii drepti ai productiilor. Ar trebui sa fie tot atatia cat membrii
     * stangi si sunt siruri ce pot consta in succesiuni de litere, / si \.
     */
    private String[] productionsRHS;
    /**
     * Unghiul de rotatie, in grade.
     */
    private int angle;
    /**
     * Starea curenta a derivarii.
     */
    private String currState;

    private int currIters = 1;

    /*
     * Constructor trivial.
     * 
     * @param axiom simbol(uri) de start
     * @param productionsLHS membrii stangi ai productiilor
     * @param productionsRHS membrii drepti ai productiilor
     * @param angle unghiul de rotatie, in grade
     */
    public LSystemFractal(String axiom, String[] productionsLHS,
            String[] productionsRHS, int angle) {
        type = FractalType.LSYSTEM;
        this.axiom = axiom;
        this.productionsLHS = productionsLHS;
        this.productionsRHS = productionsRHS;
        this.angle = angle;
        currState = new String(axiom);

        System.out.println(axiom);
        for(int i=0; i<productionsLHS.length; i++)
            System.out.println("production lhs " + i + ": " + productionsLHS[i]);
        for(int i=0; i<productionsRHS.length; i++)
        System.out.println("production rhs " + i + ": " + productionsRHS[i]);
        System.out.println(angle);
    }

    /**
     * Aplica starii curente productiile pentru <code> iters </code> iteratii.
     * "Algoritmul" este ceva relativ primitiv, bazat pe inlocuiri de stringuri.
     * E de vazut daca s-ar putea face ceva mai destept.
     * 
     * @param iters numarul de iteratii
     */
    private void iterateTo(int iters) {
        //System.out.println("currIters: " + currIters);
        //System.out.println("iters: " + iters);
        System.out.println("Generez...");
        System.out.print("currIters = " + currIters + ", ");
        long t1 = System.currentTimeMillis();

        if (iters < currIters) {
            currState = axiom;
            currIters = 1;
        }
        for(int i = currIters + 1; i<=iters; i++) {
            for (int j = 0; j < productionsLHS.length; j++) {
                currState = currState.replace(productionsLHS[j],
                        productionsRHS[j]);
            }
        }
        currIters = iters;
        //System.out.println(currState);
        //System.out.println(currIters);
        long t2 = System.currentTimeMillis();
        System.out.println("A durat " + (t2-t1) +
                ", currIters = " + currIters);
    }

    /**
     * Returneaza operatiile grafice care deseneaza fractalul pentru 
     * configuratia (numarul de iteratii, marimea canvasului) specificata de 
     * <code> conf </code>. Mai intai apeleaza <code> iterateTo </code> pentru 
     * a aplica productiile, apoi deseneaza conform caracterelor din 
     * <code> currState </code>.
     * 
     * Momentan se presupune ca fractalul va forma o figura de tip 
     * <code> POLYLINE </code>, deci fara teleportari, colorata uniform 
     * (culoarea e momentan hardcodata ca verde). Daca canvasul e mai mic decat
     * spatiul necesar pentru fractal, se va afisa pur si simplu o portiune din
     * centru, zoomata, ceea ce este destul de caraghios. Poate ar trebui un pic
     * de scaling, dar tentativele mele artizanale au esuat, poate trebuie 
     * primit canvasul ca parametru, desenat in memorie pe ceva destul de mare 
     * si apoi rugat canvasul sa faca scaling.
     * 
     * @param conf parametrii desenarii
     * @return instructiuni pentru desenarea fractalului. 
     */
    public FractalRenderer.RenderOps render(RenderConf conf) {
        if(conf.iters < 0) return null;
        iterateTo(conf.iters);
        double currX = 0, currY = conf.canvasHeight,
                currAngle = 0;

        //incerc sa estimez cat de lunga imi permit sa fac o linie
        int numLines = 0;
        for(int i=0; i<currState.length(); i++) {
            if(currState.charAt(i) == 'F' || currState.charAt(i) == 'G') numLines ++;
        }
        int ratio = numLines > 0 ? conf.canvasWidth / numLines : 1;
        int lineLength = ratio > 0 ? ratio : 1;
        //pentru unghiuri de 60, de ex, este favorabila doar o lungime para
        if (lineLength % 2 != 0) lineLength++;

        double leftmostX = currX;
        double rightmostX = currX;
        double topY = currY;
        double bottomY = currY;

       Vector<Double> x = new Vector<Double>();
       Vector<Double> y = new Vector<Double>();
        x.add(currX);
        y.add(currY);
        int[] rgb = {255 << 8};

        System.out.println(currState);

        for (int i = 0; i < currState.length(); i++) {
            if (currState.charAt(i) == 'F' || currState.charAt(i) == 'G'
                    || currState.charAt(i) == 'H' || currState.charAt(i) == 'I') { //inainte
                //calculez noul punct
                currX = currX + lineLength * Math.cos(
                        Math.toRadians((double) currAngle));
                currY = conf.canvasHeight - currY; //ecran -> cartezian
                currY = currY + lineLength * Math.sin(
                        Math.toRadians((double) currAngle));
                currY = conf.canvasHeight - currY; //cartezian -> ecran
                if (currX > rightmostX) {
                    rightmostX = currX;
                }
                if (currX < leftmostX) {
                    leftmostX = currX;
                }
                if (currY < topY) {
                    topY = currY;
                }
                if (currY > bottomY) {
                    bottomY = currY;
                }
                x.add(currX);
                y.add(currY);
            } else if (currState.charAt(i) == '/') { //intoarcere antitrigonometrica
                currAngle = (currAngle - angle) % 360;
            } else if (currState.charAt(i) == '\\') { //intoarcere trigonometrica
                currAngle = (currAngle + angle) % 360;
            }
        }
        //centrare
        for (int i = 0; i<x.size(); i++)
        {
              x.setElementAt(x.elementAt(i) + (leftmostX - rightmostX + conf.canvasWidth)/2 - leftmostX, i);
              y.setElementAt(y.elementAt(i) + (topY - bottomY + conf.canvasHeight)/2 - topY, i);
        }
        //centrez si leftmostX, etc...
        double tmpleftmostX = leftmostX + (leftmostX - rightmostX + conf.canvasWidth)/2 - leftmostX;
        double tmptopY = topY + (topY - bottomY + conf.canvasHeight)/2 - topY;
        rightmostX += (leftmostX - rightmostX + conf.canvasWidth)/2 - leftmostX;
        bottomY += (topY - bottomY + conf.canvasHeight)/2 - topY;
        leftmostX = tmpleftmostX;
        topY = tmptopY;

        

        //scalez
        double width = rightmostX - leftmostX;
        double height = bottomY - topY;
        double oldCanvasWidth = conf.canvasWidth;
        double oldCanvasHeight = conf.canvasHeight;

        double canvRatio = (double)conf.canvasWidth /(double)conf.canvasHeight;
        double realRatio = width / height;
        if (realRatio > canvRatio) {
            double moreWidth = (realRatio / canvRatio) * conf.canvasWidth
                    - conf.canvasWidth;
            conf.canvasWidth += moreWidth;
        } else if (realRatio < canvRatio) {
            double moreHeight = (canvRatio / realRatio) * conf.canvasHeight
                    - conf.canvasHeight;
            conf.canvasHeight += moreHeight;
        }
        if(conf.canvasWidth > oldCanvasWidth) {
            double r = conf.canvasWidth / oldCanvasWidth;
            conf.canvasWidth /= r;
            conf.canvasHeight /= r;
        } else if(conf.canvasHeight > oldCanvasHeight) {
            double r = conf.canvasHeight / oldCanvasHeight;
            conf.canvasWidth /= r;
            conf.canvasHeight /= r;
        }
        double scaleX = conf.canvasWidth / width;
        double scaleY = conf.canvasHeight / height;
        System.out.println(Math.abs(conf.canvasWidth - oldCanvasWidth));
        for (int i = 0; i<x.size(); i++)
        {
              x.setElementAt((x.elementAt(i) - leftmostX) * scaleX + Math.abs(conf.canvasWidth - oldCanvasWidth) / 2, i);
              y.setElementAt((y.elementAt(i) - topY) * scaleY + Math.abs(conf.canvasHeight - oldCanvasHeight) / 2, i);
        }

        // cast Vector -> array
        int[] xa = new int[x.size()];
        int[] ya = new int[y.size()];
        for (int i = 0;  i < xa.length; i++)
        {
            xa[i] = (int)Math.floor(x.elementAt(i));
            ya[i] = (int)Math.floor(y.elementAt(i));
        }
        //System.out.println("Am generat: " + x + '\n' + y);
        return new FractalRenderer.RenderOps(FractalRenderer.RenderType.POLYLINE,
                xa, ya, rgb);
    }

    @Override
    public RenderOps zoomTo(RenderConf conf) {
        if(conf.iters < 0) {
            iterateTo(currIters);
        }
        return render(conf);
    }

    protected void serialize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Fractal deserialize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPercentageDone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
