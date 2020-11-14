package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

//Cat is an Animal and Object
class Cat extends Animal implements Pet {

    public Cat() {
    }

    public Cat(String name) {
        System.out.println("Cat is created");
        this.name = name;
    }

    public void climb() {
        System.out.println("Cat climbs a tree.");
    }

    //Override pet() method declared inside Pet interface
    @Override
    public void pet() {
        System.out.println(name + " purrs.");
    }

    //Override eat() method declared inside Animal class
    @Override
    public void eat() {
        System.out.println("Cat eats cat's food.");
    }
}
