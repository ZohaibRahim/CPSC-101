import javax.swing.JFrame ;

public class HouseFrame extends JFrame
{
    public HouseFrame(HouseComponent houses)
    {
        super("House Frame") ;
        setSize(800,800) ;
        setLocation(100,100) ;
        getContentPane().add(houses) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setVisible(true) ;
    }
}
