# Java Crossword Puzzle Generator

This Java application generates a crossword puzzle grid based on input data read from a file. The program uses Swing to create a graphical representation of the crossword puzzle grid, where each cell contains either a letter or a black square ('X').

COMPONENTS:

**Crossword Class:**

1) Extends JFrame to create the main window for the crossword puzzle.
2) Generates a crossword grid based on the input parameters (rows, columns, and an ArrayList of characters).
3) Utilizes buttons (JButton) to represent each cell in the grid.
4) Applies background colors to distinguish between letters and black squares.

**Main Class:**

1) Reads input data from a file, including the dimensions of the crossword grid (rows and columns) and the characters representing letters and black squares.
2) Creates an instance of the Crossword class, passing the necessary data for grid generation.
3) Displays the crossword puzzle grid in a graphical user interface.

**Usage:**

1) Create a text file containing the crossword puzzle data. The file should include the number of rows and columns on the first line, followed by the grid representation.
Example:
4 5
ABBAA
XBCDX
XBEEF
GHHIF
2) Modify the file path in the FileReader constructor in the Main class to point to the location of your input file.
3) Run the Main class to generate and display the crossword puzzle grid.

**Note:**

1) The program reads input data from a file, with the first two lines specifying the dimensions of the grid (rows and columns).
2) The letters are represented by the characters in the subsequent lines of the file, with 'X' indicating black squares.
3) The crossword puzzle is displayed using a graphical user interface created with Swing.
