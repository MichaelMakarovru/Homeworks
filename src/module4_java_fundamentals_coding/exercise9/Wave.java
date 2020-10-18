package module4_java_fundamentals_coding.exercise9;

import java.util.Scanner;

class Wave {

    private static final String[] WAVE = new String[]
            { "*      *", " *    * ", "  *  *  ", "   **   " };

    private static final char SYMBOL = '*';

    public static void main(String[] args) {

        int input = readUserInput();
        displayWave(input);
        System.out.println();
        displaySnakeWithSameSegments(input);
        System.out.println();
        displaySnakeWithVariousSegments(input);
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    private static void displayWave(int numberOfTimes) {

        for (int i = 0; i < WAVE.length; i++) {
            for (int j = 0; j < numberOfTimes; j++) {
                System.out.print(WAVE[i]);
            }
            System.out.println();
        }
    }

    private static void displaySnakeWithSameSegments(int numberOfChars) {

        System.out.println(constructSnakeLine(numberOfChars, 1, 8));
        System.out.println(constructSnakeLine(numberOfChars, 2, 7));
        System.out.println(constructSnakeLine(numberOfChars, 3, 6));
        System.out.println(constructSnakeLine(numberOfChars, 4, 5));
    }

    private static String constructSnakeLine
            (int lineLength, int firstSymbolIndex, int lastSymbolIndex) {

        StringBuilder sb = new StringBuilder();

        int counter = 0;

        for (int i = 1; i <= lineLength; i++) {

            counter++;
            if (counter == firstSymbolIndex || counter == lastSymbolIndex) {
                sb.append(SYMBOL);
            } else {
                sb.append(" ");
            }
            if (counter == 8) {
                counter = 0;
            }
        }
        return sb.toString();
    }

    private static void displaySnakeWithVariousSegments(int numberOfChars) {
        System.out.println(constructLine(numberOfChars, 1, 8));
        System.out.println(constructLine(numberOfChars, 2, 7));
        System.out.println(constructLine(numberOfChars, 3, 6));
        System.out.println(constructLine(numberOfChars, 4, 5));
    }

    private static String constructLine
            (int lineLength, int firstSymbolIndex, int lastSymbolIndex) {

        StringBuilder sb = new StringBuilder();

        while (lineLength > 0) {

            int segmentLength = Math.min(lineLength, 8);
            sb.append(constructSegment(segmentLength, firstSymbolIndex, lastSymbolIndex));
            lineLength -= 8;

            segmentLength = Math.min(lineLength, 7);
            sb.append(constructSegment(segmentLength, firstSymbolIndex, lastSymbolIndex - 1));
            lineLength -= 7;
        }

        return sb.toString();
    }

    private static StringBuilder constructSegment
            (int segmentLength, int firstSymbolIndex, int lastSymbolIndex) {

        StringBuilder sb = new StringBuilder();

        int counter = 0;

        for (int i = 1; i <= segmentLength; i++) {

            counter++;
            if (counter == firstSymbolIndex || counter == lastSymbolIndex) {
                sb.append(SYMBOL);
            } else {
                sb.append(" ");
            }
        }
        return sb;
    }
}
