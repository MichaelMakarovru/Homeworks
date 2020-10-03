package module2_java_fundamentals.lesson4.stringFormatting;

public class StringFormattingExamples {

    public static void main(String[] args) {
        /*
            d - integer
            c - unicode symbol
            b - boolean
            s - string
            f - float
            % - literal
         */

        double x = 3.45793;
        System.out.println(x);
        //output double with 2 digits after the point
        System.out.format("%.2f", x);
        System.out.println();

        int y = 5;
        System.out.println(y + " " + x);
        System.out.format("%d %.2f", y, x);
        System.out.println();
        System.out.println();
        //Draw table with format method
        System.out.println("Draw table");
        System.out.println("-----------------");
        System.out.format("|%7s|%7s|", "float", "int");
        System.out.println();
        System.out.println("-----------------");
        System.out.format("|%7.2f|%7d|", 3.45793, 5);
        System.out.println();
        System.out.format("|%7.2f|%7d|", 2.4, 98);
        System.out.println();
        System.out.format("|%7.2f|%7d|", 5.0, 345);
        System.out.println();
        System.out.println("-----------------");

        //align strings
        System.out.println();
        System.out.format("%10s %-10s %s", "Hi", "Hi", "Hi");
        System.out.println();
        System.out.format("%10s %-10s %s", "Hello", "Hello", "Hello");
        System.out.println();

        boolean isTrue = true;
        System.out.format("%10b", isTrue);
    }
}
