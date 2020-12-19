package module9_java_advanced_coding.ex_24_basket;

class BasketEmptyException extends RuntimeException {

    public BasketEmptyException() {
    }

    public BasketEmptyException(String message) {
        super(message);
    }
}
