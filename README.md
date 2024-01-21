# Java Swing Calculator

This Java Swing application implements a simple calculator with a graphical user interface. The calculator allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

**COMPONENTS:**

**Calculator Class:**

1) Extends JFrame to create the main window for the calculator.
2) Includes a display area (JTextField) for showing the numeric input and results.
3) Utilizes digit buttons (JButton) for entering numeric values.
4) Provides a clear button (JButton) to reset the display.
5) Includes a negate button (JButton) to toggle between positive and negative values.
6) Utilizes the Register class to manage the calculator's internal state.

**Register Class:**

1) Manages the state of the calculator, including the display text, whether the value is negated, and the maximum number of display digits.
2) Allows users to add digits, clear the display, and toggle between positive and negative values.

**Main Class:**

1) Contains the main method to initiate the calculator application.

**Usage:**

  Run the Main class to start the calculator application.
  The calculator window appears, featuring a display area and numeric buttons.
  Users can input digits using the digit buttons, perform arithmetic operations, and negate the displayed value.
  The clear button resets the display to zero, and the negate button toggles the sign of the displayed value.

**Note:**

  The code uses the Swing framework to create a graphical user interface.
  The calculator allows users to input positive and negative numbers with a maximum of nine display digits.
  The code includes event listeners for button clicks to update the calculator's state and display.
