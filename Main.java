import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Passing the path to the file as a parameter
        FileReader fr = new FileReader("C:\\Users\\rahim\\Documents\\test.txt");
        Scanner kdb = new Scanner(fr);
        int r = kdb.nextInt();
        int c = kdb.nextInt();
        ArrayList<Character> letters = new ArrayList<Character>();
        String line;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rahim\\Documents\\test.txt"));
        for (int i = 0; i < 2; i++) {
            br.readLine(); // Skip first two lines
        }
        while ((line = br.readLine()) != null) {
            for (char ch : line.toCharArray()) {
                letters.add(ch);
            }
        }
        Crossword crossword = new Crossword(r, c, letters);
    }
}