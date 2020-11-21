package module7_java_advanced_features.lesson4.functional_programming.example;

import java.util.List;
import java.util.function.Predicate;

class AnimalService {

    public void printAnimals(List<Animal> animals, Predicate<Animal> predicate) {

        for (Animal animal : animals) {
            if (predicate.test(animal)) {
                System.out.println(animal);
            }
        }
        System.out.println();
    }
    //We don't need all these methods if we are using functional programming

//    public void printCanHop(List<Animal> animals) {
//        for (Animal animal : animals) {
//            if (animal.canHop()) {
//                System.out.println(animal);
//            }
//        }
//        System.out.println();
//    }
//
//    public void printCanSwim(List<Animal> animals) {
//        for (Animal animal : animals) {
//            if (animal.canSwim()) {
//                System.out.println(animal);
//            }
//        }
//        System.out.println();
//    }
//
//    public void printCanFly(List<Animal> animals) {
//        for (Animal animal : animals) {
//            if (animal.canFly()) {
//                System.out.println(animal);
//            }
//        }
//        System.out.println();
//    }
}
