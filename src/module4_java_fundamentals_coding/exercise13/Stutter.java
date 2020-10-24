package module4_java_fundamentals_coding.exercise13;

import java.util.Scanner;

class Stutter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String input = scanner.nextLine();

        String[] stringArray = input.split("\\s");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            System.out.print(" ");
            System.out.print(stringArray[i]);
            System.out.print(" ");
        }
    }
}
