import java.util.*;
class Test15s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] cards = line.split(" ");
            ArrayList<Card> hand = new ArrayList<>();

            for (String card : cards) {
                hand.add(Card.getCard(Rank.valueOf(card.substring(0, card.length() - 1)), Suit.valueOf(card.substring(card.length() - 1))));
            }
            int count = 0;
            for (int i = 0; i < hand.size(); i++) {
                for (int j = i + 1; j < hand.size(); j++) {
                    for (int k = j + 1; k < hand.size(); k++) {
                        for (int l = k + 1; l < hand.size(); l++) {
                            for (int m = l + 1; m < hand.size(); m++) {
                                if (hand.get(i).getCribCount() + hand.get(j).getCribCount() + hand.get(k).getCribCount() + hand.get(l).getCribCount() + hand.get(m).getCribCount() == 15) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(line + ": there are " + count+" fifteen");
        }

    }
}