package module7_java_advanced_features.lesson1.oop.composition;

class Main {

    public static void main(String[] args) {

        Car car = new Car(new Engine());
        car.drive();
        System.out.println();

        TV tv = new TV(new RemoteControl());
        tv.change(1);
        tv.change(21);
        tv.change(101);
    }
}
