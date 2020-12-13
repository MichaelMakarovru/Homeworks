package module9_java_advanced_coding.ex_12_cars;

import java.math.BigDecimal;
import java.util.Objects;

class Car implements Comparable<Car> {

    private String name;
    private String model;
    private BigDecimal price;
    private int yearOfManufacture;
    private Engine engineType;

    public Car(String name, String model, BigDecimal price, int yearOfManufacture, Engine engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && name.equals(car.name) && model.equals(car.model) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfManufacture, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public int compareTo(Car o) {

        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        }
        return this.model.compareTo(o.model);
    }
}
