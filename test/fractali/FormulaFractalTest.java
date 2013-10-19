/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fractali;

import fractali.Fractal.RenderConf;
import fractali.FractalRenderer.RenderOps;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
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
public class FormulaFractalTest {

    public FormulaFractalTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    /**
     * Test of zoomTo method, of class FormulaFractal.
     */
    @Test
    public void testZoomTo() {
        double[] coords = {-2.1, 2.1, -2.1, 2.1};
        int powers[] = {2};
        boolean[] theTruth = {true};
        Fractal f = new FormulaFractal(powers, theTruth, 1, true,
                FormulaFractal.formulaType.MANDELBROT);
        Fractal.RenderConf c = new Fractal.RenderConf(coords[0], coords[1],
                coords[2], coords[3], 50, 50);
        FractalRenderer.RenderOps ops = f.render(c);

        double[] coords2 = {-2.5, 2.5, 2.5, 2.5};
        c = new Fractal.RenderConf(coords2[0], coords2[1], coords2[2],
                coords2[3], 50, 50);
        f.render(c);
        c = new Fractal.RenderConf(coords[0], coords[1], coords[2], coords[3],
                50, 50);
        FractalRenderer.RenderOps ops2 = f.zoomTo(c);

        assertArrayEquals(ops.x, ops2.x);
        assertArrayEquals(ops.y, ops2.y);
        assertArrayEquals(ops.rgb, ops2.rgb);
    }

    /**
     * Test of render method, of class FormulaFractal.
     */
    @Test
    public void testRender() {
        double[] coords = {-0.1, 0.1, -0.1, 0.1};

        int powers[] = {2};
        boolean[] theTruth = {true};
        Fractal f = new FormulaFractal(powers, theTruth, 1, true,
                FormulaFractal.formulaType.MANDELBROT);
        Fractal.RenderConf c = new Fractal.RenderConf(coords[0], coords[1],
                coords[2], coords[3], 20, 20);
        FractalRenderer.RenderOps ops = f.render(c);
        for(int i=0; i<ops.rgb.length; i++) {
            assertEquals(0, ops.rgb[i]);
        }
    }

    /**
     * Test of serialize method, of class FormulaFractal.
     */
    @Test
    public void testSerialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        double[] coords = {-0.1, 0.1, -0.1, 0.1};

        int powers[] = {2};
        boolean[] theTruth = {true};
        Fractal f = new FormulaFractal(powers, theTruth, 1, true,
                FormulaFractal.formulaType.MANDELBROT);
        Fractal.RenderConf c = new Fractal.RenderConf(coords[0], coords[1],
                coords[2], coords[3], 120, 120);
        FractalRenderer.RenderOps ops = f.render(c);

        String path = "gogu.gigi";
        f.setSerializePath(path);
        f.serialize();

        ObjectInputStream oos = new ObjectInputStream(new FileInputStream(
                new File(path)));
        f = (FormulaFractal) oos.readObject();
        FractalRenderer.RenderOps ops2 = f.render(c);

        assertArrayEquals(ops.x, ops2.x);
        assertArrayEquals(ops.y, ops2.y);
        assertArrayEquals(ops.rgb, ops2.rgb);
    }

}