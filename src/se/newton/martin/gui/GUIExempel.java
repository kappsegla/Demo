package se.newton.martin.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExempel {
    private JPanel rootPanel;
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton läggTillButton;
    private MyListModel myListModel;

    public GUIExempel() {
        myListModel = new MyListModel();
        list1.setModel(myListModel);
        läggTillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListModel.add(textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater( () -> {
            JFrame frame = new JFrame("GUIExempel");
            frame.setContentPane(new GUIExempel().rootPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(new Dimension(800,600));
            frame.setVisible(true);
        });
    }
}
