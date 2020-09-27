package module2_java_fundamentals.lesson3.datesandtime.localdate;

import java.time.LocalDate;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        date = new Date(2020, 1, 1);
        System.out.println(date);

        LocalDate localDate = LocalDate.of(2020, 1, 1);
        System.out.println(localDate);
    }
}
