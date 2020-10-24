package module4_java_fundamentals_coding.exercise17;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DaysTillNextLessonCalculator {

    private static final String PATTERN = "dd MM yyyy";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter next lesson date in '" + PATTERN +  "' format: ");
        String nextLessonDateString = scanner.nextLine();

        LocalDate date = getNextLessonDateWithFormatter(nextLessonDateString);
        System.out.println("Days till next lesson: " + getDaysBetween(date, LocalDate.now()));

        LocalDate date2 = getNextLessonDate(nextLessonDateString);
        System.out.println("Days till next lesson: " + getDaysBetween(date2, LocalDate.now()));
    }

    private static LocalDate getNextLessonDateWithFormatter(String nextLessonDateString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);
        return LocalDate.parse(nextLessonDateString, formatter);
    }

    //FYI
    private static LocalDate getNextLessonDate(String nextLessonDateString) {

        String[] dateArray = nextLessonDateString.split("\\s");
        //Parse strings to integers and create LocalDate
        return LocalDate.of(Integer.valueOf(dateArray[2]), Integer.parseInt(dateArray[1]),
                Integer.parseInt(dateArray[0]));
    }

    private static int getDaysBetween(LocalDate firstDate, LocalDate secondDate) {
        Period p = Period.between(firstDate, secondDate);
        if (p.getYears() != 0) {
            return Math.abs(p.getYears() * 365 + p.getDays());
        }
        return Math.abs(p.getDays());
    }
}
