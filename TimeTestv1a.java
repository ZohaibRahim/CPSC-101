package TimeClass.TimeTest;
import TimeClass.version1a.TimeV1a;

public class TimeTestv1a {
    public static void main(String[] args) {
        // Test cases for TimeV1a

        // Normal case
        TimeV1a t1 = new TimeV1a(10, 30, 45);
        System.out.println("Time t1: " + t1);
        System.out.println("Hour: " + t1.getHour() + ", Minute: " + t1.getMinute() + ", Second: " + t1.getSecond());

        // Boundary case
        TimeV1a t2 = new TimeV1a(23, 59, 59);
        System.out.println("Time t2: " + t2);

        // Edge case
        TimeV1a t3 = new TimeV1a(0, 0, 0);
        System.out.println("Time t3: " + t3);

        // Test compareTo and equals methods
        if (t1.compareTo(t2) > 0) {
            System.out.println("t1 is later than t2");
        } else {
            System.out.println("t1 is earlier than or equal to t2");
        }

        System.out.println("Is t1 equal to t3? " + t1.equals(t3));
    }
}
