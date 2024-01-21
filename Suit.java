public enum Suit {
    C("\u2469"), D("D"), H("H"), S("S");

    private final String suit;
    Suit (String suit){
        this.suit =suit;
    }
    public String toString(){
        return suit;
    }
}