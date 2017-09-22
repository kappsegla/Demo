package se.newton.martin.gui;

import javax.swing.*;
import java.awt.*;

public class JLabelAdvanced extends JLabel {

    private boolean testing;

    @Override
    public void paintComponent(Graphics g) {
      //  super.paintComponent(g);
        if( testing ) {
            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setColor(Color.RED);
            g2d.drawLine(3, getHeight() / 2, getWidth() - 4, getHeight() / 2);

            g2d.dispose();
        }
    }

    /**
     *
     * @return
     */
    public boolean isTesting() {
       return testing;
    }

    /**
     *
     * @param testing
     */
    public void setTesting(boolean testing) {
        this.firePropertyChange("testing",this.testing,testing );
        this.testing = testing;
    }
}
