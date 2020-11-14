package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.innerpackage;

//import module7_java_advanced_features.lesson1.oop.encapsulation.DefaultClass;
import module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.PublicClass;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

       // DefaultClass defaultClass = new DefaultClass();

        PublicClass publicClass = new PublicClass();
        publicClass.name = "John";
//        publicClass.address = "Riga";
//        publicClass.age = 32;
        publicClass.printDate();
//        publicClass.printAge();
//        publicClass.printAddress();
//        publicClass.printName();
//        publicClass.validateDate(LocalDate.now());
    }
}
