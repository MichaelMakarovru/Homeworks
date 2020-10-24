package module4_java_fundamentals_coding.exercise11;

import java.util.Scanner;

class LongestString {

    private static final String EXIT_COMMAND = "Enough!";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        String longestString = "";

        do {
            input = scanner.next();

            if (!input.equals(EXIT_COMMAND) && input.length() > longestString.length()) {
                longestString = input;
            }

        } while (!input.equals(EXIT_COMMAND));

        if (longestString.isEmpty()) {
            System.out.println("No text provided");
        } else {
            System.out.println("Longest string: " + longestString);
        }
    }
}
