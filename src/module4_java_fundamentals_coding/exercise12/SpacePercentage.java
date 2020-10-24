package module4_java_fundamentals_coding.exercise12;

import java.util.Scanner;

class SpacePercentage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input text: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        int spacesCount = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                spacesCount++;
            }
        }

        double percentage = spacesCount * 100.00 / charArray.length;

        System.out.format("Percentage: %.2f",  percentage);
    }
}
