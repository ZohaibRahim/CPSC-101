package TimeClass.TimeTest;
import TimeClass.version2.TimeV2;
public class TimeTestv2 {
    public static void main(String[] args) {
        TimeClass.version2.TimeV2 t1=new TimeClass.version2.TimeV2(58);
        System.out.println("the time is " + t1);
        t1.advanceBy(9880);
        System.out.println("the time is " + t1);

        TimeClass.version2.TimeV2 t2=new TimeClass.version2.TimeV2(521);
        System.out.println("the time is "+t2);
        t2.advanceBy(81);
        System.out.println("the time is "+t2);

        if (t2.equals(t1)==true)
            System.out.println("Both the times are equal");
        else
            System.out.println("Both the times are not equal");
    }
}
