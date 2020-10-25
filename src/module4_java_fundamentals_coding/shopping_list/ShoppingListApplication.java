package module4_java_fundamentals_coding.shopping_list;

class ShoppingListApplication {

    private static MainMenu mainMenu;

    public static void main(String[] args) {

        mainMenu = new MainMenu();

        System.out.println("Welcome to Shopping list application!");

        mainMenu.run();

        System.out.println("Thank you for using our application. Have a nice day!");
    }
}
