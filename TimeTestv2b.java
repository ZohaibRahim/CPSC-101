package TimeClass.TimeTest;

import TimeClass.version2b.TimeV2b;

public class TimeTestv2b {

    public static void main(String[] args) {
        TimeV2b.TimeInterface ti = (TimeV2b.TimeInterface) new TimeClass.version1b.TimeV1b(12, 30, 0);

        // Testing TimeV2b methods through TimeInterface
        System.out.println("Second: " + ti.getSecond());
    }
}

