package module9_java_advanced_coding.ex_18_computer;

import java.util.Objects;

class Laptop extends Computer {

    private String battery;

    public Laptop(String company, String model, String ram, String battery) {
        super(company, model, ram);
        this.battery = battery;
    }

    @Override
    public String toString() {

        return  "Laptop{" +
                "company='" + this.getCompany() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", ram='" + this.getRam() + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery.equals(laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
