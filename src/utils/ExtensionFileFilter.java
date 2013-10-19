/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Razvan
 */
public class ExtensionFileFilter extends FileFilter {

    private String extension, desc;

    public ExtensionFileFilter(String extension, String desc) {
        this.extension = extension;
        this.desc = desc;
    }

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String name = f.getName();
        int pos = name.lastIndexOf(".");
        if (pos == -1) {
            return false;
        }
        if (name.substring(pos + 1).toLowerCase().equals(extension)) {
            return true;
        }
        return false;
    }

    public String getDescription() {
        return desc;
    }
}
