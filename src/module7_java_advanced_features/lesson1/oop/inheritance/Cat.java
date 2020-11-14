package module7_java_advanced_features.lesson1.oop.inheritance;

//Cat is an Animal and Object
class Cat extends Animal {

    public void climb() {
        System.out.println("Cat climbs a tree.");
    }

    public void eat(String food) {
        System.out.println("Cat eats " + food + ".");
    }

    //Override eat() method declared inside Animal class
    @Override
    public void eat() {
        System.out.println("Cat eats.");
    }

    @Override
    public String toString() {
        return "This is a cat.";
    }

}
