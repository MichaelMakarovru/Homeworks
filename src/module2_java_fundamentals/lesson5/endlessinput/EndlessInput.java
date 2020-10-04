package module2_java_fundamentals.lesson5.endlessinput;

import java.util.Scanner;

public class EndlessInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        do {
            System.out.print("Please enter an integer number: ");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);
    }
}
