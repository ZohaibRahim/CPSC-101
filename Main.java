package cpsc101.Z230155884.lab6_a;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Name in Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 100));
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new NameInRectangle());
        frame.setVisible(true);
    }
}
