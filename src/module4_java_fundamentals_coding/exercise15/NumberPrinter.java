package module4_java_fundamentals_coding.exercise15;

import java.util.Scanner;

class NumberPrinter {

    private static final int NUMBER_OF_INPUTS = 10;

    public static void main(String[] args) {

        int[] array = getArray();
        int[] duplicatesArray = new int[NUMBER_OF_INPUTS / 2 + 1];
        int duplicatesArrayIndex = 0;

        for (int i = 0; i < NUMBER_OF_INPUTS - 1; i++) {

            if (isDuplicate(array[i], duplicatesArray, duplicatesArrayIndex)) {
                continue;
            }

            for (int j = i + 1; j < NUMBER_OF_INPUTS; j++) {

                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    duplicatesArray[duplicatesArrayIndex++] = array[i];
                    break;
                }

            }

        }
    }

    private static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[NUMBER_OF_INPUTS];

        for (int i = 0; i < NUMBER_OF_INPUTS; i++) {
            System.out.print("Please input a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static boolean isDuplicate(int number, int[] duplicateArray, int duplicatesArrayIndex) {

        for (int i = 0; i < duplicatesArrayIndex; i++) {
            if (duplicateArray[i] == number) {
                return true;
            }
        }

        return false;
    }
}
