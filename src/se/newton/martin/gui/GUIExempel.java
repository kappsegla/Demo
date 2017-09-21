package se.newton.martin.gui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ResourceBundle;

public class GUIExempel {
    private JPanel root;
    private JTextField textField1;
    private JTextField textField2;
    private JButton läggTillButton;
    private JButton taBortButton;
    private JList list1;
    private MyListModel myListModel;
    private JMenuBar menuBar;
    private static JFrame frame;

    private static ResourceBundle bundle = ResourceBundle.getBundle("se.newton.martin.gui.textstrings");

    public GUIExempel() {
        //Create menuBar for the application
        createMenuBar();

        myListModel = new MyListModel();
        list1.setModel(myListModel);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        läggTillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListModel.add(textField1.getText());
            }
        });
        taBortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myListModel.remove(list1.getSelectedIndex());
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting() == false) {
                    //Selection/Deselection is done
                    if (list1.getSelectedIndex() == -1) {
                        taBortButton.setEnabled(false);
                    } else
                        taBortButton.setEnabled(true);
                }
            }
        });
    }

    private void createMenuBar() {
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        //Access the menu with alt+F
        menu.setMnemonic('F');
        //Lägg File menu på menubar
        menuBar.add(menu);
        //Keyevent is used for navigating with alt + underscored character in windows
        JMenuItem openFileMenu = new JMenuItem(bundle.getString("fileOpen"),
                KeyEvent.VK_O);

        openFileMenu.getAccessibleContext().setAccessibleDescription(
                "Select a file to open");
        menu.add(openFileMenu);

        openFileMenu.addActionListener(this::openFile);

        JMenuItem saveFileMenu = new JMenuItem("Save...",
                KeyEvent.VK_S);

        saveFileMenu.getAccessibleContext().setAccessibleDescription(
                "Save to file");
        saveFileMenu.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        menu.add(saveFileMenu);

        saveFileMenu.addActionListener(this::saveFile);
    }

    public void openFile(ActionEvent e) {
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();

        //In response to a button click. showOpenDialog returns when the dialog closes.
        int returnVal = fc.showOpenDialog(frame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            //Filhantering tar lång tid och måste utföras i en egen bakgrundstråd.
            //Kan även göras med SwingWorker
            // https://docs.oracle.com/javase/8/docs/api/javax/swing/SwingWorker.html
            new Thread(() -> {
                //Läs in filen
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                //Uppdatera GUI, på EDT tråden.
                EventQueue.invokeLater(() -> {
                    //Kod för att uppdatera grafiska gränssnittet
                    textField2.setText(file.getName());
                });
            }).start();
        }
    }

    public void saveFile(ActionEvent e) {
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();

        //In response to a button click:
        int returnVal = fc.showSaveDialog(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            frame = new JFrame("GUIExempel");
            frame.setContentPane(new GUIExempel().root);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(new Dimension(800, 600));
            frame.setVisible(true);
        });
    }
}
