package module4_java_fundamentals_coding.exercise4;

import java.util.Scanner;

class FizzBuzzWriter {

    public static void main(String[] args) {

        int input = readUserInput();

        for (int i = 1; i <= input; i++) {
            display(i);
        }
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    private static void display(int number) {

        if (number % 3 == 0 && number % 7 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 7 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
