package module7_java_advanced_features.lesson4.functional_programming.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", true, false, false, true));
        animals.add(new Animal("Sea turtle", false, true, false, true));
        animals.add(new Animal("Dolphin", true, true, false, false));
        animals.add(new Animal("Duck", false, true, true, false));

        AnimalService service = new AnimalService();
        //Old approach. Declare new method for each purpose
//        System.out.println("Animals can hop:");
//        service.printCanHop(animals);
//        System.out.println("Animals can swim:");
//        service.printCanSwim(animals);
//        System.out.println("Animals can fly:");
//        service.printCanFly(animals);

        //Functional programming approach.
        //Declare one method and use it.
        Predicate<Animal> predicate = a -> a.canHop();
        System.out.println("Animals can hop:");
        service.printAnimals(animals, predicate);

        predicate = (Animal a) -> {return a.canSwim();};
        System.out.println("Animals can swim:");
        service.printAnimals(animals, predicate);

        predicate = a -> a.canFly();
        System.out.println("Animals can fly:");
        service.printAnimals(animals, predicate);

        predicate = a -> a.canCrawl();
        System.out.println("Animals can crawl:");
        service.printAnimals(animals, predicate);
    }
}
