package module4_java_fundamentals_coding.exercise20;

import java.util.Random;
import java.util.Scanner;

public class CpuVsUser {

    private static int maxPossible = 99;
    private static int minPossible = 0;

    public static int play() {

        byte numberToGuess = getNumber();

        byte userInput = 100;
        int tries = 0;
        boolean tooMuch = true;
        do {
            tries++;
            userInput = cpuGuess(tooMuch, userInput);
            tooMuch = displayResult(userInput, numberToGuess);
        } while (userInput != numberToGuess);
        System.out.println("Tries: " + tries);
        return tries;
    }

    private static byte getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number for CPU to guess: ");
        return scanner.nextByte();
    }

    private static boolean displayResult(byte inputNumber, byte numberToGuess) {

        if (inputNumber < numberToGuess) {
            System.out.println("Computer guessed: " + inputNumber + ". Too little.");
            return false;
        } else if (inputNumber > numberToGuess) {
            System.out.println("Computer guessed: " + inputNumber + ". Too much.");
            return true;
        } else {
            System.out.println("Computer guessed: " + inputNumber +
                    ". Computer guessed correctly!");
            return false;
        }
    }

    private static byte cpuGuess(boolean tooMuch, int lastInput) {

        if (tooMuch) {
            maxPossible = lastInput - 1;
           return (byte) (maxPossible / 2);
        } else {
            minPossible = lastInput + 1;
            return (byte) ((minPossible + maxPossible) / 2);
        }
    }
}
