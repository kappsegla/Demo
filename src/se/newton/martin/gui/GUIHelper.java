package se.newton.martin.gui;

import javax.swing.*;
import java.util.ArrayList;

public class GUIHelper {

    /** Returns an ImageIcon, or null if the path was invalid. */
   static protected ImageIcon createImageIcon(String path,
                                              String description) {
        java.net.URL imgURL = GUIHelper.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
