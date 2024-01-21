package cpsc101.Z230155884.lab6_c;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OverLappingSquares extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // green square
        g.setColor(Color.GREEN);
        g.fillRect(50, 50, 100, 100);

        // yellow square overlapping the green square
        g.setColor(Color.YELLOW);
        g.fillRect(75, 75, 100, 100);
    }
}
