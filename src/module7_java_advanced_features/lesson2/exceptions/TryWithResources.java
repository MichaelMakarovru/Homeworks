package module7_java_advanced_features.lesson2.exceptions;

import java.util.Scanner;

class TryWithResources {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        //Next code example is the same as above.
        //Try-with-resources automatically closes objects declared
        //to free recourses. In this case we can avoid using finally block to close
        //recourses. Class used must implement Closable or AutoClosable interface.
        try (Scanner s = new Scanner(System.in)) {
            int x = s.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
