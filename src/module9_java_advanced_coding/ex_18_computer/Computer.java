package module9_java_advanced_coding.ex_18_computer;

import java.util.Objects;

class Computer extends Object {

    private String company;
    private String model;
    private String ram;

    public Computer(String company, String model, String ram) {
        this.company = company;
        this.model = model;
        this.ram = ram;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return company.equals(computer.company) && model.equals(computer.model) && ram.equals(computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model);
    }
}
