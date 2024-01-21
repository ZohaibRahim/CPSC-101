package cpsc101.Z230155884.lab6_d;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Home extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Triangle
        g.setColor(Color.BLACK);
        int [] x = {50,100,0};
        int [] y = {0,20,20};
        g.drawPolygon(x, y, 3);
        //Big Square
        g.setColor(Color.BLACK);
        g.drawRect(0,23,100,100);
        //Window
        g.setColor(Color.BLACK);
        g.drawRect(60,60,20,20);
        //Door
        g.setColor(Color.BLACK);
        g.drawRect(10,73,20,50);


    }
}
