package fractali;

import java.io.Serializable;

/**
 * Clasa care contine descrierea unui fractal si poate, la cerere, sa il picteze
 * (de fapt, sa returneze o secventa de instructiuni care duc la pictarea lui). 
 * Clasa abstracta, va avea 3 subclase pentru cele 3 tipuri.
 *
 * @author Razvan
 */
public abstract class Fractal implements Serializable{
    public enum FractalType {IFS, LSYSTEM, FORMULA};

    /**
     * Tipul fractalului. Constructorii claselor fiu ar trebui sa-l seteze in
     * mod adecvat.
     */
    protected FractalType type;

    /**
     * @return tipul fractalului (IFS, L-sistem, formula)
     */
    public FractalType getType() {
        return type;
    }

    /**
     * Face calculele necesare pentru a ajunge de la o descriere (oarescum
     * abstracta) a fractalului data de membri la ce instructiuni grafice ar
     * trebui executate pentru a fi desenat efectiv.
     *
     * @param conf parametri desenarii. Nu toti membrii clasei vor fi utili in
     *             toate cazurile, de pilda fractalii cu L-systems nu au
     *             notiunea de "partea planului care trebuie reprezentata".
     * @return obiect care ii spune unui FractalRenderer ce sa deseneze
     * @see FractalRenderer
     * @see RenderConf
     */
    public abstract FractalRenderer.RenderOps render(RenderConf conf);
    public abstract FractalRenderer.RenderOps zoomTo(RenderConf conf);
    protected String serializePath;
    public void setSerializePath(String serializePath) {
        this.serializePath = serializePath;
    }
    protected String deserializePath;

    public void setDeserializePath(String deserializePath) {
        this.deserializePath = deserializePath;
    }
    protected abstract void serialize();
    public abstract Fractal deserialize();

    public abstract double getPercentageDone();

    protected int fcNr = 2;

    public void setFcNr(int fcNr) {
        this.fcNr = fcNr;
    }

    /**
     * Descrie parametrii de care are nevoie fractalul pentru a se desena.
     */
    public static class RenderConf {
        /**
         * Marginile de pe axa Ox ale bucatii de plan care trebuie reprezentata.
         */
        protected double minRealX, maxRealX;
        /**
         * Marginile de pe axa Oy ale bucatii de plan care trebuie reprezentata.
         */
        protected double minRealY, maxRealY;
        /**
         * Dimensiunile in pixeli ale canvasului pe care se face desenarea.
         */
        protected int canvasWidth, canvasHeight;
        /**
         * Numarul de iteratii (ce inseamna exact asta depinde si de tipul de
         * fractal)
         */
        protected int iters;
        /**
         * Constructor trivial.
         *
         * @param minRealX cea mai mica coordonata de pe axa Ox din bucata de
         *                 plan de reprezentat
         * @param maxRealX cea mai mare coordonata de pe axa Ox din bucata de
         *                 plan de reprezentat
         * @param minRealY cea mai mica coordonata de pe axa Oy din bucata de
         *                 plan de reprezentat
         * @param maxRealY cea mai mica coordonata de pe axa Oy din bucata de
         *                 plan de reprezentat
         * @param canvasWidth latimea in pixeli a canvasului
         * @param canvasHeight inaltimea in pixeli a canvasului
         * @param iters numarul de iteratii
         */
        public RenderConf(double minRealX, double maxRealX, double minRealY,
                double maxRealY, int canvasWidth, int canvasHeight, int iters) {
            this.minRealX = minRealX;
            this.maxRealX = maxRealX;
            this.minRealY = minRealY;
            this.maxRealY = maxRealY;
            this.canvasWidth = canvasWidth;
            this.canvasHeight = canvasHeight;
            this.iters = iters;
        }
        
        /**
         * Constructor pentru cazurile cand nu se reprezinta o bucata din R2.
         * 
         * @param canvasWidth latimea in pixeli a canvasului
         * @param canvasHeight inalitimea in pixeli a canvasului
         * @param iters numarul de iteratii
         */
        public RenderConf(int canvasWidth, int canvasHeight, int iters) {
            this.canvasWidth = canvasWidth;
            this.canvasHeight = canvasHeight;
            this.iters = iters;
        }
        
        public RenderConf(double minRealX, double maxRealX, double minRealY, double maxRealY, int canvasWidth, int canvasHeight)
        {
            this.minRealX = minRealX;
            this.maxRealX = maxRealX;
            this.minRealY = minRealY;
            this.maxRealY = maxRealY;
            this.canvasWidth = canvasWidth;
            this.canvasHeight = canvasHeight;
        }
    }
}
