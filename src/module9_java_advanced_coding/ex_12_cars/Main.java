package module9_java_advanced_coding.ex_12_cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        CarService carService = new CarService();

        Manufacturer toyota = new Manufacturer
                ("Toyota", 1900, "Japan", new ArrayList<>());
        Manufacturer bmw = new Manufacturer
                ("BMW", 1920, "Germany", new ArrayList<>());
        Manufacturer ford = new Manufacturer
                ("Ford", 1910, "USA", new ArrayList<>());

        carService.addManufacturer(toyota);
        carService.addManufacturer(bmw);
        carService.addManufacturer(ford);

        bmw = carService.getManufacturerByName("bmw");
        System.out.println(bmw.getName());

        carService.removeManufacturer(bmw);
        Manufacturer bmw2 = carService.getManufacturerByName("bmw");
        System.out.println(bmw2);

        carService.removeManufacturerByName("ford");
        Manufacturer ford2 = carService.getManufacturerByName("ford");
        System.out.println(ford2);

        carService.addManufacturer(bmw);
        carService.addManufacturer(ford);

        Car prius = new Car("Toyota", "Prius", new BigDecimal("9000.00"), 2002, Engine.S4);
        toyota.getCars().add(prius);

        Car x5 = new Car("BMW", "X5", new BigDecimal("20000.00"), 2018, Engine.V12);
        bmw.getCars().add(x5);

        Car focus = new Car("Ford", "Focus", new BigDecimal("12000.00"), 2015, Engine.V6);
        ford.getCars().add(focus);

        List<Manufacturer> manufacturers = carService.getAllManufacturers();
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer);
        }
        System.out.println();

        List<Car> cars = carService.getAllCars();
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();

        List<Car> carsWithV12 = carService.getCarsByEngine(Engine.V12);
        for (Car car : carsWithV12) {
            System.out.println(car);
        }
        System.out.println();

        List<Car> carsProducedBefore2016 = carService.getCarsProducedBefore(2016);
        for (Car car : carsProducedBefore2016) {
            System.out.println(car);
        }
        System.out.println();

        List<Car> mostExpensiveCars = carService.getMostExpensiveCars();
        for (Car car : mostExpensiveCars) {
            System.out.println(car);
        }
        System.out.println();

        List<Car> cheapestCars = carService.getCheapestCars();
        for (Car car : cheapestCars) {
            System.out.println(car);
        }
        System.out.println();

        Car avensis = new Car("Toyota", "Avensis", new BigDecimal("1300.00"), 2009, Engine.S6);
        toyota.getCars().add(avensis);

        List<Manufacturer> manufacturerList = carService.getManufacturersByNumberOfCars(2);
        for (Manufacturer manufacturer : manufacturerList) {
            System.out.println(manufacturer);
        }
        System.out.println();

        List<Car> sortedCars = carService.getCarsSortedByName(SortingParameter.ASC);
        for (Car car : sortedCars) {
            System.out.println(car);
        }
        System.out.println();

        sortedCars = carService.getCarsSortedByName(SortingParameter.DESC);
        for (Car car : sortedCars) {
            System.out.println(car);
        }
        System.out.println();

        boolean contains = carService.carExists(prius);
        System.out.println("Prius exists: " + contains);

        contains = carService.carExists(new Car("Mercedes", "123", new BigDecimal("25000"), 2020, Engine.S6));
        System.out.println("Mercedes exists: " + contains);
        System.out.println();

        List<Car> carsByManufacturerYear = carService.getCarsByManufacturer(1911, Operator.LESS);
        for (Car car : carsByManufacturerYear) {
            System.out.println(car);
        }
        System.out.println();
    }
}
