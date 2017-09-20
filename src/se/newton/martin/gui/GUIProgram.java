package se.newton.martin.gui;

import javax.swing.*;
import java.awt.*;
//http://zetcode.com/tutorials/javaswingtutorial/

public class GUIProgram extends JFrame{

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panelTop;
    private JPanel panelBottom;
    private JLabel label1;
    private JTextField textField;


    public GUIProgram() {
        super("Program title");
        //setTitle("Program title");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Create all UI components
        button1 = new JButton("Button");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
        label1 = new JLabel("Det här är en textlabel.");
        panelTop = new JPanel();
        panelBottom = new JPanel();
        textField = new JTextField();
        //Set layoutmanager for JFrame
        setLayout(new GridLayout(2,1));
        //Add panels to JFrame
        add(panelTop);
        add(panelBottom);

        //Set layout manager for panels
        panelTop.setLayout(new BorderLayout());
        panelBottom.setLayout(new GridLayout(1,3));

        //Add buttons to bottom panel
        panelBottom.add(button1);
        panelBottom.add(button2);
        panelBottom.add(button3);

        //Add label and textfield to top panel
        panelTop.add(label1,BorderLayout.WEST);
        panelTop.add(textField, BorderLayout.CENTER);
        //Add action listener to button1 to capture click events.
        //This code will run in the UI-thread. Don't block
        button1.addActionListener((e) -> {label1.setText(textField.getText());});

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            GUIProgram program = new GUIProgram();
            program.setSize(800, 600);
            program.setVisible(true);
        });
    }
}
