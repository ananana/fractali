/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fractali;

import fractali.FractalRenderer.RenderOps;
import fractali.FractalRenderer.RenderType;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Razvan
 */
public class FractalRendererTest {

    private FractalRenderer fr;

    public FractalRendererTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        fr = new FractalRenderer(300, 200);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setImageSize method, of class FractalRenderer.
     */
    @Test
    public void testSetImageSize() {
        System.out.println("setImageSize");
        int width = 0;
        int height = 0;
        fr.setImageSize(width, height);
    }

    /**
     * Test of clear method, of class FractalRenderer.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        fr.clear();
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(), 
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<img.getWidth(); i++) {
            for(int j=0; j<img.getHeight(); j++) {
                assertEquals(Color.black, new Color(img.getRGB(i, j)));
            }
        }
    }

    /**
     * Test of executeOps method, of class FractalRenderer.
     */
    @Test
    public void testExecuteOpsPoints() {
        System.out.println("executeOps - POINTS");
        int[] x = {2, 2, 2, 2};
        int[] y = {2, 5, 9, 13};
        int[] rgb = {12, 17, 21, 35};
        RenderOps ops = new RenderOps(RenderType.POINTS, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<x.length; i++) {
            int pixel = img.getRGB(x[i], y[i]);
            int red = (pixel >> 16) & 0xff;
            int green = (pixel >> 8) & 0xff;
            int blue = (pixel) & 0xff;
            int col = (red << 16) | (green << 8) | blue;
            assertEquals(rgb[i], col);
        }
    }

    @Test
    public void testExecuteOpsLines() {
        System.out.println("executeOps - LINES");
        int[] x = {2, 2, 2, 2};
        int[] y = {2, 5, 9, 13};
        int[] rgb = {12, 17};
        RenderOps ops = new RenderOps(RenderType.LINES, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<x.length-1; i+=2) {
            int pixel = img.getRGB((x[i]+x[i+1])/2, (y[i]+y[i+1])/2);
            int red = (pixel >> 16) & 0xff;
            int green = (pixel >> 8) & 0xff;
            int blue = (pixel) & 0xff;
            int col = (red << 16) | (green << 8) | blue;
            assertEquals(rgb[i/2], col);
        }
    }

    @Test
    public void testExecuteOpsPolyline() {
        System.out.println("executeOps - POLYLINE");
        int[] x = {2, 2, 2, 2};
        int[] y = {2, 5, 9, 13};
        int[] rgb = {12};
        RenderOps ops = new RenderOps(RenderType.POLYLINE, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<x.length-1; i+=2) {
            int pixel = img.getRGB((x[i]+x[i+1])/2, (y[i]+y[i+1])/2);
            int red = (pixel >> 16) & 0xff;
            int green = (pixel >> 8) & 0xff;
            int blue = (pixel) & 0xff;
            int col = (red << 16) | (green << 8) | blue;
            assertEquals(rgb[0], col);
        }
    }

    @Test
    public void testExecuteOpsPointsWrong() {
        System.out.println("executeOps - POINTS wrong");
        fr.clear();
        int[] x = {2, 2, 2, 2};
        int[] y = {2, 5, 9, 13};
        int[] rgb = {12};
        RenderOps ops = new RenderOps(RenderType.POINTS, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<img.getWidth(); i++) {
            for(int j=0; j<img.getHeight(); j++) {
                assertEquals(Color.black, new Color(img.getRGB(i, j)));
            }
        }
    }

    @Test
    public void testExecuteOpsWrong() {
        System.out.println("executeOps - wrong");
        int[] x = {2, 2, 2, 2};
        int[] y = {2, 9, 13};
        int[] rgb = {12};
        RenderOps ops = new RenderOps(RenderType.POLYLINE, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<img.getWidth(); i++) {
            for(int j=0; j<img.getHeight(); j++) {
                assertEquals(Color.black, new Color(img.getRGB(i, j)));
            }
        }
    }

    @Test
    public void testExecuteOpsLinesWrong() {
        System.out.println("executeOps - LINES - wrong");
        int[] x = {2, 2, 2, 2};
        int[] y = {2, 5, 9, 13};
        int[] rgb = {12};
        RenderOps ops = new RenderOps(RenderType.LINES, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<img.getWidth(); i++) {
            for(int j=0; j<img.getHeight(); j++) {
                assertEquals(Color.black, new Color(img.getRGB(i, j)));
            }
        }
    }

    /**
     * Test of setSelection method, of class FractalRenderer.
     */
    @Test
    public void testSetSelection() {
        System.out.println("setSelection");
        int pxx1 = 3;
        int pxy1 = 5;
        int w = 10;
        int h = 100;
        fr.setSelection(pxx1, pxy1, w, h);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
        BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        int pixel = img.getRGB(pxx1 + w / 2, pxy1);
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
        int col = (red << 16) | (green << 8) | blue;
        assertEquals(Color.white, new Color(col));
    }

    @Test
    public void testSetSelectionWrong() {
        fr.clear();
        System.out.println("setSelection - wrong");
        int pxx1 = -3;
        int pxy1 = 5;
        int w = -10;
        int h = 100;
        fr.setSelection(pxx1, pxy1, w, h);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
        BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<img.getWidth(); i++) {
            for(int j=0; j<img.getHeight(); j++) {
                assertEquals(Color.black, new Color(img.getRGB(i, j)));
            }
        }
    }

    /**
     * Test of resetSelection method, of class FractalRenderer.
     */
    @Test
    public void testResetSelection() {
        System.out.println("resetSelection");
        fr.resetSelection();
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
        BufferedImage.TYPE_INT_RGB);
        fr.paint(img.getGraphics());
        for(int i=0; i<img.getWidth(); i++) {
            for(int j=0; j<img.getHeight(); j++) {
                assertEquals(Color.black, new Color(img.getRGB(i, j)));
            }
        }
    }

    /**
     * Test of saveToFile method, of class FractalRenderer.
     */
    @Test
    public void testSaveToFile() throws Exception {
        fr.clear();
        System.out.println("saveToFile");
        int[] x = {2, 2, 2, 2, 64};
        int[] y = {2, 5, 9, 13, 56};
        int[] rgb = {12};
        RenderOps ops = new RenderOps(RenderType.POLYLINE, x, y, rgb);
        fr.executeOps(ops);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        String extension = "bmp";
        String path = File.createTempFile("gogu", "."+extension).getPath();
        fr.paint(img.getGraphics());
        fr.saveToFile(extension, path);
        BufferedImage saved = ImageIO.read(new File(path));
        for(int i=0; i<saved.getWidth(); i++) {
            for(int j=0; j<saved.getHeight(); j++) {
                assertEquals(saved.getRGB(i, j), img.getRGB(i, j));
            }
        }
    }

}