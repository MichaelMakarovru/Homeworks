package module2_java_fundamentals.lesson3.arrays;

import java.util.Random;

public class TwoDimensionArraysExample {

    public static void main(String[] args) {

        int[][] myIntArray = new int[3][3];
        //[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        fillArray(myIntArray);
        printIntArray(myIntArray);
        System.out.println();
        printIntArrayBackwards(myIntArray);
        System.out.println();

        int[][] myIntArray2 = new int[6][];
        fillRandomArray(myIntArray2);
        printIntArray(myIntArray2);
        System.out.println();

        char[][] myCharArray =
                new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'j', 'k'}};
        printCharArray(myCharArray);
    }

    public static void fillArray(int[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public static void fillRandomArray(int[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(5) + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public static void printIntArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printIntArrayBackwards(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printCharArray(char[][] array) {

        int i = 0;
        while (i < array.length) {

            int j = 0;
            while (j < array[i].length) {
                System.out.print(array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
