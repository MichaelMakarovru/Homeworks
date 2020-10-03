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
        System.out.format("%.2f", x);
        System.out.println();

        int y = 5;
        System.out.println(y + " " + x);
        System.out.format("%d %.2f", y, x);
        System.out.println();
        System.out.println("-------------");
        System.out.format("|%5s|%5s|", "float", "int");
        System.out.println();
        System.out.println("-------------");
        System.out.format("|%5.2f|%5d|", x, y);
        System.out.println();
        System.out.format("|%5.2f|%5d|", x, y);
        System.out.println();
        System.out.format("|%5.2f|%5d|", x, y);
        System.out.println();
        System.out.println("-------------");

        System.out.println();
        System.out.format("%10s %-10s %s", "Hi", "Hi", "Hi");
        System.out.println();
        System.out.format("%10s %-10s %s", "Hello", "Hello", "Hello");
        System.out.println();

        boolean isTrue = true;
        System.out.format("%10b", isTrue);
    }
}
