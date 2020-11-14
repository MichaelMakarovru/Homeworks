package module7_java_advanced_features.lesson1.oop.composition;

class Car {
    //Car has an engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    //We are reusing engine functional inside car class
    public void drive() {
        engine.work();
        System.out.println("Car drives.");
    }
}
