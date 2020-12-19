package module9_java_advanced_coding.ex_24_basket;

class Basket<T> {

    private int numberOfItems;

    void addToBasket(T t) throws BasketFullException {

        if (numberOfItems == 10) {
            throw new BasketFullException("Maximum number of items is 10.");
        }
        numberOfItems++;
    }

    void removeFromBasket(T t) {

        if (numberOfItems == 0) {
            throw new BasketEmptyException("Basket is already empty.");
        }

        numberOfItems--;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
