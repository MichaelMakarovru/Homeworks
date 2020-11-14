package module7_java_advanced_features.lesson1.oop.inheritance;

class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        //animal.climb();
        System.out.println(animal);
        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.eat("mouse");
        cat.sleep();
        cat.climb();
        //cat.huntDucks();
        System.out.println(cat);
        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.huntDucks();
        //dog.climb();
        System.out.println(dog);
        System.out.println();

        Kitten kitten = new Kitten();
        kitten.eat();
        kitten.eat("mouse");
        kitten.sleep();
        kitten.climb();
        System.out.println(kitten);
        System.out.println();

        Dog dog1 = new Dog();
        dog1.name = "Spike";
        Dog dog2 = new Dog();
        dog2.name = "Spike";
        Dog dog3 = dog2;
        System.out.println("Dog1 == Dog2: " + (dog1 == dog2));
        System.out.println("Dog3 == Dog2: " + (dog3 == dog2));
        System.out.println("Dog1 equals Dog2: " + (dog1.equals(dog2)));
        System.out.println();

        Dog dog4 = null;
        System.out.println(dog4);
        System.out.println();

        double x = 5.32;
        int y = (int) x;
        System.out.println(y);
        System.out.println();
    }
}
