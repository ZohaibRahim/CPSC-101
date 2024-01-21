# Java Swing - House Drawing Component

This Java program showcases a graphical representation of houses using the Swing framework. The application includes multiple classes that collaborate to create a customizable house-drawing component.

**House Class:**

1) Represents an individual house and contains shapes for the floor, roof, door, and window.
2) Constructor takes the lower-left corner point and size as parameters to initialize the house.
3) The draw method is responsible for rendering the house components using Graphics2D.

**HouseComponent Class:**

1) Extends JComponent to create a custom component for drawing multiple houses.
2) Manages an ArrayList of House instances to allow for adding and rendering multiple houses.
3) Overrides the paintComponent method to draw each house in the component.

**HouseFrame Class:**

1) Extends JFrame to create the main frame for displaying the houses.
2) Constructor sets up the frame, adds the HouseComponent, and configures default settings.

**TestHouses Class:**

1) Serves as a test class to demonstrate the usage of the house-drawing component.
2) Creates instances of House, adds them to the HouseComponent, and displays them in the HouseFrame.
3) Includes a main method to initiate the application.

**TestHouses - go Method:**

1) Demonstrates how to create and display instances of House within the HouseComponent.
2) Multiple houses with different positions and sizes are added to showcase the flexibility of the application.

The program is a useful example for those learning about GUI programming with Java Swing. It demonstrates the composition of custom components, the rendering of shapes, and the creation of a graphical interface to display houses. Users can modify the positions, sizes, and colors of the houses to explore different visualizations.
