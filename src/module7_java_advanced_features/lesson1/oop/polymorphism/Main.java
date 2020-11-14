package module7_java_advanced_features.lesson1.oop.polymorphism;

class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        Cat cat = new Cat();
        Dog dog = new Dog();
        Kitten kitten = new Kitten();
        Mouse mouse = new Mouse();
        Animal animal = new Animal();
        Dolphin dolphin = new Dolphin();

        //We can add any object of a class which inherits Animal class to array of Animal objects.
        //All cats, dogs, kittens, mice and dolphins are also animals (inherit Animal class).
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = kitten;
        animals[3] = mouse;
        animals[4] = animal;
        animals[5] = dolphin;

        feedAnimals(animals);
        System.out.println();

        //Method overloading.
        Dolphin dolphin1 = new Dolphin();
        dolphin1.eat("fish");
        dolphin1.eat();
        dolphin1.eat("fish", 5);
        System.out.println();

        //Cat can climb.
        Cat cat1 = new Cat();
        cat1.climb();

        //Animal type reference points to a Cat object in memory.
        Animal animal1 = cat1;
        //If we are using reference of type Animal, we cannot call climb() method,
        //because this method is not declared in Animal class.
        //animal1.climb();
        //We can cast this object to a Cat type reference to be able to use
        //climb() method again.
        Cat cat2 = (Cat) animal1;
        cat2.climb();
        //We cannot cast dog to cat, although they are both animals.
        // Dogs cannot climb, cats cannot hunt ducks.
//        animal1 = dog;
//        Cat cat3 = (Cat) animal1;
//        cat3.climb();

        //We cannot add Dogs and Animals to the array of Cats, because
        //both Dogs and Animals are not Cats.
        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Kitten();
//        cats[2] = new Dog();
//        cats[2] = new Animal();
    }

    public static void feedAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            //We can call only methods declared in Animal class.
            animals[i].eat();
            animals[i].sleep();
//            animals[i].climb();
//            animals[i].huntDucks();
        }
    }
}
