package fractali;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Clasa Main, doar afiseaza fereastra aplicatiei.
 *
 * @author Razvan
 */
public class Main {

    /**
     * Creeaza fereastra principala si o afiseaza.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                setLAF();
                FractalFrame ff = new FractalFrame();
                ff.setVisible(true);
                ff.mandelbrot();
            }
        });

        //variante de julia, respectiv mandelbrot:

        //ff.julia(0.285, 0);
        //ff.julia(-0.4, 0.6);
        //ff.julia(-0.835, -0.2321);
        //ff.julia(-0.70176, -0.3842);
        //ff.julia(0.285, 0.01);        //cel mai dragut
        //ff.julia(0, 1);
        //ff.julia(-0.8, 0.156);
        //ff.julia(-1, 0);

        //ff.mandelbrot();


        //ff.testParsing();
    }

    /**
     * Incearca sa seteze aspectul nativ pentru butoane, meniuri si alte cele.
     * In cazul (cam imposibil) in care nu se poate, incearca sa seteze aspectul
     * intitulat Nimbus, care ar trebui sa vina cu Javele mai noi. Daca nici
     * asta nu se poate, renunta si se lasa in mana a ce o fi default (probabil
     * ca batranul Metal).
     */
    public static void setLAF() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            try {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,
                        ex);
                UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,
                        ex1);
            } catch (InstantiationException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,
                        ex1);
            } catch (IllegalAccessException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,
                        ex1);
            } catch (UnsupportedLookAndFeelException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,
                        ex1);
            }
        }
    }
}
