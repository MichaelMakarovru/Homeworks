package module9_java_advanced_coding.ex_26_car;

import java.util.List;
import java.util.stream.Collectors;

class CarService {

    public List<Model> getListOfAllModels(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .collect(Collectors.toList());
    }

    public List<Car> getListOfAllCars(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
    }

    public List<String> getListOfManufacturerNames(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .map(manufacturer -> manufacturer.name)
                .collect(Collectors.toList());
    }

    public List<Integer> getListOfManufacturerYears(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .map(manufacturer -> manufacturer.yearOfEstablishment)
                .collect(Collectors.toList());
    }

    public List<String> getListOfAllModelsNames(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .map(model -> model.name)
                .collect(Collectors.toList());
    }

    public List<Integer> getListOfModelYears(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .map(model -> model.productionStartYear)
                .collect(Collectors.toList());
    }

    public List<String> getListOfAllCarDescriptions(List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .map(car -> car.description)
                .collect(Collectors.toList());
    }

    public List<Model> getListOfAllModelsWithEvenProductionYear
            (List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Car> getListOfAllCarsWithManEvenEstablishmentYear
            (List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .filter(manufacturer -> manufacturer.yearOfEstablishment % 2 == 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
    }

    public List<Car> getListOfAllCarsWithEvenModelYearAndOddManEstablishmentYear
            (List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .filter(manufacturer -> manufacturer.yearOfEstablishment % 2 != 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear % 2 == 0)
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
    }

    public List<Car> getListOfAllCabrioletsWithOddModelYearAndEvenManEstablishmentYear
            (List<Manufacturer> manufacturers) {

        return manufacturers
                .stream()
                .filter(manufacturer -> manufacturer.yearOfEstablishment % 2 == 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear % 2 != 0)
                .flatMap(model -> model.cars.stream())
                .filter(car -> car.carType.equals(CarType.CABRIOLET))
                .collect(Collectors.toList());
    }

    public List<Car> getListOfAllCarsByTypeYearOfManAndYearOfModel
            (List<Manufacturer> manufacturers, CarType carType,
             int productionStart, int manufacturerEst) {

        return manufacturers
                .stream()
                .filter(manufacturer -> manufacturer.yearOfEstablishment < manufacturerEst)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear > productionStart)
                .flatMap(model -> model.cars.stream())
                .filter(car -> car.carType.equals(carType))
                .collect(Collectors.toList());
    }
//    public List<Car> getListOfAllCarsByTypeYearOfManAndYearOfModel1
//            (List<Manufacturer> manufacturers, CarType carType,
//             int productionStart, int manufacturerEst) {
//
//        List<Car> carList = new ArrayList<>();
//
//        for (Manufacturer manufacturer : manufacturers) {
//
//            if (manufacturer.yearOfEstablishment >= manufacturerEst) {
//                continue;
//            }
//
//            for (Model model : manufacturer.models) {
//
//                if (model.productionStartYear < productionStart) {
//                    continue;
//                }
//
//                for (Car car : model.cars) {
//
//                    if (car.carType.equals(carType)) {
//                        carList.add(car);
//                    }
//                }
//            }
//        }
//        return carList;
//    }
}
