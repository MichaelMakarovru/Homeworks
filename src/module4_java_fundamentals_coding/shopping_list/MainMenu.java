package module4_java_fundamentals_coding.shopping_list;

import java.util.Scanner;

class MainMenu {

    public static final byte OPTION_ADD_PRODUCT = 1;
    public static final byte OPTION_EDIT_PRODUCT = 2;
    public static final byte OPTION_MARK_PRODUCT_AS_BOUGHT = 3;
    public static final byte OPTION_UNMARK_PRODUCT_AS_BOUGHT = 4;
    public static final byte OPTION_DISPLAY_LIST = 5;
    public static final byte OPTION_REMOVE_PRODUCT = 6;
    public static final byte OPTION_CLEAR_LIST = 7;
    public static final byte OPTION_EXIT_APP = 8;

    private final Scanner scanner = new Scanner(System.in);
    private final String[] measurementUnits = new String[]
            {"kg", "g", "mg", "oz", "lb", "l", "ml", "gal", "unit(s)", "package(s)"};

    public void displayMainMenu() {

        System.out.println();
        System.out.println("Main menu");
        System.out.println("=========");
        System.out.println(OPTION_ADD_PRODUCT + ") Add product");
        System.out.println(OPTION_EDIT_PRODUCT + ") Edit product");
        System.out.println(OPTION_MARK_PRODUCT_AS_BOUGHT + ") Mark as bought");
        System.out.println(OPTION_UNMARK_PRODUCT_AS_BOUGHT + ") Unmark as bought");
        System.out.println(OPTION_DISPLAY_LIST + ") Display list");
        System.out.println(OPTION_REMOVE_PRODUCT + ") Remove product");
        System.out.println(OPTION_CLEAR_LIST + ") Clear list");
        System.out.println(OPTION_EXIT_APP + ") Exit application");

        System.out.println();
        System.out.print("Please make your selection: ");
    }

    public Product createProduct() {

        System.out.println();
        System.out.print("Please enter a product name: ");
        String name = scanner.next();
        System.out.print("Please enter a product quantity: ");
        double quantity = scanner.nextDouble();
        displayMeasurementUnits();
        System.out.print("Please choose measurement units: ");
        int input = scanner.nextInt();
        String measurementUnit = measurementUnits[input - 1];

        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setMeasurementUnits(measurementUnit);
        return product;
    }

    public Product editProduct() {

        Product product = new Product();

        System.out.println();
        System.out.print("Do you want to edit product name? (y/n): ");
        String answer = scanner.next().toUpperCase();
        if (answer.equals("Y")) {
            System.out.print("Please enter a product name: ");
            String name = scanner.next();
            product.setName(name);
        }

        System.out.print("Do you want to edit product quantity? (y/n): ");
        answer = scanner.next().toUpperCase();
        if (answer.equals("Y")) {
            System.out.print("Please enter a product quantity: ");
            double quantity = scanner.nextDouble();
            product.setQuantity(quantity);
        }

        System.out.print("Do you want to edit product measurement units? (y/n): ");
        answer = scanner.next().toUpperCase();
        if (answer.equals("Y")) {
            displayMeasurementUnits();
            System.out.print("Please choose measurement units: ");
            int input = scanner.nextInt();
            String measurementUnit = measurementUnits[input - 1];
            product.setMeasurementUnits(measurementUnit);
        }

        return product;
    }

    public boolean isConfirmed() {
        System.out.println();
        System.out.print("Do you really want to delete product(s)? (y/n): ");
        String input = scanner.next().toUpperCase();
        if (input.equals("Y")) {
            return true;
        }
        return false;
    }

    public int readInput() {
        System.out.println();
        System.out.print("Please choose a number: ");
        return scanner.nextInt();
    }

    public void displayMeasurementUnits() {
        System.out.println();
        for (int i = 0; i < measurementUnits.length; i++) {
            System.out.println((i + 1) + ") " + measurementUnits[i]);
        }
    }
}
