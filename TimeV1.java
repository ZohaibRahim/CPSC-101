package TimeClass.version1;

public class TimeV1 {
    //Constructors
    private int hour;
    private int min;
    private int sec;

    public TimeV1() { // create midnight
        hour=min=sec=0;
    }

    public TimeV1(int h, int m, int s) {
        this.hour=h;
        this.min=m;
        this.sec=s;
    }

    public TimeV1(TimeV1 t) {
        this.hour=t.hour;
        this.min=t.min;
        this.sec=t.sec;

    }
    //Accessor Methods
    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.min;
    }

    public int getSecond(){
        return this.sec;
    }
    // Mutator methods
    public void setHours(int h){
        if ((this.hour + h)>23) {
            int hours_left=24-this.hour;
            int additional_hours=(this.hour + h)%24;
            this.hour=0;
            this.hour=hours_left+additional_hours;
        }
        else
            this.hour+=h;
    }
    public void setMinutes(int m){
        if ((this.min +m)>59) {
            int mins_left=60-this.min;
            int additional_mins=(this.min + m)%60;
            this.min=mins_left+additional_mins;
            int additional_hours= (this.min +m)/60;
            setHours(additional_hours);
        }
        else{
            this.min+=m;
        }
    }
    public void setSeconds(int s){
        if ((this.sec+s)>59){
            int secs_left=60-this.sec;
            int additional_secs=(this.sec + s)%60;
            this.min=0;
            this.min=secs_left+additional_secs;
            int additional_mins= (this.sec +s)/60;
            setMinutes(additional_secs);
        }
        else{
            this.sec+=s;
        }
    }
    public void advanceBy(int seconds) { // changes the time by a given number of seconds.
        int temp=this.sec+seconds;
        setSeconds(temp);
    }

    //methods
    public String toString() { // produces a string like "22:03:12". The hours should be between 0 and 23, and the minutes and seconds should be between 0 and 59.
        return (String.format("%02d : %02d : %02d",this.hour,this.min,this.sec));
    }

    public int compareTo(TimeV1 t) { //produces the number of seconds from t to this. That is, t.advanceBy(this.compareTo(t)) should set t to the same time as this.
        int totalSecs= (this.hour*3600)+(this.min*60)+this.sec;
        int tSecs= (t.hour*3600)+(t.min*60)+t.sec;
        if (totalSecs>tSecs)
            return (totalSecs-tSecs);
        else
            return (tSecs-totalSecs);
    }
    public boolean equals(TimeV1 another) { //returns true if and only if the times have the same value.
        int difference = compareTo(another);
        if (difference==0)
            return true;
        else
            return false;
    }


}