package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

        DefaultClass defaultClass = new DefaultClass();

        PublicClass publicClass = new PublicClass();
        publicClass.name = "John";
        publicClass.address = "Riga";
        publicClass.age = 32;
       // publicClass.birthDate = null;
        publicClass.printDate();
        publicClass.printAge();
        publicClass.printAddress();
        //publicClass.printName();
        //publicClass.validateDate(LocalDate.now());
    }
}
