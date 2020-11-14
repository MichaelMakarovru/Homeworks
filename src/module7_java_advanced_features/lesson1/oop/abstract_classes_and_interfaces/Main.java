package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

class Main {

    public static void main(String[] args) {

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
        //tiger.pet();

        System.out.println();

        Pet parrot = new Parrot();
        parrot.pet();
        HelloPet parrot2 = (HelloPet) parrot;
        parrot2.pet();
        System.out.println();

        Cat cat1 = new Cat("Cat");
        Kitten kitten1 = new Kitten("Kitten");
        kitten.climb();
    }
}
