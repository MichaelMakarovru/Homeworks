package module2_java_fundamentals.lesson3.datesandtime.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

    public static void main(String[] args) {

        /*
            MMMM - full month name
            MMM - sep
            MM - number of month (09, 08)
            M - 09 -> 9 , 12 -> 12
            dd - days (01, 02...31)
            d - days (1, 2, 3...31)
            yyyy - years (four digits of year)
            yy - years(last two digits of year)
            hh - hours (12 hour format)
            h - hours 1 digit (12 hour format)
            HH - hours (00..23 hour format)
            H - hours (0..23 hour format)
            mm - minutes
            m - minutes 1 digit
         */

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("hh:mm, dd MMMM, yyyy");
        System.out.println(localDateTime.format(formatter));

        localDateTime = LocalDateTime.of(2020, Month.SEPTEMBER, 27, 13, 0);
        formatter
                = DateTimeFormatter.ofPattern("HH:mm, dd MMMM, yyyy");
        System.out.println(localDateTime.format(formatter));

        formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("11 12 2020", formatter);
        System.out.println(date);

        formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        date = LocalDate.parse("11 12 2020", formatter);
        System.out.println(date);

        formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        date = LocalDate.parse("2020 11 26", formatter);
        System.out.println(date);

        formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd");
        date = LocalDate.parse("2020 November 26", formatter);
        System.out.println(date);

        formatter = DateTimeFormatter.ofPattern("yyyy MMM dd");
        date = LocalDate.parse("2020 Nov 26", formatter);
        System.out.println(date);

        LocalTime time = LocalTime.parse("09:30", DateTimeFormatter.ISO_TIME);
        System.out.println(time);

        formatter = DateTimeFormatter.ofPattern("hh mm a");
        time = LocalTime.parse("09 30 AM", formatter);
        System.out.println(time);

        formatter = DateTimeFormatter.ofPattern("hh mm a");
        time = LocalTime.parse("09 30 PM", formatter);
        System.out.println(time);

        formatter = DateTimeFormatter.ofPattern("MM dd yyyy hh mm a");
        localDateTime = LocalDateTime.parse("11 12 2020 01 30 PM", formatter);
        System.out.println(localDateTime);
    }
}
