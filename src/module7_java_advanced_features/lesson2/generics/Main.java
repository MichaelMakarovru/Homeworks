package module7_java_advanced_features.lesson2.generics;

class Main {

    public static void main(String[] args) {

        Cat tom = new Cat("Tom");

        //We are using the same Box class to contain cats and dogs
        Box<Cat> catBox = new Box<>();
        catBox.putInABox(tom);
        Cat catFromABox = catBox.emptyBox();
        System.out.println(catFromABox.getName());

        Dog spike = new Dog("Spike");
        Box<Dog> dogBox = new Box<>();
        dogBox.putInABox(spike);
        Dog dogFromABox = dogBox.emptyBox();
        System.out.println(dogFromABox.getName());
        //We cannot use catBox to contain dogs and vice versa
//        catBox.putInABox(spike);
//        dogBox.putInABox(tom);

        GenericClass<Cat, Dog> genericClass = new GenericClass<>();
        genericClass.print(tom, spike);

        //We can put Cat in the animalBox, because Cat extends Animal
        Box<Animal> animalBox = new Box<>();
        animalBox.putInABox(tom);
        print(animalBox);

        Box<String> stringBox = new Box<>();
        stringBox.putInABox("Hello");
        print(stringBox);

        animalBox.putInABox(tom);
        printExtends(animalBox);
        //printExtends(stringBox);

        printSuper(animalBox);
        //printSuper(catBox);
        //printSuper(stringBox);

        printCats(catBox);
    }

    //We can use generic classes as method parameters in methods
    //? - any data type
    private static void print(Box<?> box) {
        System.out.println(box.emptyBox());
    }

    //? extends Animal - Animal or other class inheriting Animal
    private static void printExtends(Box<? extends Animal> box) {
        System.out.println(box.emptyBox().getName());
    }

    //? super Animal - Animal or other class Animal inherits (like Object)
    private static void printSuper(Box<? super Animal> box) {
        System.out.println(box.emptyBox());
    }

    //We can only use boxes with cats in this method
    private static void printCats(Box<Cat> box) {
        System.out.println(box.emptyBox().getName());
    }
}
