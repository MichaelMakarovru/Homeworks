package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

//Dog is an Animal and Object
final class Dog extends Animal implements Pet {

    public Dog(String name) {
        this.name = name;
    }

    public void huntDucks() {
        System.out.println("Dog hunts ducks.");
    }

    //Override pet() method declared inside Pet interface
    @Override
    public void pet() {
        System.out.println("Dog barks.");
    }

    //Override eat() method declared inside Animal class
    @Override
    public void eat() {
        System.out.println(name + " eats dog's food.");
    }
}
