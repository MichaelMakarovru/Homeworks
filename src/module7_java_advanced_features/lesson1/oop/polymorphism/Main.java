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

        animals[0] = cat;
        animals[1] = dog;
        animals[2] = kitten;
        animals[3] = mouse;
        animals[4] = animal;
        animals[5] = dolphin;

        feedAnimals(animals);
        System.out.println();

        Dolphin dolphin1 = new Dolphin();
        dolphin1.eat("fish");
        dolphin1.eat();
        dolphin1.eat("fish", 5);
        System.out.println();

        Cat cat1 = new Cat();
        cat1.climb();
        Animal animal1 = cat1;
        //animal1.climb();
        Cat cat2 = (Cat) animal1;
        cat2.climb();
        //We cannot cast dog to cat
//        animal1 = dog;
//        Cat cat3 = (Cat) animal1;
//        cat3.climb();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Kitten();
//        cats[2] = new Dog();
//        cats[2] = new Animal();
    }

    public static void feedAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep();
//            animals[i].climb();
//            animals[i].huntDucks();
        }
    }
}
