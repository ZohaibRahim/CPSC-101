package cpsc101.Z230155884.lab6_f;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OlympicRings extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the blue ring
        g.setColor(Color.BLUE);
        g.drawOval(50, 50, 100, 100);

        // Draw the yellow ring
        g.setColor(Color.YELLOW);
        g.drawOval(100, 100, 100, 100);

        // Draw the black ring
        g.setColor(Color.BLACK);
        g.drawOval(150, 50, 100, 100);

        // Draw the green ring
        g.setColor(Color.GREEN);
        g.drawOval(200, 100, 100, 100);

        // Draw the red ring
        g.setColor(Color.RED);
        g.drawOval(250, 50, 100, 100);
    }
}

