import java.util.*;
public class CountW {
    /**
     * Determine the total number of 'w's in the words “one, two, three, . . . , thiry-four
       million nine hundred ninety-nine thousand nine hundred ninety-eight, thiry-four million
       nine hundred ninety-nine thousand nine hundred ninety-nine, thiry-five million.”
     */
    public static final void main(String[] args) {
        int i = 0;
        String count_w;
        for (int c = 1; c <= 35000000; c++) {
            count_w = NumberToStringConvertor.numberToString(c);
            int j = 0;
            //checking for w at each char in the string
            while (j < count_w.length()) {
                if (count_w.charAt(j) == 'w')
                    i++;
                j++;
            }
        }
        System.out.println("The total number of \'w\'s in the words from one to thirty-five million are "+i);
    }
}
/**
 * The total number of 'w's in the words from one to thirty-five million are 35000000
 */


