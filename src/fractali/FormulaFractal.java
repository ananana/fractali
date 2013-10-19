/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fractali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOME
 */
public class FormulaFractal extends Fractal {

    private int[] zExp;
    private int cExp;
    private int maxIteration;
    private double cReal = 0, cImag = 0;
    private int[] rgb;
    private transient AreaPainter[] threads;
    private int[] startPixels;
    public formulaType fType;
    private int threadsNr = 10;

    private boolean serialized;

    //info despre canvas
    private int width;
    private int height;
    private int[] x, y;
    private double[] realX, realY;
    private boolean[] zSgn;
    private boolean cSgn;

    //thread pool
    private transient ExecutorService es;
    private transient Future[] fut;

    public double getPercentageDone() {
        double pts = width * height;
        double done = 0;
        for(int i=0; i<threadsNr; i++) {
            done += startPixels[i] - threads[i].pxStart;
        }
        return done / pts;
    }


    public enum formulaType {

        MANDELBROT, JULIA
    };

    public FormulaFractal(int zExp[], boolean[] zSgn, int cExp, boolean cSgn,
            formulaType fType) {
        type = FractalType.FORMULA;
        this.zExp = zExp;
        this.cExp = cExp;
        this.zSgn = zSgn;
        this.cSgn = cSgn;
        this.maxIteration = 250;
        this.fType = fType;
        threads = new AreaPainter[threadsNr];
        es = Executors.newFixedThreadPool(threadsNr);
        fut = new Future[threadsNr];
       
        startPixels = new int[threadsNr];

        serialized = false;
       
    }

    public FormulaFractal(int zExp[], boolean[] zSgn, int cExp, boolean cSgn,
            formulaType fType, double cRe, double cIm) {
        type = FractalType.FORMULA;
        this.zExp = zExp;
        this.cExp = cExp;
        this.zSgn = zSgn;
        this.cSgn = cSgn;
        this.maxIteration = 500;
        this.fType = fType;
        this.cReal = cRe;
        this.cImag = cIm;
        threads = new AreaPainter[threadsNr];
        es = Executors.newFixedThreadPool(threadsNr);
        fut = new Future[threadsNr];

        startPixels = new int[threadsNr];

        serialized = false;
    }

    public FractalRenderer.RenderOps zoomTo(RenderConf conf) {
        //long t1 = System.currentTimeMillis();


        double transfXIndex = (conf.maxRealX - conf.minRealX) / width;
        double transfYIndex = (conf.maxRealY - conf.minRealY) / height;
        for (int px = 0; px < width * height; px++) {
            double yy = height - y[px] - 1;
            realX[px] = transfXIndex * x[px] + conf.minRealX;
            realY[px] = transfYIndex * yy + conf.minRealY;
        }

       // if (!serialized)                           //daca nu provine dintr-o serializare initializez pixelii de pornire. ba nu. la deserializare mereu fac render
        for (int i = 0; i<threadsNr; i++)          
            startPixels[i] = width * height * i / threadsNr;
 
        //serialized = false;
        for (int i = 0; i < threadsNr; i++) {
            threads[i] = new AreaPainter(i, realX, realY, startPixels[i], width * height * (i + 1) / threadsNr, zExp, cExp, maxIteration, fType, cReal, cImag);
                fut[i] = es.submit(threads[i]);
        }


        for (int i = 0; i < threadsNr; i++) {
                try {
                    fut[i].get();
                } catch (InterruptedException ex) {
                    //Logger.getLogger(FormulaFractal.class.getName()).log(Level.SEVERE, null, ex);
                    /*for (int j = 0; j < threadsNr; j++)
                    {
                        fut[j].cancel(true);
                    }*/
                    es.shutdownNow();
                    System.out.println("m-a intrerupt :(");
                    
                    serialize();
                    break;
                } catch (ExecutionException ex) {
                    Logger.getLogger(FormulaFractal.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        //long t2 = System.currentTimeMillis();
        //System.out.println(t2 - t1);

        return new FractalRenderer.RenderOps(FractalRenderer.RenderType.POINTS, x, y, rgb);
    }

    public FractalRenderer.RenderOps render(RenderConf conf) {

        //long t1 = System.currentTimeMillis();

        //initializez totul; mai putin daca obiectul a fost obtinut dintr-o deserializare
        //sau daca width si height fusesera deja initializate(?nu stiu, pt resize de ex) si deci si restul...
        if (!serialized || width != conf.canvasWidth || height!= conf.canvasHeight) {
            width = conf.canvasWidth;
            height = conf.canvasHeight;

            x = new int[width * height];
            y = new int[width * height];
            rgb = new int[width * height];

            realX = new double[width * height];
            realY = new double[width * height];

            for (int i = 0; i<threadsNr; i++) {
                startPixels[i] = (int)Math.ceil(width * height * i / threadsNr);


                   serialized = false;
            int px = 0;
            int xCoord = 0;
            while (px < width * height) {
                for (int yCoord = 0; yCoord < height; yCoord++) {
                    rgb[px] = 255;
                    x[px] = xCoord;
                    y[px++] = yCoord;
                }
                xCoord++;
            }
            double transfXIndex = (conf.maxRealX - conf.minRealX) / width;
            double transfYIndex = (conf.maxRealY - conf.minRealY) / height;
            for (px = 0; px < width * height; px++) {
                double yy = height - y[px] - 1;
                realX[px] = transfXIndex * x[px] + conf.minRealX;
                realY[px] = transfYIndex * yy + conf.minRealY;
            }
        }  //pan aici
            }
        for (int i = 0; i < threadsNr; i++) {
            threads[i] = new AreaPainter(i, realX, realY, startPixels[i], width * height * (i + 1) / threadsNr, zExp, cExp, maxIteration, fType, cReal, cImag);
                fut[i] = es.submit(threads[i]);
        }

        
        for (int i = 0; i < threadsNr; i++) {
                try {
                    fut[i].get();
                } catch (InterruptedException ex) {
                    /*for (int j = 0; j < threadsNr; j++)
                    {
                          fut[j].cancel(true);
                    }*/
                    es.shutdownNow();
                    System.out.println("m-a intrerupt :(");
                    serialize();
                    break;
                    
                    
                   // Logger.getLogger(FormulaFractal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(FormulaFractal.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
         

        //long t2 = System.currentTimeMillis();
        //System.out.println(t2 - t1);

        System.out.println("start pixels right before draw:");
                for (int i = 0; i<threadsNr; i++) System.out.println(startPixels[i]);

        return new FractalRenderer.RenderOps(FractalRenderer.RenderType.POINTS, x, y, rgb);
    }

    int colorFunction(int fcNr, int it, double xRe, double xIm) {
        int color;
        int b, r, g, fact;
        double term;
        switch (fcNr) {
            case 1:                                                 //merge bine la julia
                term = (Math.log(Math.sqrt(xRe * xRe + xIm * xIm)) / Math.log(100000000));
                b = 0;
                g = (1 << 8);
                r = (1 << 8 << 8);
                fact = it * 2 + 20; //fact=10;

                fact = b + fact * 6 + g * (fact + 10) + r * (fact - 20);

                color = (int) (fact - (int) (Math.log(term) / Math.log(2)));
                //color = fact;
                break;

            case 2:                                                 //merge bine la mandelbrot;
                term = (Math.log(Math.sqrt(xRe * xRe + xIm * xIm)) / Math.log(100000000));
                b = 1 << 8;
                g = b << 8;
                r = g << 8;
                fact = it;
                fact = b - 1 + fact * 12 + g - 1 + b * fact * 4 + r - 1 + g * fact * 2;
                color = -(int) (fact - (int) (Math.log(term) / Math.log(2)));
                break;


            case 3:
                color = (int) (2 * Math.sqrt(xRe * xRe + xIm * xIm) / xRe / Math.log(Math.sqrt(xRe * xRe + xIm * xIm)));      //nu e deloc ce trebuie, dar iese o chestie atat de uuu. daca...pun ca ultim parametru, acolo, z
                break;
          
            case 4:
                //e mai cmooth, mai ca juliilede pe net
                term = (Math.log(Math.sqrt(xRe * xRe + xIm * xIm))/Math.log(100000000));
                int ter = (int) (Math.log (term)/Math.log(2));
                r = g = b = 1;

                b = (b + (it + 65)%255 - ter*it/256)%255;
                r = (r + (it + 25)%255 - ter*it/256)%255;
                g = (g + (it + 30)%255 - ter*it/256)%255;

                color = b + (g<<8) + (r<<8<<8);
               
                break;

            case 5:
                //-2
                term = (Math.log(Math.sqrt(xRe * xRe + xIm * xIm)) / Math.log(100000000));
                b = 1 << 8;
                g = b << 8;
                r = g << 8;
                fact = it;
                fact = b - 1 + fact * 12 + g - 1 + b * fact * 4 + r - 1 + g * fact * 2;
                color = (int) (fact - (int) (Math.log(term) / Math.log(2)));
                break;

            default:
                color = -1;
                break;
        }
        return color;
    }

    protected void serialize() {                                //sa golesc fisierul cand inchid tot? sau dupa ce deserializez. ca sa nu generez dupa aia iar aceeasi porcarie

        serialized = true;

        ObjectOutputStream inSt = null;
        try
        {
            inSt = new ObjectOutputStream(new FileOutputStream(serializePath));
             System.out.println("start pixels at serialization:");
                for (int i = 0; i<10; i++) System.out.println(startPixels[i]);
            inSt.writeObject(this);
            System.out.println("start pixels at serialization 2:");
                for (int i = 0; i<10; i++) System.out.println(startPixels[i]);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Fisier invalid.");
        }
         catch (IOException e)
        {
            System.out.println("Exceptie io " + e.getMessage());
        }
        finally
        {
            try
            {
                if (inSt!=null) inSt.close();
            }
            catch (IOException e)
            {
                System.out.println("naspa");
            }
        }
    }

    public Fractal deserialize() {

        ObjectInputStream inSt = null;
        FormulaFractal fr = null;
        try
        {
            inSt = new ObjectInputStream(new FileInputStream(deserializePath));
            fr = (FormulaFractal)inSt.readObject();
            System.out.println("start pixels at deserialization 2:");
                for (int i = 0; i<threadsNr; i++) System.out.println(startPixels[i]);

            for (int i = 0;i<width*height; i++)
                rgb[i] = 0;
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(FormulaFractal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Fisier invalid.");
        }
         catch (IOException e)
        {
            System.out.println("Exceptie io" + e.getMessage());
        }
        finally
        {
            try
            {
                if (inSt!=null) inSt.close();
            }
            catch (IOException e)
            {
                System.out.println("naspa");
            }
        }
       
        return fr;

    }

  private void readObject(java.io.ObjectInputStream stream)
     throws IOException, ClassNotFoundException
  {
    stream.defaultReadObject();
    threads = new AreaPainter[threadsNr];
    es = Executors.newFixedThreadPool(threadsNr);
    fut = new Future[threadsNr];
    System.out.println("start pixels at deserialization:");
                for (int i = 0; i<threadsNr; i++) System.out.println(startPixels[i]);
    serialized = true;
}

    class AreaPainter implements Runnable
    {

        private int myNr;
        private int pxStart, pxEnd;
        private double[] realX, realY;
        private int[] zExp2;
        private int cExp2;
        private int maxIteration2;
        private double cReal2 = 0, cImag2 = 0;
        //private int[] rgb2;
        private formulaType fType2;

        AreaPainter(int nr, double[] realX, double[] realY, int pxStart, int pxEnd, int zExp[], int cExp, int maxIteration, formulaType fType, double cRe, double cIm) {
            init(nr, realX, realY, pxStart, pxEnd, zExp, cExp, maxIteration,
                    fType, cRe, cIm);
        }

        void init(int nr, double[] realX, double[] realY, int pxStart, int pxEnd, int zExp[], int cExp, int maxIteration, formulaType fType, double cRe, double cIm) {

            myNr = nr;
            this.pxStart = pxStart;
            this.pxEnd = pxEnd;
            this.realX = realX;
            this.realY = realY;

            this.zExp2 = zExp;
            this.cExp2 = cExp;
            this.maxIteration2 = maxIteration;
            this.fType2 = fType;
            this.cReal2 = cReal;
            this.cImag2 = cImag;

        }

        public void julia() {
            double zRe = 0, zIm = 0;
            double cRe = cReal2, cIm = cImag2;
            int pow;
            double tmp;
            double zToPowRe = 0, zToPowIm = 0, cToPowRe = 0, cToPowIm = 0, zSumRe = 0, zSumIm = 0;


            for (int px = pxStart; px < pxEnd && !Thread.interrupted(); px++) {
                  
                    zRe = realX[px];
                    zIm = realY[px];

                    //calcularea lui c la putere. el nu se schimba, deci pot sa il fac direct aici
                    cToPowRe = cRe;
                    cToPowIm = cIm;
                    pow = cExp2;
                    while (pow > 1) {
                        if (pow % 2 == 0) {
                            tmp = cToPowRe * cToPowRe - cToPowIm * cToPowIm;
                            cToPowIm = 2 * cToPowRe * cToPowIm;
                            cToPowRe = tmp;
                            pow /= 2;
                        } else {
                            tmp = cToPowRe * cRe - cToPowIm * cIm;
                            cToPowIm = cToPowRe * cIm + cToPowIm * cRe;
                            cToPowRe = tmp;
                            pow--;
                        }
                    }
                    if(!cSgn) {
                        cToPowIm = - cToPowIm;
                        cToPowRe = - cToPowRe;
                    }

                int iteration = 0;

                while (((zRe * zRe + zIm * zIm) <= 2 * 2) && (iteration < maxIteration2)) {
                    //calcularea formuleii z^zexp[] + z^cexp

                    //z la puteri
                    zSumRe = zSumIm = 0;
                    for (int i = 0; i < zExp2.length; i++) 
                    {
                        double zRe2 = zRe, zIm2 = zIm;
                        zToPowRe = zRe2;
                        zToPowIm = zIm2;
                        pow = zExp2[i] - 1;
                        while (pow >= 1) {
                            if (pow % 2 == 0) {
                                tmp = zRe2 * zRe2 - zIm2 * zIm2;
                                zIm2 = 2 * zRe2 * zIm2;
                                zRe = tmp;
                                pow /= 2;
                            } else {
                                tmp = zToPowRe * zRe2 - zToPowIm * zIm2;
                                zToPowIm = zToPowRe * zIm2 + zToPowIm * zRe2;
                                zToPowRe = tmp;
                                pow--;
                            }
                        }
                        if(!zSgn[i]) {
                            zToPowRe = - zToPowRe;
                            zToPowIm = - zToPowIm;
                        }
                        zSumRe += zToPowRe;
                        zSumIm += zToPowIm;
                    }

                    //formula propriu-zisa
                    zRe = zSumRe + cToPowRe;
                    zIm = zSumIm + cToPowIm;

                    iteration++;
                }

                //colorarea
                pixelPainter(px, iteration, zRe, zIm, fcNr);
                startPixels[myNr] = px + 1;  //ii trebuie aici o marja, poate trebuie calculata mai profesionist

            }
        }

        public void mandelbrot() {
            double zRe = 0, zIm = 0;
            double cRe = cReal2, cIm = cImag2;
            int pow;
            double tmp;
            double zToPowRe = 0, zToPowIm = 0, cToPowRe = 0, cToPowIm = 0, zSumRe = 0, zSumIm = 0;


            for (int px = pxStart; px < pxEnd && !Thread.interrupted(); px++) {
              

                cRe = realX[px];
                cIm = realY[px];

                zRe = zIm = 0;

                int iteration = 0;

                calc: while (((zRe * zRe + zIm * zIm) <= 2 * 2) && (iteration < maxIteration2)) {
                    //calcularea formuleii z^zexp[] + z^cexp
                    
                    //z la puteri
                    zSumRe = zSumIm = 0;
                    for (int i = 0; i < zExp2.length; i++) 
                    {
                        double zRe2 = zRe, zIm2 = zIm;
                        zToPowRe = zRe2;
                        zToPowIm = zIm2;
                        pow = zExp2[i] - 1;
                        while (pow >= 1) {
                            if (pow % 2 == 0) {
                                tmp = zRe2 * zRe2 - zIm2 * zIm2;
                                zIm2 = 2 * zRe2 * zIm2;
                                zRe2 = tmp;
                                pow /= 2;
                            } else {
                                tmp = zToPowRe * zRe2 - zToPowIm * zIm2;
                                zToPowIm = zToPowRe * zIm2 + zToPowIm * zRe2;
                                zToPowRe = tmp;
                                pow--;
                            }
                        }
                        if(!zSgn[i]) {
                            zToPowRe = - zToPowRe;
                            zToPowIm = - zToPowIm;
                        }
                        zSumRe += zToPowRe;
                        zSumIm += zToPowIm;
                    }


                    //c la putere, dc e mandelbrot
                    cToPowRe = cRe;
                    cToPowIm = cIm;
                    pow = cExp2;
                    while (pow > 1) {
                        if (pow % 2 == 0) {
                            tmp = cToPowRe * cToPowRe - cToPowIm * cToPowIm;
                            cIm = 2 * cRe * cIm;
                            cRe = tmp;
                            pow /= 2;
                        } else {
                            tmp = cToPowRe * cRe - cToPowIm * cIm;
                            cToPowIm = cToPowRe * cIm + cToPowIm * cRe;
                            cToPowRe = tmp;
                            pow--;
                        }
                    }
                    if(!cSgn) {
                        cToPowIm = - cToPowIm;
                        cToPowRe = - cToPowRe;
                    }

                    //formula propriu-zisa
                    zRe = zSumRe + cToPowRe;
                    zIm = zSumIm + cToPowIm;

                    iteration++;
                }

                //colorarea

                
                pixelPainter(px, iteration, cRe, cIm, fcNr);
                startPixels[myNr] = px + 1;

            }
        }

        public void run() {
            if (fType2 == formulaType.JULIA) {
                julia();
            } else {
                mandelbrot();
            }
        }

        private void pixelPainter(int pixel, int iteration, double xRe, double xIm, int colorNr) {
            if (iteration == maxIteration2) {
                rgb[pixel] = 0;
            } else {
                rgb[pixel] = colorFunction(colorNr, iteration, xRe, xIm);
            }

        }
    }
}
