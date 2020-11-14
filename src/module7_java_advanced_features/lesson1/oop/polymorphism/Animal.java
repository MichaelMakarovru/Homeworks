package module7_java_advanced_features.lesson1.oop.polymorphism;

//Animal is an Object
class Animal { //Animal extends Object by default

    public void eat() {
        System.out.println("Animal eats.");
    }

    public void sleep() {
        System.out.println("Animal sleeps.");
    }

    //Override toString() method declared inside Object class
    @Override
    public String toString() {
        return "Some animal.";
    }
}
