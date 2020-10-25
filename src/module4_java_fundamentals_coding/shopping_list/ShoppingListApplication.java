package module4_java_fundamentals_coding.shopping_list;

import java.util.Scanner;

import static module4_java_fundamentals_coding.shopping_list.MainMenu.*;

class ShoppingListApplication {

    private static MainMenu mainMenu;
    private static ShoppingList shoppingList;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mainMenu = new MainMenu();
        shoppingList = new ShoppingList();

        System.out.println("Welcome to Shopping list application!");

        byte userInput;

        do {
            mainMenu.displayMainMenu();
            userInput = scanner.nextByte();
            processUserInput(userInput);

        } while (userInput != OPTION_EXIT_APP);

        System.out.println("Thank you for using our application. Have a nice day!");
    }

    private static void processUserInput(byte userInput) {

        switch (userInput) {
            case OPTION_ADD_PRODUCT: {
                Product product = mainMenu.createProduct();
                shoppingList.addProduct(product);
                break;
            }
            case OPTION_EDIT_PRODUCT: {
                shoppingList.displayShoppingList();
                if (!shoppingList.isEmpty()) {
                    int input = mainMenu.readInput();
                    Product product = mainMenu.editProduct();
                    shoppingList.editProduct(input - 1, product);
                }
                break;
            }
            case OPTION_MARK_PRODUCT_AS_BOUGHT: {
                shoppingList.displayShoppingList();
                if (!shoppingList.isEmpty()) {
                    int input = mainMenu.readInput();
                    shoppingList.markAsBought(input - 1);
                }
                break;
            }
            case OPTION_UNMARK_PRODUCT_AS_BOUGHT: {
                shoppingList.displayShoppingList();
                if (!shoppingList.isEmpty()) {
                    int input = mainMenu.readInput();
                    shoppingList.unmarkAsBought(input - 1);
                }
                break;
            }
            case OPTION_DISPLAY_LIST: {
                shoppingList.displayShoppingList();
                break;
            }
            case OPTION_REMOVE_PRODUCT: {
                shoppingList.displayShoppingList();
                if (!shoppingList.isEmpty()) {
                    int input = mainMenu.readInput();
                    if (mainMenu.isConfirmed()) {
                        shoppingList.removeProduct(input - 1);
                    }
                }
                break;
            }
            case OPTION_CLEAR_LIST: {
                if (mainMenu.isConfirmed()) {
                    shoppingList.clearList();
                }
                break;
            }
            case OPTION_EXIT_APP: {
                break;
            }
            default: {
                System.out.println("Unknown command. Please try again.");
            }
        }
    }
}
