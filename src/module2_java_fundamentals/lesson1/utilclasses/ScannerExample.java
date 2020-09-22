package module2_java_fundamentals.lesson1.utilclasses;
//Don't forget to import Scanner class
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        //Create a Scanner instance and pass System.in stream as a parameter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        //Read an integer using nextInt() method
        int x = scanner.nextInt();
        System.out.print("Please enter a string: ");
        //Read a line using next() method
        String s = scanner.next();
        System.out.print("Please enter a floating point number: ");
        //Read a double using nextDouble() method
        double y = scanner.nextDouble();
        System.out.println(x);
        System.out.println(s);
        System.out.println(y);
    }
}
