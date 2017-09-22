package se.newton.martin.gui;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//http://zetcode.com/tutorials/javaswingtutorial/

public class GUIProgram extends JFrame {

    private JButton button1;
    private JButton button2;
    private JPanel panelTop;
    private JPanel panelBottom;
    private JLabel label1;
    private JTextField textField;
    private JList list;
    private MyListModel listModel;

    public GUIProgram() {
        super("Program title");
        //setTitle("Program title");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Create all UI components
        button1 = new JButton("Button");
        button2 = new JButton("Button2");

        label1 = new JLabel("Det här är en textlabel.");
        panelTop = new JPanel();
        panelBottom = new JPanel();
        textField = new JTextField();
        //Set layoutmanager for JFrame
        setLayout(new GridLayout(2, 1));
        //Add panels to JFrame
        add(panelTop);
        add(panelBottom);

        //Set layout manager for panels
        panelTop.setLayout(new BorderLayout());
        panelBottom.setLayout(new GridLayout(1, 3));

        //Add buttons to bottom panel
        panelBottom.add(button1);
        panelBottom.add(button2);

        //Create a list connected to an array of Strings as datasource.
        listModel = new MyListModel();
        list = new JList(listModel);
        panelBottom.add(list);

        //Add label and textfield to top panel
        panelTop.add(label1, BorderLayout.WEST);
        panelTop.add(textField, BorderLayout.CENTER);
        //Add action listener to button1 to capture click events.
        //This code will run in the UI-thread. Don't block
        button1.addActionListener((e) -> {
            label1.setText(textField.getText());
        });
        button2.addActionListener((e) -> {
            listModel.update(1, textField.getText());
        });

        //Listen to keyinput on the textfield.
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //Ignore this keycode
                //e.consume();
                //Replace all written keys with a *
                //e.setKeyChar('*');
                //Transfer the text to label1
                //label1.setText(textField.getText() + e.getKeyChar());
            }
        });
    }

    public static void main(String[] args) {

//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        EventQueue.invokeLater(() -> {
            GUIProgram program = new GUIProgram();
            program.setSize(800, 600);
            program.setVisible(true);
        });
    }
}
