package module7_java_advanced_features.lesson2.exceptions;

//We can create custom unchecked(runtime) exception
class CustomUncheckedException extends RuntimeException {

    public CustomUncheckedException() {
    }

    public CustomUncheckedException(String message) {
        super(message);
    }
}
