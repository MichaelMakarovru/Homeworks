package module2_java_fundamentals.lesson1;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        System.out.print("Please enter a string: ");
        String s = scanner.next();
        System.out.println(x);
        System.out.println(s);
    }
}
