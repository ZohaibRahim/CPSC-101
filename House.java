import java.awt.geom.Point2D ;
import java.awt.geom.Rectangle2D ;
import java.awt.Color ;
import java.awt.Shape ;
import java.awt.Dimension ;
import java.awt.Polygon ;
import java.awt.Graphics ;
import java.awt.Graphics2D ;

public class House
{
    private Shape floor1 ;
    private Shape door ;
    private Shape window ;
    private Shape roof ;

    public House(Point2D.Double  lowerLeftCorner,
                 Dimension size)
    {
        floor1 = new Rectangle2D.Double(lowerLeftCorner.getX(), lowerLeftCorner.getY() + size.getHeight() / 3, size.getWidth(), 2 * size.getHeight() / 3);
            roof = createRoof(lowerLeftCorner, size);
                door = createDoor(lowerLeftCorner, size);
                    window = createWindow(lowerLeftCorner, size);
    }

    public void draw(Graphics2D g2d)
    {
        g2d.setStroke(new java.awt.BasicStroke(1.5f)) ;
        g2d.setColor(Color.BLUE) ;
        g2d.draw(door   ) ;
        g2d.draw(window ) ;
        g2d.draw(roof   ) ;
        g2d.draw(floor1 ) ;
    }

    // helper functions
    // code to build the floor roof door and window shpaes

    // Helper functions to create the shapes
    private Shape createRoof(Point2D.Double lowerLeftCorner, Dimension size) {
        double roofWidth = size.getWidth();
        double roofHeight = size.getHeight() / 3;
        Polygon roofPolygon = new Polygon();
        roofPolygon.addPoint((int) lowerLeftCorner.getX(), (int) (lowerLeftCorner.getY() + size.getHeight() / 3));
        roofPolygon.addPoint((int) (lowerLeftCorner.getX() + roofWidth / 2), (int) lowerLeftCorner.getY());
        roofPolygon.addPoint((int) (lowerLeftCorner.getX() + roofWidth), (int) (lowerLeftCorner.getY() + size.getHeight() / 3));
        return roofPolygon;
    }

    private Shape createDoor(Point2D.Double lowerLeftCorner, Dimension size) {
        double doorWidth = size.getWidth() / 4;
        double doorHeight = size.getHeight() / 2;
        return new Rectangle2D.Double(lowerLeftCorner.getX() + size.getWidth() / 2 - doorWidth / 2, lowerLeftCorner.getY() + size.getHeight() / 3 + doorHeight / 2, doorWidth, doorHeight);
    }

    private Shape createWindow(Point2D.Double lowerLeftCorner, Dimension size) {
        double windowSize = size.getHeight() / 4;
        return new Rectangle2D.Double(lowerLeftCorner.getX() + size.getWidth() / 4, lowerLeftCorner.getY() + size.getHeight() / 2, windowSize, windowSize);
    }
}


