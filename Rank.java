public enum Rank {
    A("A", 1), TWO("2",2), THREE("3",3), FOUR("4",4), FIVE("5",5), SIX("6",6), SEVEN("7",7), EIGHT("8", 8), NINE("9",9), TEN("T",10), J("J",10), Q("Q",10), K("K",10);
    private final int value;
    private String rank;
    Rank(int value) {
        this.value = value;
    }
    public int getCount() {
        return value;
    }
    Rank (String rank, int value){
        this.rank=rank;
        this.value=value;
    }
    public String toString(){
        return rank;
    }
    public String toShortString() {
        return rank.substring(0, 1);
    }
}