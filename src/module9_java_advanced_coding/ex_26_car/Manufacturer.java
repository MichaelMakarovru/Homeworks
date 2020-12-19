package module9_java_advanced_coding.ex_26_car;

import java.util.List;

class Manufacturer {
    public String name;
    public int yearOfEstablishment;
    public List<Model> models;

    public Manufacturer(String name, int yearOfEstablishment, List<Model> models) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.models = models;
    }
}
