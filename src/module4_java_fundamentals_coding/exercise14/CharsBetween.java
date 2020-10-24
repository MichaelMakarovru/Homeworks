package module4_java_fundamentals_coding.exercise14;

import java.util.Scanner;

class CharsBetween {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input character: ");
        char first = scanner.next().charAt(0);
        System.out.print("Please input character: ");
        char second = scanner.next().charAt(0);

        System.out.println(Math.abs(first - second));

    }
}
