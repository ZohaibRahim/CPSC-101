class Card {
    private static Rank rank;
    private static String rankName;
    private static String suitName;
    private static Suit suit;
    public Card(Rank r, Suit s) {
        this.rank = r;
        this.rankName= r.toString();
        this.suitName= s.toString();
        this.suit = s;
    }
    public Card(int i) {
        this.rank = Rank.values()[i % 13];
        this.suit = Suit.values()[i / 13];
    }
    public Rank getRank() {
        return rank;
    }
    public Suit getSuit() {
        return suit;
    }
    public int getCribCount() {
        return rank.getValue();
    }
    @Override
    public String toString() {
        return rank.toString().substring(0, 1) + suit.toString().substring(0, 1);
    }
    public static Card getCard(Rank r, Suit s) {
        return new Card(r, s);
    }
    public static Card getCard(int i) {
        return new Card(i);
    }


}






