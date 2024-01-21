package cpsc101.Z230155884.lab6_e;

import java.awt.geom.Point2D ;
import java.awt.Dimension ;

public class TestHouses
{
    private HouseFrame myFrame ;
    private HouseComponent myComponent ;


    public TestHouses()
    {
        myComponent = new HouseComponent() ;
        myFrame = new HouseFrame(myComponent) ;
    }

    public void addHouse(House h)
    {
        myComponent.addHouse(h) ;
    }

   /* private static void go()
    {
        HouseComponent t2 = t1.myComponent ;
        Dimension houseSize = new Dimension(60,60) ;
        TestHouses t1 = new TestHouses() ;
        t1.addHouse(new House(/* ... *//*)) ;
        t1.addHouse(/* ... *//*) ;
        t1.addHouse(/* ... *//*) ;
    }
    */
   private static void go() {
       TestHouses t1 = new TestHouses();
       Dimension houseSize = new Dimension(60,60);
       t1.addHouse(new House(new Point2D.Double(30, 30), new Dimension(80, 100)));
       t1.addHouse(new House(new Point2D.Double(200, 100), new Dimension(80, 120)));
       t1.addHouse(new House(new Point2D.Double(150, 200), new Dimension(150, 150)));
       HouseComponent t2 = t1.myComponent;
   }

    public static void main(String [] ignored)
    {
        javax.swing.SwingUtilities.invokeLater(() -> go()) ;
        System.out.println("started.") ;
    }
}
