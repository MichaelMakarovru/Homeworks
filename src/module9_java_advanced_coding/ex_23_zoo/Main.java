package module9_java_advanced_coding.ex_23_zoo;

class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.addAnimal("Tiger", 2);
        zoo.addAnimal("Tiger", 2);
        zoo.addAnimal("Lion", 2);
        zoo.addAnimal("Elephant", 2);
        zoo.addAnimal("Wolf", 6);
        zoo.addAnimal("Lion", 3);

        System.out.println(zoo);
        System.out.println();

        System.out.println("Animal count: " + zoo.getNumberOfAllAnimals());
        System.out.println("Count of each animal: " + zoo.getAnimalsCount());
        System.out.println();

        System.out.println("Sorted animals: " + zoo.getAnimalsCountSorted());
    }
}
