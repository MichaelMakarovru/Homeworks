package module9_java_advanced_coding.ex_26_car;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        Manufacturer toyota = new Manufacturer("Toyota", 1918, new ArrayList<>());
        Manufacturer audi = new Manufacturer("Audi", 1932, new ArrayList<>());
        Manufacturer ford = new Manufacturer("Ford", 1915, new ArrayList<>());

        Model prius = new Model("Prius", 2002, new ArrayList<>());
        Model a8 = new Model("A8", 1994, new ArrayList<>());
        Model a5 = new Model("A5", 2007, new ArrayList<>());
        Model focus = new Model("Focus", 1990, new ArrayList<>());

        Car priusSedan = new Car("Prius", "Prius sedan", CarType.SEDAN);
        Car priusHatchback = new Car("Prius", "Prius hatchback", CarType.HATCHBACK);
        Car a8Sedan = new Car("A8", "A8", CarType.SEDAN);
        Car a5Coupe = new Car("A5", "A5 coupe", CarType.COUPE);
        Car a5Cabriolet = new Car("A5", "A5 cabriolet", CarType.CABRIOLET);
        Car focusSedan = new Car("Focus", "Focus", CarType.SEDAN);

        prius.cars.add(priusSedan);
        prius.cars.add(priusHatchback);
        a8.cars.add(a8Sedan);
        a5.cars.add(a5Coupe);
        a5.cars.add(a5Cabriolet);
        focus.cars.add(focusSedan);

        toyota.models.add(prius);
        audi.models.add(a8);
        audi.models.add(a5);
        ford.models.add(focus);
    }
}
