package module9_java_advanced_coding.ex_24_basket;

class Main {

    public static void main(String[] args) {

        Basket<String> basket = new Basket<>();

        System.out.println("Current number: " + basket.getNumberOfItems());

        try {
            for (int i = 0; i < 11; i++) {
                basket.addToBasket("Apple");
                System.out.println("Current number: " + basket.getNumberOfItems());
            }
        } catch (BasketFullException e) {
            System.out.println("Exception is thrown: " + e.getMessage());
        }

        System.out.println("Current number: " + basket.getNumberOfItems());

       // try {
            for (int i = 0; i < 12; i++) {
                basket.removeFromBasket("Apple");
                System.out.println("Current number: " + basket.getNumberOfItems());
            }
//        } catch (BasketEmptyException e) {
//            System.out.println("Exception is thrown: " + e.getMessage());
//        }
        System.out.println("Current number: " + basket.getNumberOfItems());
        System.out.println("Program ended successfully.");
    }
}
