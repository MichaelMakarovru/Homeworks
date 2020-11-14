package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

public interface Pet {

    void pet();
    default void hello() {
        System.out.println("Hello");
    }
}
