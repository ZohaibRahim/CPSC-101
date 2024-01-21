import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Crossword extends JFrame {
    private JButton[] letters;
    private JButton blackbutton;

    public Crossword(int r, int c, ArrayList<Character> alpha) {
        JPanel buttonPanel = new JPanel(new GridLayout(r, c));
        this.letters = new JButton[alpha.size()];
        for (int i = 0; i < alpha.size(); i++) {
            JButton letter = new JButton(String.valueOf(alpha.get(i)));
            letter.setBackground(Color.white);
            letter.setForeground(Color.blue);
            letters[i] = letter;
        }
        blackbutton = new JButton();
        blackbutton.setBackground(Color.black);

        for (int i = 0; i < alpha.size(); i++) {
            char alphabet = alpha.get(i);
            if (alphabet == 'X') {
                buttonPanel.add(blackbutton);
            } else {
                buttonPanel.add(letters[i]);
            }
        }
        add(buttonPanel, BorderLayout.CENTER);

        setSize(400, 500);
        setResizable(false);
        setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
