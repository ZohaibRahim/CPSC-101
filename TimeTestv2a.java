package TimeClass.TimeTest;
import TimeClass.version2a.TimeV2a;

public class TimeTestv2a {
    public static void main(String[] args) {
        // Test cases for TimeV2a

        // Normal case
        TimeV2a t1 = new TimeV2a(3600); // Represents 1 hour
        System.out.println("Time t1: " + t1);
        System.out.println("Second: " + t1.getSecond());

        // Boundary case
        TimeV2a t2 = new TimeV2a(86400); // Represents 1 day
        System.out.println("Time t2: " + t2);

        // Edge case
        TimeV2a t3 = new TimeV2a(0); // Represents midnight
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
