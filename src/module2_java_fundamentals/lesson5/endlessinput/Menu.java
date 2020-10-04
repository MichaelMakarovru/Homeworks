package module2_java_fundamentals.lesson5.endlessinput;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;

        do {
            printMenu();
            input = scanner.nextInt();
            doSomething(input);
            System.out.println();
        } while (input != 3);
    }

    private static void printMenu() {
        System.out.println("Main menu");
        System.out.println("1 - Say Hello");
        System.out.println("2 - Say Labdien");
        System.out.println("3 - Exit");
    }

    private static void doSomething(int input) {
        if (input == 1) {
            System.out.println("Hello!");
        } else if (input == 2) {
            System.out.println("Labdien!");
        }
    }
}
