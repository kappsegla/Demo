package se.newton.martin.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExempel {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField1;
    private JPanel rootPanel;

    public GUIExempel() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIExempel");
        frame.setContentPane(new GUIExempel().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
