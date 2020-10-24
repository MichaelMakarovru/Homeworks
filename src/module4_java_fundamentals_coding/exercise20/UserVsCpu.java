package module4_java_fundamentals_coding.exercise20;

import java.util.Random;
import java.util.Scanner;

class UserVsCpu {

    public static int play() {

        Scanner scanner = new Scanner(System.in);

        byte numberToGuess = getNumber();

        byte userInput;
        int tries = 0;
        do {
            tries++;
            System.out.print("Please enter number: ");
            userInput = scanner.nextByte();
            displayResult(userInput, numberToGuess);
        } while (userInput != numberToGuess);
        System.out.println("Tries: " + tries);
        return tries;
    }

    private static byte getNumber() {
        Random random = new Random();
        return (byte) random.nextInt(100);
    }

    private static void displayResult(byte inputNumber, byte numberToGuess) {

        if (inputNumber < numberToGuess) {
            System.out.println("Too little.");
        } else if (inputNumber > numberToGuess) {
            System.out.println("Too much.");
        } else {
            System.out.println("Congratulations!");
        }
    }
}
