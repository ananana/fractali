package fractali;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Se ocupa de desenat. Un wrapper destul de subtirel in jurul unui Canvas si al
 * unui BufferedImage. Canvasul e componenta care se afiseaza propriu-zis, 
 * BufferedImage-ul e folosit pentru a seta efectiv pixelii imaginii, ceea ce 
 * unii fractali au nevoie si un Graphics nu poate face.
 *
 * @author Razvan
 */
public class FractalRenderer extends Canvas{

    /**
     * Imagine care contine pixelii propriu-zisi
     */
    private BufferedImage img;
    /**
     * Picteaza pe <code> img </img>
     */
    private Graphics painter;

    private int selectionX, selectionY, selectionWidth, selectionHeight;
    private boolean hasSelection = false;

    /**
     * Creeaza un canvas si un BufferedImage cu dimensiunile specificate si 
     * initializeaza cu un fundal alb.
     * 
     * @param width latimea
     * @param height inaltimea
     */
    public FractalRenderer(int width, int height) {
        setSize(width, height);
        setPreferredSize(new Dimension(width, height));
        setMinimumSize(new Dimension(width, height));
        setImageSize(width, height);
        clear();
    }

    public void setImageSize(int width, int height) {
        if(width <=0 || height <= 0) return;
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        painter = img.createGraphics();
    }

    public void clear() {
        painter.setColor(Color.black);
        painter.fillRect(0, 0, img.getWidth(), img.getHeight());
        repaint();
    }

    /**
     * Apelat la prima afisare a Canvasului. Initializeaza cu un fundal alb.
     * @param g
     */
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(img, 0, 0, this);
        if(hasSelection) {
            g.setColor(Color.white);
            g.drawRect(selectionX, selectionY, selectionWidth, selectionHeight);
        }
    }

    /**
     * Apelat la repaint(). Picteaza pe canvas imaginea.
     */
    public void update(Graphics g) {
        g.drawImage(img, 0, 0, this);
        if(hasSelection) {
            g.setColor(Color.white);
            g.drawRect(selectionX, selectionY, selectionWidth, selectionHeight);
        }
    }

    /**
     * Primeste un RenderOps care ii spune ce sa deseneze si apeleaza
     * metodele adecvate pentru a modifica imaginea, apoi apeleaza 
     * <code> repaint() </code>.
     *
     * Cand <code> ops.type </code> este <code> POINTS </code>, deseneaza pe
     * rand pixelii de coordonate <code> x[i], y[i] </code>.
     *
     * Cand este <code> POLYLINE </code> deseneaza o linie de la
     * <code> x[i], y[i] </code> la <code> x[i+1], y[i+1] </code>, apoi de la
     * <code> x[i+1], y[i+1] </code> la <code> x[i+2], y[i+2] </code> etc.
     *
     * Cand este <code> POLYLINE </code> deseneaza o linie de la
     * <code> x[i], y[i] </code> la <code> x[i+1], y[i+1] </code>, apoi de la
     * <code> x[i+2], y[i+2] </code> la <code> x[i+3], y[i+3] </code> etc.
     * 
     * @param ops ce deseneaza
     * @see RenderOps
     */
    public void executeOps(RenderOps ops) {            //de verificat si cum sunt x si y fata de width si height?
        if(ops == null) return;
        int[] x = ops.x;
        int[] y = ops.y;
        int[] rgb = ops.rgb;
        if(x == null || y == null || rgb == null) return;
        if(x.length != y.length) return;
        switch(ops.type) {
            case POINTS: //pixel cu pixel
                if(rgb.length < x.length) return;
                for(int i=0; i<x.length; i++){
                    try {
                    img.setRGB(x[i], y[i], rgb[i]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("DUDE, WTF? " + x[i] + ", " + y[i]);
                    }
                }
                //System.out.println("POINTS");
                break;
            case POLYLINE: //linii lipite
                if(rgb.length == 0) return;
                painter.setColor(new Color(rgb[0]));
                painter.drawPolyline(x, y, x.length);
                System.out.println("POLYLINE");
                break;
            case LINES: //linii separate
                if(rgb.length < x.length / 2) return;
                for(int i=0; i<x.length - 1; i+=2) {
                    painter.setColor(new Color(rgb[i/2]));
                    painter.drawLine(x[i], y[i], x[i+1], y[i+1]);
                }
                break;
        }
        repaint();
    }

    void setSelection(int pxx1, int pxy1, int w, int h) {
        if(pxx1 < 0 || pxy1 < 0 || pxx1 > getWidth() || pxy1 > getHeight()
                || w < 0 || h < 0 || w + pxx1 > getWidth()
                || h + pxy1 > getHeight()) return;
        hasSelection = true;
        selectionX = pxx1;
        selectionY = pxy1;
        selectionWidth = w;
        selectionHeight = h;
        repaint();
    }

    void resetSelection() {
        hasSelection = false;
        repaint();
    }

    void saveToFile(String extension, String path) throws IOException {
        ImageIO.write(img, extension, new File(path));
    }

    /**
     * Cum desenez: pixeli individuali, linii lipite sau linii potential
     * discontinue
     */
    public enum RenderType { POINTS, POLYLINE, LINES };
    /**
     * Clasa care tine o secventa de instructiuni grafice.
     * Folosita de metoda <code> executeOps </code> a lui <code> Fractal </code>.
     * @see Fractal
     */
    public static class RenderOps {
        RenderType type;
        int [] x, y, rgb;
        public RenderOps(RenderType type, int[] x, int[] y, int[] rgb) {
            this.type = type;
            this.x = x;
            this.y = y;
            this.rgb = rgb;
        }
    }
}
