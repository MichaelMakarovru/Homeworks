package module2_java_fundamentals.lesson3.datesandtime;

import java.time.LocalDate;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        //Date is a legacy class. It was used before Java 8
        //Do not use it, if possible
        Date date = new Date();
        System.out.println(date);

        date = new Date(2020, 1, 1);
        System.out.println(date);

        LocalDate localDate = LocalDate.of(2020, 1, 1);
        System.out.println(localDate);
    }
}
