package module4_java_fundamentals_coding.exercise5;

import java.util.Scanner;

class DisplayPrimeNumbers {

    public static void main(String[] args) {

        int input = readUserInput();

        for (int i = 1; i < input; i++) {
            if (numberIsPrime(i)) {
              System.out.print(i + " ");
            }
        }
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    private static boolean numberIsPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
