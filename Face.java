package cpsc101.Z230155884.lab6_b;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Face extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the face circle
        g.setColor(Color.BLACK);
        g.drawOval(100, 50, 200, 200);
        g.setColor(Color.WHITE);
        g.fillOval(100, 50, 200, 200);

        // Draw the eyes
        g.setColor(Color.BLACK);
        g.drawOval(140, 100, 30, 30);
        g.drawOval(230, 100, 30, 30);

        // Draw the mouth
        g.setColor(Color.BLACK);
        g.drawLine(150, 190, 250, 190);
    }
}
