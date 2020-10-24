package module4_java_fundamentals_coding.exercise16;

import java.util.Scanner;

class SequenceCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxSequence = 1;
        int currentSequence = 1;
        int lastNumber = readNumber(scanner);

        for (int i = 1; i < 10; i++) {

            int currentNumber = readNumber(scanner);

            if (currentNumber > lastNumber) {
                currentSequence++;
            } else {
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                    System.out.println("Current max sequence: " + maxSequence);
                }
                currentSequence = 1;
            }
            System.out.println("Current sequence: " + currentSequence);
            lastNumber = currentNumber;
        }
        System.out.println("Max sequence: " + maxSequence);
    }

    private static int readNumber(Scanner scanner) {
        System.out.print("Please input a number: ");
        return scanner.nextInt();
    }
}
