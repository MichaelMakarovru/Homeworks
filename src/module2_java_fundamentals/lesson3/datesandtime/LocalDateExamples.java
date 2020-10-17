package module2_java_fundamentals.lesson3.datesandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateExamples {

    public static void main(String[] args) {

        //LocalDate only contains date value
        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = date.plusDays(6);
        System.out.println(date);

        date = date.minusDays(6);
        System.out.println(date);

        date = date.plus(1, ChronoUnit.MONTHS);
        System.out.println(date);

        date = date.plus(31, ChronoUnit.DAYS);
        System.out.println(date);

        date = date.plus(10, ChronoUnit.YEARS);
        System.out.println(date);

        date = date.minusMonths(1);
        System.out.println(date);

        date = date.minusDays(31);
        System.out.println(date);

        date = date.minusYears(10);
        System.out.println(date);

        date = date.plusWeeks(1);
        System.out.println(date);

        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        int dayOfYear = date.getDayOfYear();
        System.out.println(dayOfYear);

        int monthValue = date.getMonthValue();
        System.out.println(monthValue);

        date = LocalDate.of(2000, 1, 1);
        System.out.println(date);

        date = LocalDate.of(1984, Month.NOVEMBER, 1);
        System.out.println(date);
    }
}
