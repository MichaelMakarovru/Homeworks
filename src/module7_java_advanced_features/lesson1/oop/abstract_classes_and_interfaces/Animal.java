package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

abstract class Animal {

    public String name;

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " sleeps.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
