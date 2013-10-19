package fractali;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URISyntaxException;
import javax.swing.filechooser.FileFilter;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.MouseInputAdapter;
import org.antlr.runtime.RecognitionException;

import swingworker.SwingWorker;

/**
 * Fereastra principala a aplicatiei. Tine evidenta fractalului curent incarcat,
 * asigura comunicarea intre el si Canvas, ofera o interfata grafica. Si altele.
 *
 * @author Razvan
 */
public class FractalFrame extends JFrame {

    /**
     * Componenta care deseneaza fractalii
     */
    private FractalRenderer canvas;
    /**
     * Obiectul care reprezinta fractalul curent incarcat
     */
    private Fractal currFractal;
    private double currMinX, currMinY, currMaxX, currMaxY;
    private int currIters;

    private FractalListener fl;

    private SwingWorker worker;
    private boolean resized;

    private StatusBar statusBar;

    private enum ZoomMode {FLUID, SELECTION};
    private ZoomMode zoomMode = ZoomMode.FLUID;

    private boolean zoomed = false;
    private int fcNr = 2;

    /**
     * Pune un titlu ferestrei si apeleaza <code> initComponents </code>
     */
    public FractalFrame() {
        super("Fractali!");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit.getDefaultToolkit().setDynamicLayout(false);
        pack();
    }

    /**
     * Apeleaza metodele de initializare penru diferitele componente,
     * actualmente bara de meniuri si toolbar.
     */
    public void initComponents() {
        fl = new FractalListener(this);

        String[] menuNames = {"_File", "Fr_actals", "_View", "_Colors", "_Play", "_Help"};
        String[][] menuItems = {{"_Open", "_Save", "_Quit"},
            {"Mandelbrot", "Dendrite", "Fatboy slim", "Julia 1", "Julia 2",
                     "Julia 3", "Julia 4", "Galaxy", "Julia 6", "Koch",
                     "Area 51", "Peano", "Sierpinski", "Stairs", "Terdragon"},
            {"(+)Zoom by selection",  "(/)Fluid zoom"},
            {"_1. Scheme 1", "_2.Scheme 2", "_3.Scheme 3", "_4. Scheme 4",
                     "_5. Scheme 5"},
            {"(z)Stop", "(x)Generate",},
            {"_About"}};
        initMenuBar(menuNames, menuItems);

        String[] imgFiles = {"/imgs/save.png", "/imgs/play.png", "/imgs/pause.png",
             "/imgs/page-magnifier.png", "/imgs/zoom-best-fit.png",
        };
        String[] toolTips = {"(S)Save", "(x)Generate", "(z)Pause",
        "(/)Go into fluid zoom mode", "(+)Go into normal zoom mode"};
        initToolBar(imgFiles, toolTips);

        canvas = new FractalRenderer(320, 240);
        getContentPane().add(canvas);
        SelectAndZoom sz = new SelectAndZoom();
        canvas.addMouseListener(sz);
        canvas.addMouseMotionListener(sz);
        ClickAndZoom cz = new ClickAndZoom();
        canvas.addMouseListener(cz);
        canvas.addMouseMotionListener(cz);
        canvas.addComponentListener(new ResizeListener(this));
        setZoomMode(ZoomMode.FLUID);



        statusBar = new StatusBar();
        getContentPane().add(statusBar, BorderLayout.SOUTH);
    }

    /**
     * Creeaza o bara de meniuri si o seteaza ca bara de meniuri a aplicatiei.
     * Sirurile primite ca argumente au semnificatii speciale: daca contin '_',
     * primul caracter de dupa _ este setat ca scurtatura. De exemplu, daca
     * <code> menuNames </code> contine '_File', scurtatura ALT + F va deschide
     * meniul File. Pentru intrarile din meniuri scurtatura este
     * CTRL + caracter.
     *
     * In plus, seteaza F1 ca scurtatura pentru prima intrare din ultimul, prin
     * conventie 'Help'.
     *
     * @param menuNames: vector de nume de meniuri special formatate
     * @param menuItems: vector care asociaza fiecarui meniu o lista de intrari
     *                   date ca siruri special formatate
     */
    public void initMenuBar(String[] menuNames, String[][] menuItems) {
        JMenuBar mb = new JMenuBar();
        JMenu[] menus = new JMenu[menuItems.length];
        for (int i = 0; i < menuNames.length; i++) {
            menus[i] = new JMenu(removeShortcut(menuNames[i]));
            char s = extractShortcut(menuNames[i]);
            if (s != 0) {
                menus[i].setMnemonic(s);
            }
            //menus[i].addActionListener(fl);
            for (int j = 0; j < menuItems[i].length; j++) {
                menus[i].add(removeShortcut(menuItems[i][j]));
                char stct = extractShortcut(menuItems[i][j]);
                if (stct != 0) {
                    setShortcut(menus[i].getItem(j), stct);
                }
                menus[i].getItem(j).addActionListener(fl);
            }
            menus[i].getPopupMenu().setLightWeightPopupEnabled(false);
            mb.add(menus[i]);
            menus[i].addActionListener(fl);
        }
        setJMenuBar(mb);
    }

    /**
     * Asociaza CTRL + caracterul <code> c </code> ca scurtatura pentru intrarea
     * din meniu <code> mi </code>. De asemeni, face <code> c </code>
     * action commandul lui <code> mi </code>, ceea ce va ajuta la tratarea
     * evenimentelor (vom putea distinge ca utilizatorul a selectat mi, fie cu
     * mouse-ul, fie printr-o scurtatura). Folosit de <code> initMenuBar </code>
     */
    private void setShortcut(JMenuItem mi, char c) {
        mi.setAccelerator(KeyStroke.getKeyStroke(Character.toLowerCase(
                new Character(c))));
        mi.setActionCommand(Character.toString(c));
    }

    /**
     * Returneaza caracterul ce se vrea a fi folosit ca scurtatura din sirul
     * primit. Returneaza fie primul caracter de dupa un '_', fie al doilea
     * caracter, daca primul e '(', fie caracterul nul, cu semnificatia ca nu
     * exista scurtatura. Folosit de <code> initMenuBar </code>
     */
    private char extractShortcut(String s) {
        int pos = s.indexOf("_");
        if (pos != -1) {
            return s.charAt(pos + 1);
        }
        if (s.startsWith("(")) {
            return s.charAt(1);
        }
        return 0;
    }

    /**
     * Elimina sintaxa care defineste scurtaturi din sirul <code> s </code>,
     * obtinandu-se un sir care poate fi afisat in meniu.
     * De exemplu "_File" -> "File". Folosit de <code> initToolBar </code> si
     * <code> initMenuBar </code>.
     */
    private String removeShortcut(String s) {
        s = s.replace("_", "");
        if (s.startsWith("(")) {
            s = s.substring(3);
        }
        return s;
    }

    /**
     * Creeaza un toolbar si il adauga ferestrei. Stringurile din
     * <code> toolTips </code> contin scurtaturi, dupa acelasi format ca la
     * <code> initMenuBar </code>, care sunt setate ca action commands.
     *
     * Daca nu se poate gasi imaginea de la calea imgFiles[i], in locul ei va
     * aparea textul din toolTips[i]. In toate situatiile, textul din
     * toolTips[i] va aparea cand utilizatorul plimba mouseul deasupra
     * butonului.
     *
     * @param imgFiles vector cu cai ale imaginilor, relative la radacina
     *                 fisierului .jar (care este, de fapt, o arhiva etc.)
     * @param toolTips vector de siruri care vor fi folosite ca text alternativ
     *                 si text pentru tooltips.
     */
    public void initToolBar(String[] imgFiles, String[] toolTips) {
        JToolBar tb = new JToolBar(JToolBar.HORIZONTAL);
        for (int i = 0; i < imgFiles.length; i++) {
            JButton but = new JButton();
            char s = extractShortcut(toolTips[i]);
            if (s != 0) {
                but.setActionCommand(Character.toString(s));
            }
            toolTips[i] = removeShortcut(toolTips[i]);
            URL imageUrl = this.getClass().getResource(imgFiles[i]);
            if (imageUrl != null) {
                but.setIcon(new ImageIcon(imageUrl, toolTips[i]));
            } else {
                but.setText(toolTips[i]);
            }
            tb.add(but);
            but.addActionListener(fl);
        }
        getContentPane().add(tb, BorderLayout.NORTH);
    }

    public void openURL(URL fUrl) {
        try {
            currIters = 0;
            currFractal = ParseManager.parseURL(fUrl);
            currFractal.setFcNr(fcNr);
            zoomed = false;
            renderCurrentFractal(false, false);

        } catch (URISyntaxException ex) {
            Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RecognitionException ex) {
            Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void openFile(String fname) {
        try {
            currIters = 0;
            currFractal = ParseManager.parseFile(fname);
            currFractal.setFcNr(fcNr);
            zoomed = false;
            renderCurrentFractal(false, false);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not open file:\n" +
                    ex.getMessage(), "I/O Problem", JOptionPane.ERROR_MESSAGE);
        } catch (RecognitionException ex) {
            JOptionPane.showMessageDialog(this, "Invalid syntax in file" + fname
                    + ":\n" + ex.getMessage(), "I/O Problem",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Invalid syntax in file" + fname
                    + ":\n" + ex.getMessage(), "I/O Problem",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setRealIntervals(double[] newBounds) {
        currMinX = newBounds[0];
        currMaxX = newBounds[1];
        currMinY = newBounds[2];
        currMaxY = newBounds[3];
    }

    public void setRealIntervals(double xmin, double xmax, double ymin, double ymax) {
        currMinX = xmin;
        currMaxX = xmax;
        currMinY = ymin;
        currMaxY = ymax;
    }

    public double[] adjustToRatio(double x1, double x2, double y1, double y2) {
        double ratio = (double) canvas.getWidth() / (double) canvas.getHeight();
        double realRatio = (x2 - x1) / (y2 - y1);
        if (ratio > realRatio) {
            double moreWidth = (ratio / realRatio) * (x2 - x1) - (x2 - x1);
            x1 -= moreWidth / 2;
            x2 += moreWidth / 2;
        } else if (ratio < realRatio) {
            double moreHeight = (realRatio / ratio) * (y2 - y1) - (y2 - y1);
            y1 -= moreHeight / 2;
            y2 += moreHeight / 2;
        }
        return new double[]{x1, x2, y1, y2};
    }


    public void adjustBoundsToRatio() {
        double[] newCoords = adjustToRatio(currMinX, currMaxX, currMinY,
                currMaxY);
        setRealIntervals(newCoords);
    }

    public void setZoomMode(ZoomMode zm) {
        zoomMode = zm;
        JToolBar bar = (JToolBar)getContentPane().getComponent(0);
        JButton toSel = null, toDesel = null;
        switch(zm) {
            case FLUID:
                toSel = (JButton) bar.getComponent(3);
                toDesel = (JButton) bar.getComponent(4);
                break;

            case SELECTION:
                toSel = (JButton) bar.getComponent(4);
                toDesel = (JButton) bar.getComponent(3);
                break;
        }
        toSel.setSelected(true);
        toDesel.setSelected(false);
    }

    //returneaza un renderops pe care il preda swingworkerului (in renderCurrentFractal), in functie de valoarea lui toZoom, face zoom sau render.
    //e apelat doar la inceput (nu si la resize) si la SelectAndZoom (nu si la ClickAndZoom) (si la Lsystemiterate)
    FractalRenderer.RenderOps renderer(boolean toZoom, boolean toDeserialize) {
        try {
            Fractal.RenderConf c = null;
                 switch (currFractal.type) {
                        case LSYSTEM:
                            c = new Fractal.RenderConf(canvas.getWidth(),
                            canvas.getHeight(), currIters);
                            break;

                        case FORMULA:
                            FormulaFractal f = (FormulaFractal) currFractal;
                            if (!toZoom && !resized && !toDeserialize)
                                setRealIntervals(-2, 2, -2, 2);
                                adjustBoundsToRatio();

                            c = new Fractal.RenderConf(currMinX, currMaxX,
                                currMinY, currMaxY, canvas.getWidth(),
                                canvas.getHeight());
                    }
            resized = false;
            if (toZoom) {
                System.out.println("zoomez");
                return currFractal.zoomTo(c);
            }
            return currFractal.render(c);
        } catch (OutOfMemoryError eee) {
            System.gc();
            JOptionPane.showMessageDialog(this, "Goodbye", "Out of memory",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return null;
        }
    }

    public void renderCurrentFractal(final boolean toZoom, final boolean toDeserialize) {
        if (currFractal.type == Fractal.FractalType.LSYSTEM) canvas.clear();
             worker = new SwingWorker() {
             public Object construct(){
                 statusBar.setMessage("Generating...");
                    return renderer(toZoom, toDeserialize);
             }
            @Override
             public void finished() {
                FractalRenderer.RenderOps ops = (FractalRenderer.RenderOps)get();
                if(ops == null) return;
                    canvas.executeOps(ops);
                    statusBar.setMessage("Ready");
             }
         };
         worker.start();
    }

    public void mandelbrot() {

        setRealIntervals(-1.95, 0.55, -1.25, 1.25);
        adjustBoundsToRatio();

        int powers[] = {2};
        boolean[] theTruth = {true};
        currFractal = new FormulaFractal(powers, theTruth, 1, true,
                FormulaFractal.formulaType.MANDELBROT);

        //e facut de mana pentru ca are statut special
        Fractal.RenderConf c = new Fractal.RenderConf(currMinX, currMaxX,
                    currMinY, currMaxY, canvas.getWidth(),
                    canvas.getHeight());
            canvas.executeOps(currFractal.render(c));
    }

    private class SelectAndZoom extends MouseInputAdapter {

        int pxx1, pxx2, pxy1, pxy2;
        boolean startDrag = false;

        public void mousePressed(MouseEvent e) {

            if (zoomMode != ZoomMode.SELECTION ||
                    currFractal.type != Fractal.FractalType.FORMULA)
                return;
            switch(e.getButton()) {
                case MouseEvent.BUTTON1:
                    startDrag = true;
                    pxx1 = e.getX();
                    pxy1 = e.getY();
                    break;

                case MouseEvent.BUTTON3:
                    double realX = (currMaxX - currMinX) / canvas.getWidth() * e.getX() + currMinX;
                    double realY = (currMaxY - currMinY) / canvas.getHeight() * (canvas.getHeight() - e.getY()) + currMinY;
                    zt.zoom(realX, realY, false);
                    break;
            }
            if ((e.getButton() == MouseEvent.BUTTON2)) {
                return;
            }
        }

        public void mouseDragged(MouseEvent e) {
            //if((e.getButton() != MouseEvent.BUTTON3)) return;
            // da, evenimentul de drag nu primeste un button, go figure
            if (zoomMode != ZoomMode.SELECTION ||
                    currFractal.type != Fractal.FractalType.FORMULA)
                return;
            if (!startDrag) {
                return; //altfel prindea si clicurile dreapta
            }
            int x = e.getX();
            int y = e.getY();
            int x1 = pxx1;
            int y1 = pxy1;
            if (x1 > x) {
                int tmp = x1;
                x1 = x;
                x = tmp;
            }
            if (y1 > y) {
                int tmp = y1;
                y1 = y;
                y = tmp;
            }
           // System.out.println("dragged");
              canvas.setSelection(x1, y1, x - x1, y - y1);
        }

        public void mouseReleased(MouseEvent e) {
            if (zoomMode != ZoomMode.SELECTION ||
                    currFractal.type != Fractal.FractalType.FORMULA)
                return;
            try {
                switch (e.getButton()) {
                    case MouseEvent.BUTTON1:
                        pxx2 = e.getX();
                        pxy2 = e.getY();
                        if (pxx2 == pxx1 || pxy2 == pxy1) {
                            canvas.resetSelection();
                            return;
                        }

                        if (pxx1 > pxx2) {
                            int tmp = pxx1;
                            pxx1 = pxx2;
                            pxx2 = tmp;
                        }
                        if (pxy1 < pxy2) {
                            int tmp = pxy1;
                            pxy1 = pxy2;
                            pxy2 = tmp;
                        }
                        pxy1 = canvas.getHeight() - pxy1;
                        pxy2 = canvas.getHeight() - pxy2;

                        double tmpMinX = (currMaxX - currMinX) / canvas.getWidth() * pxx1 + currMinX;
                        double tmpMinY = (currMaxY - currMinY) / canvas.getHeight() * pxy1 + currMinY;
                        currMaxX = (currMaxX - currMinX) / canvas.getWidth() * pxx2 + currMinX;
                        currMaxY = (currMaxY - currMinY) / canvas.getHeight() * pxy2 + currMinY;
                        currMinX = tmpMinX;
                        currMinY = tmpMinY;

                        double[] newCoords = adjustToRatio(currMinX, currMaxX, currMinY, currMaxY);
                        currMinX = newCoords[0];
                        currMaxX = newCoords[1];
                        currMinY = newCoords[2];
                        currMaxY = newCoords[3];

                        canvas.resetSelection();

                        renderCurrentFractal(true, false);
                        startDrag = false;
                        break;

                    case MouseEvent.BUTTON3:
                        zt.stopZoom();
                        break;
                }
                zoomed = true;

            } catch (UnsupportedOperationException ex) {
                System.out.println("weah");
            }

        }
    }

    private class ClickAndZoom extends MouseInputAdapter {

        private boolean released = true;

        public void mousePressed(MouseEvent e) {
            if (zoomMode != ZoomMode.FLUID || currFractal.type != Fractal.FractalType.FORMULA)
                return;
            if ((e.getButton() == MouseEvent.BUTTON2)) {
                return;
            }
            if (released) {
                boolean inOut = (e.getButton() == MouseEvent.BUTTON1);
                released = false;
                double realX = (currMaxX - currMinX) / canvas.getWidth() * e.getX() + currMinX;
                double realY = (currMaxY - currMinY) / canvas.getHeight() * (canvas.getHeight() - e.getY()) + currMinY;
                zt.zoom(realX, realY, inOut);
            }
        }

        public void mouseReleased(MouseEvent e) {
            if(currFractal.type == Fractal.FractalType.LSYSTEM) {
                switch(e.getButton()) {
                    case MouseEvent.BUTTON1:
                        currIters++;
                        break;

                    case MouseEvent.BUTTON3:
                        if(currIters > 0)
                            currIters--;
                        break;
                }

                renderCurrentFractal(true, false);
            }
             if (zoomMode != ZoomMode.FLUID || currFractal.type != Fractal.FractalType.FORMULA)
                return;
            if ((e.getButton() == MouseEvent.BUTTON2)) {
                return;
            }
            //System.out.println("released");
            released = true;
            zoomed = true;
            zt.stopZoom();
        }
    }

    private class ResizeListener extends ComponentAdapter {

        private FractalFrame ff;

        public ResizeListener(FractalFrame ff) {
            this.ff = ff;
        }

        public void componentResized(ComponentEvent e) {
            
            canvas.setImageSize(canvas.getWidth(), canvas.getHeight());

            resized = true;
            renderCurrentFractal(false, false);
            statusBar.setMessage("Ready");
            
        }
    }
    private ZoomThread zt = new ZoomThread();

    private class ZoomThread extends Thread {

        double x, y;
        boolean doZoom;
        boolean released;
        boolean inOut;

        public ZoomThread() {
            setDaemon(true);
            start();
        }

        public void run() {
            while (true) {
                try {
                    sleep(10L);
                    if (doZoom) {
                        try {
                            int iters = 0;
                            double fact = 0.02;
                            while (!released) {
                                double ratioX = (currMaxX - x) / (currMaxX - currMinX);
                                double ratioY = (currMaxY - y) / (currMaxY - currMinY);
                                double w = currMaxX - currMinX;
                                double h = currMaxY - currMinY;
                                if (inOut) {
                                    w -= fact * w;
                                    h -= fact * h;
                                } else {
                                    w += fact * w;
                                    h += fact * h;
                                }
                                double wr = w * ratioX;
                                double wl = w - wr;
                                double hu = h * ratioY;
                                double hl = h - hu;
                                currMinX = x - wl;
                                currMaxX = x + wr;
                                currMinY = y - hl;
                                currMaxY = y + hu;
                                adjustBoundsToRatio();
                                Fractal.RenderConf c = new Fractal.RenderConf(currMinX, currMaxX, currMinY, currMaxY, canvas.getWidth(), canvas.getHeight());
                                canvas.executeOps(currFractal.zoomTo(c));
                                iters++;
                            }
                        } catch (UnsupportedOperationException e) {
                            System.out.println("weah");
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        public void zoom(double x, double y, boolean inOut) {
            doZoom = true;
            released = false;
            this.x = x;
            this.y = y;
            this.inOut = inOut;
        }

        public void stopZoom() {
            released = true;
            doZoom = false;
        }
    }

    private class FractalListener implements ActionListener {

        private FractalFrame ff;
        private JFileChooser openChooser = new JFileChooser("src/samples"),
                saveChooser = new JFileChooser(),
                serializeChooser = new JFileChooser();
        private FileFilter jpegFilter = new utils.ExtensionFileFilter(
                "jpg", "JPEG images(*.jpg)");
        private FileFilter bmpFilter = new utils.ExtensionFileFilter(
                "bmp", "Bitmap files (*.bmp)");

        public FractalListener(FractalFrame ff) {
            this.ff = ff;
            openChooser.setFileFilter(new utils.ExtensionFileFilter("nafl",
                    "Not Another Fractal Language (*.nafl)"));
            saveChooser.addChoosableFileFilter(jpegFilter);
            saveChooser.addChoosableFileFilter(bmpFilter);
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("performed");
            String cmd = e.getActionCommand().toLowerCase();
            System.out.println(cmd);
            if (cmd.equals("o")) { // file -> open
                int retval = openChooser.showOpenDialog(ff);
                if (retval == JFileChooser.APPROVE_OPTION) {
                    openFile(openChooser.getSelectedFile().getPath());
                }

            } else if (cmd.equals("s")) { //file -> save
                int retval = saveChooser.showSaveDialog(ff);
                if (retval == JFileChooser.APPROVE_OPTION) {
                    try {
                        String path = saveChooser.getSelectedFile().getPath();
                        if (path.toLowerCase().endsWith(".bmp")) {
                            canvas.saveToFile("bmp", path);
                        } else if (path.toLowerCase().endsWith(".jpg")
                                || path.toLowerCase().endsWith(".jpeg")) {
                            canvas.saveToFile("jpg", path);
                        } else {
                            FileFilter fileFilt = saveChooser.getFileFilter();
                            if (fileFilt == bmpFilter) {
                                canvas.saveToFile("bmp", path + ".bmp");
                            } else if (fileFilt == jpegFilter) {
                                canvas.saveToFile("jpg", path + ".jpg");
                            }
                        }
                    } catch (IOException ex) {
                        System.out.println("sucks");
                    }
                }
            }

          else if (cmd.equals("z")) {
                //System.out.println("intrerupt");
                try {
                    if(statusBar.getText().startsWith(" Ready")) {
                        JOptionPane.showMessageDialog(ff, "Generation already " +
                                "stopped", "It's done",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    File tmpFile = File.createTempFile("nafl", null);
                    currFractal.setSerializePath(tmpFile.getPath());
                    worker.interrupt();
                    String path;
                    int retval = serializeChooser.showSaveDialog(ff);
                    if (retval == JFileChooser.APPROVE_OPTION) {
                        path = serializeChooser.getSelectedFile().
                                getPath();
                        boolean madeIt = tmpFile.renameTo(new File(path));
                        if(!madeIt) {
                            File newFile = new File(path);
                            newFile.delete();
                            System.out.print(tmpFile.renameTo(newFile));
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            else if (cmd.equals("x")) {
                int retval = serializeChooser.showOpenDialog(ff);
                if (retval == JFileChooser.APPROVE_OPTION) {
                    ObjectInputStream ois = null;
                    try {
                        String path = serializeChooser.getSelectedFile().getPath();
                        ois = new ObjectInputStream(new FileInputStream(path));
                        Fractal f = (Fractal) ois.readObject();
                        if (f == null) {
                            System.out.println("Era nul, fraere!");
                        } else {
                            currFractal = f;
                            renderCurrentFractal(false, true);
                        }
                        System.out.println("deserializat");
                    } catch (ClassNotFoundException ex) {
                       JOptionPane.showMessageDialog(ff, "Class not found",
                                 "Class not found", JOptionPane.ERROR_MESSAGE);
                    } catch (FileNotFoundException ex) {
                         JOptionPane.showMessageDialog(ff, "File not found",
                                 "File not found", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            ois.close();
                        } catch (IOException ex) {
                            Logger.getLogger(FractalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } 

            else if (cmd.equals("+")) {
                setZoomMode(ZoomMode.SELECTION);
            }

            else if (cmd.equals("/")) {
                setZoomMode(ZoomMode.FLUID);
            }

            else if(cmd.equals("1") || cmd.equals("2") ||cmd.equals("3") ||
                    cmd.equals("4") || cmd.equals("5")) {
                fcNr = Integer.parseInt(cmd);
                currFractal.setFcNr(fcNr);
                renderCurrentFractal(zoomed, false);
            }
            else if(cmd.equals("a")) {

            JOptionPane.showMessageDialog(ff, "Not another fractal program \n" +
                    "based on Not Another Fractal Language. Not very good, but" +
                    "not too bad. Do not blame Ana and " +
                    "Razvan.",
                                 "About", JOptionPane.INFORMATION_MESSAGE);
            }
            

            else if (cmd.equals("q")) {
               System.exit(0);
            }

           else {
                String[] names = {"Mandelbrot", "Dendrite", "Fatboy slim",
                "Julia 1", "Julia 2",
                    "Julia 3", "Julia 4", "Galaxy", "Julia 6", "Koch",
                    "Area 51", "Peano", "Sierpinski", "Stairs", "Terdragon"};
                String[] fnames = {"mandelbrot.nafl", "ceva.nafl", "gras.nafl",
                        "julia1.nafl", "julia2.nafl", "julia3.nafl",
                        "julia4.nafl", "julia5.nafl", "julia6.nafl",
                        "koch snowflake.nafl", "not koch snowflake.nafl",
                        "peano.nafl", "sierpinski.nafl", "stairs.nafl",
                        "dragon.nafl"};
                for(int i=0; i<names.length; i++) {
                    if(names[i].toLowerCase().equals(cmd)) {
                        openURL(this.getClass().getResource("/samples/"
                                + fnames[i]));
                    }
                }

            }
        }

    }


    private class StatusBar extends JLabel {
        
    public StatusBar() {
        super();
        super.setPreferredSize(new Dimension(100, 16));
        setMessage("Ready");
    }

    public void setMessage(String message) {
        setText(" "+message);
    }

    }

}
