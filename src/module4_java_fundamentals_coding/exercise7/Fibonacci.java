package module4_java_fundamentals_coding.exercise7;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int input = readUserInput();
        System.out.println("Fibonacci number No " + input + " = "
                + getFibonacciNumber(input));
        System.out.println("Fibonacci number No " + input + " = "
                + getFibonacciNumberRecursion(input));
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    private static int getFibonacciNumber(int index) {

        int x1 = 0;
        int x2 = 1;

        for (int i = 2; i <= index; i++) {
            int sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
        return x2;
    }

    private static int getFibonacciNumberRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciNumberRecursion(n - 1) + getFibonacciNumberRecursion(n - 2);
    }
}
