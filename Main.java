package cpsc101.Z230155884.lab6_f;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Olympic Rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 270);
        frame.add(new OlympicRings());
        frame.setVisible(true);
    }
}
