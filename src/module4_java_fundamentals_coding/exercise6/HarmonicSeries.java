package module4_java_fundamentals_coding.exercise6;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {

        int number = readUserInput();
        System.out.println(calculateHarmonicSeries(number));
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }

    private static double calculateHarmonicSeries(double number) {

        double harmonic = 1;

        for (int i = 2; i <= number; i++) {
            harmonic += 1.0 / i;
        }
        return harmonic;
    }
}
