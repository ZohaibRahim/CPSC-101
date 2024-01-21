import java.util.*;
class TestCard {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        while (kdb.hasNextLine()) {
            String line = kdb.nextLine();
            String[] cardValues = (line.split(" "));
            List<Card> cards = new ArrayList<>();
            int c = 0;
            for (String cardValue : cardValues) {
                cards.add(Card.getCard(Rank.valueOf(cardValue.substring(0, cardValue.length() - 1)),
                        Suit.valueOf(cardValue.substring(cardValue.length() - 1))));
                c += cards.get(cards.size() - 1).getCribCount();
            }
            System.out.print(line + " : total count " + c + '\n');
        }
        kdb.close();
    }
}