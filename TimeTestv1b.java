package TimeClass.TimeTest;

import TimeClass.version1b.TimeV1b.TimeInterface;

public class TimeTestv1b {
    public static void main(String[] args) {
        TimeInterface ti = (TimeInterface) new TimeClass.version1b.TimeV1b(12, 30, 0);

        // Testing TimeV1b methods through TimeInterface
        System.out.println("Hour: " + ti.getHour());
        System.out.println("Minute: " + ti.getMinute());
        System.out.println("Second: " + ti.getSecond());
    }
}
