package module7_java_advanced_features.lesson1.oop.polymorphism;

public class Dolphin extends Animal {

    public void eat(String food) {
        System.out.println("Dolphin eats " + food + ".");
    }

    public void eat(String food, int pieces) {
        System.out.println("Dolphin eats " + pieces + " " + food + ".");
    }
}
