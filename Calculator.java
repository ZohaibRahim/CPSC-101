package cpsc101.z230155884.LAB7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private Register myRegister;
    private JTextField display;
    private JButton clearButton;
    private JButton[] digitButtons;
    private JButton negButton;

    public Calculator() {
        super("cpsc101.z230155884.LAB7.Calculator");

        myRegister = new Register();

        // Display component
        display = new JTextField(myRegister.getDisplayText(), 10);
        display.setFont(new Font("Menlo", Font.BOLD, 30));
        display.setBackground(Color.black);
        display.setForeground(Color.red);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.TRAILING);
        display.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                myRegister.clearDisplay();
                display.setText(myRegister.getDisplayText());
            }
        });

        // Button component
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        digitButtons = new JButton[10];
        //
        for (int i = 0; i < 10; i++) {
            JButton digitButton = new JButton(Integer.toString(i));
            digitButton.setBackground(Color.white);
            int finalI = i;
            digitButton.addActionListener((ae) -> {
                myRegister.addDigit(finalI);
                display.setText(myRegister.getDisplayText());
            });
            digitButtons[i] = digitButton;
        }
        clearButton = new JButton("Clear");
        clearButton.setBackground(Color.white);
        clearButton.addActionListener((ae) -> {
            myRegister.clearDisplay();
            display.setText(myRegister.getDisplayText());
        });
        negButton = new JButton("-");
        negButton.setBackground(Color.white);
        negButton.addActionListener((ae) -> {
            myRegister.subtract();
            display.setText(myRegister.getDisplayText());
        });

        buttonPanel.add(digitButtons[7]);
        buttonPanel.add(digitButtons[8]);
        buttonPanel.add(digitButtons[9]);
        buttonPanel.add(digitButtons[4]);
        buttonPanel.add(digitButtons[5]);
        buttonPanel.add(digitButtons[6]);
        buttonPanel.add(digitButtons[1]);
        buttonPanel.add(digitButtons[2]);
        buttonPanel.add(digitButtons[3]);
        buttonPanel.add(digitButtons[0]);
        buttonPanel.add(clearButton);
        buttonPanel.add(negButton);
        // Adding components to the JFrame
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Set JFrame properties
        setSize(300, 500);
        setResizable(false);
        setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
