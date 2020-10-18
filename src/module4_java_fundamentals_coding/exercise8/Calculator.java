package module4_java_fundamentals_coding.exercise8;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        System.out.print("Please enter first number: ");
        double number1 = getNumber();
        System.out.print("Please enter operation symbol: ");
        String operation =  getOperation();
        System.out.print("Please enter second number: ");
        double number2 = getNumber();

        calculate(number1, number2, operation);
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void calculate
            (double number1, double number2, String operation) {

        switch (operation) {

            case "+" : {
                System.out.println("Result: " + (number1 + number2));
                break;
            }
            case "-" : {
                System.out.println("Result: " + (number1 - number2));
                break;
            }
            case "*" : {
                System.out.println("Result: " + (number1 * number2));
                break;
            }
            case "/" : {
                if (number2 != 0) {
                    System.out.format("Result: %.2f", (number1 / number2));
                } else {
                    System.out.println("Cannot calculate.");
                }
                break;
            }
            default : {
                System.out.println("Invalid operation symbol.");
            }
        }
    }
}
