package cpsc101.Z230155884.lab6_c;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Overlapping Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new OverLappingSquares());
        frame.setVisible(true);
    }
}
