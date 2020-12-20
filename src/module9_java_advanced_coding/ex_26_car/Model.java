package module9_java_advanced_coding.ex_26_car;

import java.util.List;

class Model {
    public String name;
    public int productionStartYear;
    public List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", productionStartYear=" + productionStartYear +
                '}';
    }
}
