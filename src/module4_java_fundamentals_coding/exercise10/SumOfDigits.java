package module4_java_fundamentals_coding.exercise10;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        int number = readUserInput();
        System.out.println(sumDigits(number));
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    private static int sumDigits(int number) {

        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
