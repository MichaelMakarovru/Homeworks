package module2_java_fundamentals.lesson2.conditionaloperators.logicaloperators;

public class LogicalOperatorsExample {

    public static void main(String[] args) {


       /*
        & - AND (true if all operands are true)
        && - short-circuit AND
        | - OR
        || - short-circuit OR
        ^ - XOR
        ! - NOT
        */

        int x = 5;
        int y = 10;

        if (x > 2 & y > 2) {
            System.out.println("x > 2 and y > 2");
        }
        System.out.println();

        if (x < 2 && y > 2) {
            System.out.println("x > 2 and y > 2");
        }
        System.out.println();

        x = 1;
        String s = null;
        if (x < 1 && s.length() > 2) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        if (x > 2 || y < 2) {
            System.out.println("x > 2 || y < 2");
        }

        if (x < 2 || y < 2) {
            System.out.println("x < 2 || y < 2");
        }
        System.out.println();
        if (x < 2 ^ y > 2) {
            System.out.println("x < 2 XOR y > 2");
        }
        System.out.println();

        x = 1;
        boolean xIsGreater = x > 2;

        if (!xIsGreater) {
            System.out.println("x > 2");
        } else {
            System.out.println("x < 2");
        }
    }
}
