package module7_java_advanced_features.lesson2.exceptions;

//We can create custom checked exception
class CustomCheckedException extends Exception {

    public CustomCheckedException() {
    }

    public CustomCheckedException(String message) {
        super(message);
    }
}
