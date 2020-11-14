package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers;

import java.time.LocalDate;

public class PublicClass {

    public static final String hello = "Hello";

    //public variable
    public String name; //visible everywhere
    //protected variable
    protected int age; //visible inside the same package and inside child classes
    //default(package-private) variable
    String address; //visible only inside the same package
    //private variable
    private LocalDate birthDate; //visible only inside the class

    public void printDate() { //visible everywhere
        birthDate = validateDate(birthDate);
        System.out.println(birthDate);
    }

    protected void printAddress() { //visible inside the same package and inside child classes
        System.out.println(this.address);
    }

    void printAge() { //visible only inside the same package
        System.out.println(age);
    }

    private void printName() { //visible only inside the class
        System.out.println(name);
    }

    //Private methods are often used as helper methods inside the class.
    private LocalDate validateDate(LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }
        return date;
    }
}
