package module7_java_advanced_features.lesson2.exceptions;

import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {

        //try-catch must use at least one catch clause or finally block.
        try {
            readFile(false);
        } catch (Exception e) {
            System.out.println("ERROR: File not found!");
        }

        //We can use multiple catch blocks and finally block together.
        try {
            readFile(false);
        } catch (IOException e) {
            System.out.println("ERROR: File not found!");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("ERROR: Exception thrown!");
        } finally {
            System.out.println("Finally Block.");
        }

        //We can avoid catch blocks if we use finally.
        try {
            readFile(true);
        } finally {
            System.out.println("Finally Block.");
        }

        print("Hello");

        try {
            print(null);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: String cannot be null!");
        }

        //Using custom exceptions.
        try {
            throwCustomException(0);
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        } catch (CustomUncheckedException e) {
            System.out.println(e.getMessage());
        }

        //Catching multiple exceptions in one catch block.
        try {
            throwCustomException(1);
        } catch (CustomUncheckedException | CustomCheckedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program ended successfully.");
    }

    public static void readFile(boolean fileExists) throws IOException {

        if (!fileExists) {
            throw new IOException("File not found!");
        } else {
            System.out.println("File data!");
        }
    }

    public static void print(String s) {

        if (null == s) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(s);
        }
    }

    public static void throwCustomException(int i) throws CustomCheckedException {

        if (i == 0) {
            throw new CustomCheckedException("Checked exception thrown.");
        } else if (i == 1) {
            throw new CustomUncheckedException("Unchecked exception thrown.");
        } else {
            System.out.println(i);
        }
    }
}
