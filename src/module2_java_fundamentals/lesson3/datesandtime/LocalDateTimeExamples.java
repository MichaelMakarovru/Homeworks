package module2_java_fundamentals.lesson3.datesandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExamples {

    public static void main(String[] args) {

        //LocalDateTime contains both time and date values
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        localDateTime = localDateTime.minusDays(1);
        System.out.println(localDateTime);
        localDateTime = localDateTime.plusHours(2);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusYears(2);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusMinutes(30);
        System.out.println(localDateTime);

        localDateTime
                = LocalDateTime.of(2020, 10, 3, 9, 0);
        System.out.println(localDateTime);

        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 3);
        LocalTime time = LocalTime.of(9, 0);
        localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
    }
}
