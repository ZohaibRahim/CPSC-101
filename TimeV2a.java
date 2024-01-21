package TimeClass.version2a;

public class TimeV2a implements  Comparable<TimeV2a> {
    //Constructors
    private int sec;

    public TimeV2a() { // create midnight
        sec=0;
    }
    public TimeV2a (int s) {
        this.sec=s;
    }
    public TimeV2a(TimeV2a t) {
        this.sec=t.sec;
    }


    //Accessor Methods
    public int getSecond(){
        return this.sec;
    }
    public void setSeconds(int s){
        this.sec+=s;
    }
    public void advanceBy(int seconds) { // changes the time by a given number of seconds.
        this.sec+=seconds;

    }

    //methods
    public String toString() { // produces a string like "22:03:12". The hours should be between 0 and 23, and the minutes and seconds should be between 0 and 59.
        return (String.format("%d",this.sec));
    }

    public int compareTo(TimeV2a t) { //produces the number of seconds from t to this. That is, t.advanceBy(this.compareTo(t)) should set t to the same time as this.
        // int totalSecs= (this.hour*3600)+(this.min*60)+this.sec;
        // int tSecs= (t.hour*3600)+(t.min*60)+t.sec;
        if (this.sec>t.sec)
            return (this.sec-t.sec);
        else
            return (t.sec-this.sec);
    }
    public boolean equals(TimeV2a another) { //returns true if and only if the times have the same value.
        int difference = compareTo(another);
        if (difference==0)
            return true;
        else
            return false;
    }
}


