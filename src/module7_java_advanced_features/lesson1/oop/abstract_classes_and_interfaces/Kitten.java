package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

//Kitten is a Cat, Animal and Object
class Kitten extends Cat {

    public Kitten(String name) {

        super(name);
        System.out.println("Kitten is created");
        super.climb();
    }

    @Override
    public void climb() {
        System.out.println("Kitten climbs a tree.");
    }
}
