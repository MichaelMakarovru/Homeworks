package module9_java_advanced_coding.ex_26_car;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Manufacturer> manufacturers = new ArrayList<>();

        Manufacturer toyota = new Manufacturer("Toyota", 1918, new ArrayList<>());
        Manufacturer audi = new Manufacturer("Audi", 1932, new ArrayList<>());
        Manufacturer ford = new Manufacturer("Ford", 1915, new ArrayList<>());

        manufacturers.add(toyota);
        manufacturers.add(audi);
        manufacturers.add(ford);

        Model prius = new Model("Prius", 2002, new ArrayList<>());
        Model a8 = new Model("A8", 1994, new ArrayList<>());
        Model a5 = new Model("A5", 2007, new ArrayList<>());
        Model focus = new Model("Focus", 2020, new ArrayList<>());

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

        CarService service = new CarService();

        List<Model> models = service.getListOfAllModels(manufacturers);
        System.out.println("Models:");
        System.out.println(models);
        System.out.println();

        List<Car> cars = service.getListOfAllCars(manufacturers);
        System.out.println("Cars:");
        System.out.println(cars);
        System.out.println();

        List<String> manufacturerNames = service.getListOfManufacturerNames(manufacturers);
        System.out.println("Manufacturer names:");
        System.out.println(manufacturerNames);
        System.out.println();

        List<Integer> manufacturerYears = service.getListOfManufacturerYears(manufacturers);
        System.out.println("Manufacturer years:");
        System.out.println(manufacturerYears);
        System.out.println();

        List<String> modelNames = service.getListOfAllModelsNames(manufacturers);
        System.out.println("Model names:");
        System.out.println(modelNames);
        System.out.println();

        List<Integer> modelYears = service.getListOfModelYears(manufacturers);
        System.out.println("Model years:");
        System.out.println(modelYears);
        System.out.println();

        List<String> carDescription = service.getListOfAllCarDescriptions(manufacturers);
        System.out.println("Car descriptions:");
        System.out.println(carDescription);
        System.out.println();

        List<Model> modelsWithEvenProdYear = service
                .getListOfAllModelsWithEvenProductionYear(manufacturers);
        System.out.println("Models with even prod year:");
        System.out.println(modelsWithEvenProdYear);
        System.out.println();

        List<Car> carsWithManEvenYear = service
                .getListOfAllCarsWithManEvenEstablishmentYear(manufacturers);
        System.out.println("Cars with manufacturer even year of est.:");
        System.out.println(carsWithManEvenYear);
        System.out.println();

        List<Car> carsWithManOddYearAndEvenModelYear = service
                .getListOfAllCarsWithEvenModelYearAndOddManEstablishmentYear(manufacturers);
        System.out.println("Cars with manufacturer odd year of est. and even year of model:");
        System.out.println(carsWithManOddYearAndEvenModelYear);
        System.out.println();

        List<Car> cabrioletsWithManOddYearAndEvenModelYear = service
                .getListOfAllCabrioletsWithOddModelYearAndEvenManEstablishmentYear(manufacturers);
        System.out.println("Cabriolets with manufacturer even year of est. and odd year of model:");
        System.out.println(cabrioletsWithManOddYearAndEvenModelYear);
        System.out.println();

        List<Car> cars1 = service
                .getListOfAllCarsByTypeYearOfManAndYearOfModel
                        (manufacturers, CarType.SEDAN, 2019, 1919);
        System.out.println("Cars by type, model year, man. est.:");
        System.out.println(cars1);
        System.out.println();
    }
}
