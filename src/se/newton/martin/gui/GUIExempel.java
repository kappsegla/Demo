package se.newton.martin.gui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ResourceBundle;

public class GUIExempel {
    private JPanel root;
    private JTextField textField1;
    private JButton läggTillButton;
    private JButton taBortButton;
    private JList list1;
    private JLabel label2;
    private JTextArea textArea1;
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

        //Load image as icon, should be done in thread...
        ImageIcon icon = GUIHelper.createImageIcon("/smiley.gif",
                "a pretty but meaningless splat");
        //label2.setIcon(icon);
        läggTillButton.setIcon(icon);

        MissingIcon missingIcon = new MissingIcon();
        label2.setIcon(missingIcon);

        new Thread(() -> {
            while(true) {
                EventQueue.invokeLater( ()->{
                missingIcon.rotate();
                label2.repaint();});
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


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
                BufferedReader inputStream = null;
                //StringBuilder stringBuilder = new StringBuilder();
                try {
                    inputStream = new BufferedReader(new FileReader(file));

                    String temp;
                    myListModel.clear();
                    while ((temp = inputStream.readLine()) != null) {
                        //      stringBuilder.append(temp);
                        //      stringBuilder.append('\n');
                        myListModel.add(temp);
                    }

                    //Uppdatera GUI, på EDT tråden.
//                    EventQueue.invokeLater(() -> {
//                        //Kod för att uppdatera grafiska gränssnittet
//                        textArea1.setText(stringBuilder.toString());
//                    });
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }

    public void saveFile(ActionEvent e) {
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();

        //In response to a button click:
        int returnVal = fc.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            new Thread(() -> {
                File file = fc.getSelectedFile();
                try {
                    PrintWriter outputStream = new PrintWriter(new FileWriter(file));
                    for (int i = 0; i < myListModel.getSize(); i++) {
                        outputStream.println(myListModel.getElementAt(i));
                    }
                    outputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            frame = new JFrame("GUIExempel");
            frame.setContentPane(new GUIExempel().root);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(new Dimension(800, 600));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
