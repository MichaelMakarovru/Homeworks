package module2_java_fundamentals.lesson3.datesandtime.localdate;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        time = time.plusHours(2);
        System.out.println(time);

        time = time.plusMinutes(30);
        System.out.println(time);

        time = LocalTime.now();
        System.out.println(time);
        time = time.plusSeconds(30);
        System.out.println(time);

        time = time.plus(1, ChronoUnit.HOURS);
        System.out.println(time);

        time = LocalTime.now();
        int hour = time.getHour();
        System.out.println(hour);
        int minute = time.getMinute();
        System.out.println(minute);
        int second = time.getSecond();
        System.out.println(second);

        time = LocalTime.of(13, 0, 0);
        System.out.println(time);
    }
}
