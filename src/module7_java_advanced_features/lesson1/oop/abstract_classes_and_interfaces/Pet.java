package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;
//Interface
public interface Pet {

    //Can have public abstract methods
    void pet();
    //Can have methods with implementation, declared with keyword default.
    default void hello() {
        System.out.println("Hello");
    }
}
