package se.newton.martin.gui;

import javax.swing.*;
import java.awt.*;

public class GUIExample extends JFrame {
//http://zetcode.com/tutorials/javaswingtutorial/
    public GUIExample(){
        setTitle("Simple menu");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
//        https://stackoverflow.com/questions/22534356/java-awt-eventqueue-invokelater-explained

        //SwingUtilities.invokeLater()
        EventQueue.invokeLater(() -> {
            GUIExample ex = new GUIExample();
            ex.setVisible(true);
        });

    }
}
