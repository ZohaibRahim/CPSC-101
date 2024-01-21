package cpsc101.Z230155884.lab6_a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NameInRectangle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // set background color to black
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // set font and color for text
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 30));

        // draw name in center of rectangle
        String name = "Zohaib Rahim";
        int nameWidth = g.getFontMetrics().stringWidth(name);
        int x = (getWidth() - nameWidth) / 2;
        int y = getHeight() / 2;
        g.drawString(name, x, y);
    }
}


