package TimeClass.TimeTest;
import TimeClass.version1.TimeV1;
public class TimeTestv1 {
    public static void main(String[] args) {
        TimeClass.version1.TimeV1 t1=new TimeClass.version1.TimeV1(23,58,58);
        System.out.println("the time is " + t1);
        t1.advanceBy(9880);
        System.out.println("the time is " + t1);
        TimeClass.version1.TimeV1 t3=new TimeClass.version1.TimeV1(1,36,58);
        if (t1.equals(t3)==true)
            System.out.println("Both the times are equal");
        else
            System.out.println("Both the times are not equal");


    }

}
