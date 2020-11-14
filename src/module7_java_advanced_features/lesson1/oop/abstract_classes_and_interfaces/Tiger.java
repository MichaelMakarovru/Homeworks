package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

class Tiger extends Animal {

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
    }
}
