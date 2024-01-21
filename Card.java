public final class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank r, Suit s) {
        this.rank = r;
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
        return rank.getCount();
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

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Card)) return false;
        Card other = (Card) o;
        return this.rank == other.rank && this.suit == other.suit;
    }

    public boolean equals(Card c) {
        if (c == this) return true;
        return this.rank == c.rank && this.suit == c.suit;
    }
}