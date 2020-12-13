package module9_java_advanced_coding.ex_12_cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CarService {

    private List<Manufacturer> manufacturers = new ArrayList<>();

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
    }

    public Manufacturer getManufacturerByName(String name) {
        for (Manufacturer manufacturer : manufacturers) {
            if (manufacturer.getName().equalsIgnoreCase(name)) {
                return manufacturer;
            }
        }
        return null;
    }

    public void removeManufacturer(Manufacturer manufacturer) {
        manufacturers.remove(manufacturer);
    }

    public void removeManufacturerByName(String name) {
        removeManufacturer(getManufacturerByName(name));
    }

    public List<Manufacturer> getAllManufacturers() {
        return manufacturers;
    }

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        for (Manufacturer manufacturer : manufacturers) {
            cars.addAll(manufacturer.getCars());
        }
        return cars;
    }

    public List<Car> getCarsByEngine(Engine engine) {
        List<Car> cars = new ArrayList<>();
        for (Car car : getAllCars()) {
            if (car.getEngineType().equals(engine)) {
                cars.add(car);
            }
        }
        return cars;
    }

    public List<Car> getCarsProducedBefore(int year) {
        List<Car> cars = new ArrayList<>();
        for (Car car : getAllCars()) {
            if (car.getYearOfManufacture() < year) {
                cars.add(car);
            }
        }
        return cars;
    }

    public List<Car> getMostExpensiveCars() {
        List<Car> cars = new ArrayList<>();
        BigDecimal currentMax = new BigDecimal("-1");
        for (Car car : getAllCars()) {
            if (car.getPrice().compareTo(currentMax) > 0) {
                cars.clear();
                cars.add(car);
                currentMax = car.getPrice();
            } else if (car.getPrice().compareTo(currentMax) == 0) {
                cars.add(car);
            }
        }
        return cars;
    }

    public List<Car> getCheapestCars() {
        List<Car> cars = new ArrayList<>();
        BigDecimal currentMin = new BigDecimal(Integer.MAX_VALUE);
        for (Car car : getAllCars()) {
            if (car.getPrice().compareTo(currentMin) < 0) {
                cars.clear();
                cars.add(car);
                currentMin = car.getPrice();
            } else if (car.getPrice().compareTo(currentMin) == 0) {
                cars.add(car);
            }
        }
        return cars;
    }

    public List<Manufacturer> getManufacturersByNumberOfCars(int number) {
        List<Manufacturer> manufacturerList = new ArrayList<>();

        for (Manufacturer manufacturer : manufacturers) {
            if (manufacturer.getCars().size() >= number) {
                manufacturerList.add(manufacturer);
            }
        }

        return manufacturerList;
    }

    public List<Car> getCarsSortedByName(SortingParameter parameter) {

        List<Car> cars = getAllCars();

        if (parameter.equals(SortingParameter.ASC)) {
            Collections.sort(cars);
        } else {
            Collections.sort(cars, new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return o2.compareTo(o1);
                }
            });
        }
        return cars;
    }

    public boolean carExists(Car car) {
        return getAllCars().contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return manufacturer.getCars();
    }

    public List<Car> getCarsByManufacturer(String manufacturer) {
        Manufacturer manufacturerObject = getManufacturerByName(manufacturer);
        return getCarsByManufacturer(manufacturerObject);
    }

    public List<Car> getCarsByManufacturer(int year, Operator operator) {

        List<Car> cars = new ArrayList<>();

        switch (operator) {
            case LESS: {
                for (Manufacturer manufacturer : manufacturers) {
                    if (manufacturer.getYearOfEstablishment() < year) {
                        cars.addAll(manufacturer.getCars());
                    }
                }
                return cars;
            }
            case GREATER: {

            }
            case EQUAL: {

            }
            case NOT_EQUAL: {

            }
            case LESS_OR_EQUAL: {

            }
            case GREATER_OR_EQUAL: {

            }
            default: return new ArrayList<>();
        }
    }
}
