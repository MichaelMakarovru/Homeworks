package module2_java_fundamentals.lesson4.homework;

/*
    Write a Java program that accepts an integer (n) and displays
    n, nn, nnn, nnnn, nnnnn.
    Input: 5 Output: 5, 55, 555, 5555, 55555
 */

public class Homework {

    public static void main(String[] args) {

        int n = 5;
        solution(n);
        solution2(n);
    }

    public static void solution(int n) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                stringBuilder.append(n);
            }
            if (i < 5) {
                stringBuilder.append(", ");
            }
        }

        System.out.println(stringBuilder.toString());
    }

    public static void solution2(int n) {

        int currentNumber = 0;
        int multiplier = 10;
        while (currentNumber < 10000) {

            currentNumber = currentNumber * multiplier + n;
            System.out.print(currentNumber);
            if (currentNumber < 10000) {
                System.out.print(", ");
            }
        }
    }
}
