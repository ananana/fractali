/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fractali;

import fractali.Fractal.RenderConf;
import fractali.FractalRenderer.RenderOps;
import fractali.FractalRenderer.RenderType;
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
public class LSystemFractalTest {

    public LSystemFractalTest() {
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
     * Test of render method, of class LSystemFractal.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        LSystemFractal f = new LSystemFractal("F", new String[]{"F"},
                new String[]{"F"}, 90);
        int w = 300,h = 300;
        FractalRenderer.RenderOps ops = f.render(new RenderConf(w, h, 14));
        assertEquals(RenderType.POLYLINE, ops.type);
        assertEquals(2, ops.x.length);
        assertEquals(2, ops.y.length);
        assertEquals(ops.y[0], ops.y[1]);
    }

    /**
     * Test of zoomTo method, of class LSystemFractal.
     */
    @Test
    public void testZoomTo() {
        System.out.println("zoomTo");
        System.out.println("render");
        LSystemFractal f = new LSystemFractal("F", new String[]{"F"},
                new String[]{"/F\\F"}, 90);
        int w = 300,h = 300;
        FractalRenderer.RenderOps ops = f.render(new RenderConf(w, h, 4));
        f.zoomTo(new RenderConf(w, h, 6));
        FractalRenderer.RenderOps ops2 = f.zoomTo(new RenderConf(w, h, 4));
        assertArrayEquals(ops.x, ops2.x);
        assertArrayEquals(ops.y, ops2.y);
        assertArrayEquals(ops.rgb, ops2.rgb);
    }

    @Test
    public void testRenderNegativeIters() {
        System.out.println("render");
        LSystemFractal f = new LSystemFractal("F", new String[]{"F"},
                new String[]{"F"}, 90);
        int w = 300,h = 300;
        FractalRenderer.RenderOps ops = f.render(new RenderConf(w, h, -14));
        assertEquals(null, ops);
    }

}