package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

class Main {

    public static void main(String[] args) {
        //We cannot create instance of abstract class
       // Animal animal = new Animal();
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        Kitten kitten = new Kitten("Kitten");
        Tiger tiger = new Tiger("Tiger");

        cat.eat();
        dog.eat();
        kitten.eat();
        tiger.eat();

        cat.sleep();
        dog.sleep();
        kitten.sleep();
        tiger.sleep();

        cat.pet();
        dog.pet();
        kitten.pet();
        //Tiger is not a pet
        //tiger.pet();

        System.out.println();

        //If class implements few interfaces with the same abstract methods,
        //it must implement this method only once.
        Pet parrot = new Parrot();
        parrot.pet();
        HelloPet parrot2 = (HelloPet) parrot;
        parrot2.pet();
        System.out.println();

        //Object of parent class is created every time we create child object.
        Cat cat1 = new Cat("Cat");
        Kitten kitten1 = new Kitten("Kitten");
        kitten.climb();
    }
}
