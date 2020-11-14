package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers;

import java.time.LocalDate;

public class PublicClass {

    public static final String hello = "Hello";

    public String name;
    protected int age;
    String address;
    private LocalDate birthDate; //visible only inside the class

    public void printDate() {
        birthDate = validateDate(birthDate);
        System.out.println(birthDate);
    }

    protected void printAddress() {
        System.out.println(this.address);
    }

    void printAge() {
        System.out.println(age);
    }

    private void printName() {
        System.out.println(name);
    }

    private LocalDate validateDate(LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }
        return date;
    }
}
