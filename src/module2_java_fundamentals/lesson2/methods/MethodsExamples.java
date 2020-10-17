package module2_java_fundamentals.lesson2.methods;

public class MethodsExamples {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "Spike";
        dog.age = 1;

        dog.eat();
        dog.run();
        dog.makeNoise();
        int y = dog.getDogAge();
        System.out.println("Age = " + y);
        System.out.println(dog.age);
        dog.setName("Bike");
        System.out.println(dog.name);
        System.out.println();


    }
}
