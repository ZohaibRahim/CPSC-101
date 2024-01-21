package cpsc101.z230155884.LAB7;
public class Register {
    private boolean subtracted;
    private int displayDigitsMax;
    private String displayText;

    public Register() {
        subtracted = false;
        displayDigitsMax = 9;
        displayText = "0";
    }

    public boolean isNegated() {
        return subtracted;
    }

    public int getDisplayDigitsMax() {
        return displayDigitsMax;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void subtract() {
        subtracted = !subtracted;
        if (!displayText.equals("0") && !displayText.equals("-0")) {
            if (subtracted) {
                displayText = "-" + displayText;
            } else {
                displayText = displayText.substring(1);
            }
        }
    }

    public void setDisplayDigitsMax(int dMax) {
        displayDigitsMax = dMax;
        if (displayText.length() > displayDigitsMax) {
            displayText = "*********";
        }
    }

    public void clearDisplay() {
        displayText = "0";
        subtracted = false;
    }

    public void addDigit(int k) {
        char digit = (char) (k + '0');
        addDigit(digit);
    }

    public void addDigit(char k) {
        if (displayText.equals("0") || displayText.equals("-0")) {
            if (k == '0') {
                return;
            }
            displayText = "";
        }
        if (displayText.length() >= displayDigitsMax) {
            displayText = "*********";
            return;
        }
        displayText += k;
    }
}