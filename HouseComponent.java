import java.awt.Graphics ;
import java.awt.Graphics2D ;

import javax.swing.JComponent;

import java.util.ArrayList;

public class HouseComponent extends JComponent
{

    private ArrayList<House> myHouses ;

    public HouseComponent()
    {
        super() ;
        myHouses = new ArrayList<House>() ;
    }

    public void addHouse(House h)
    {
        myHouses.add(h) ;
    }

    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g ;
        for (House h: myHouses)
            h.draw(g2d) ;
    }

}

