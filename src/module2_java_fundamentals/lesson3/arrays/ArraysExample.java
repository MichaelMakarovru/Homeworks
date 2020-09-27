package module2_java_fundamentals.lesson3.arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;
        System.out.println("myIntArray length = " + myIntArray.length);
        printIntArray(myIntArray);

        char[] myCharArray = new char[]{'a', 'b', 'c', 'd'};
        System.out.println("myCharArray length = " + myCharArray.length);
        printCharArray(myCharArray);
    }

    public static void printIntArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printCharArray(char[] array) {

        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println();
    }
}
