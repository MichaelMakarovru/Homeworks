package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.innerpackage;

//import module7_java_advanced_features.lesson1.oop.encapsulation.DefaultClass;
import module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.PublicClass;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {
        //We cannot use class with default access modifier, because it is located
        //in different package.
       // DefaultClass defaultClass = new DefaultClass();

        //We can use public classes anywhere we want.
        PublicClass publicClass = new PublicClass();
        //We can use public variables anywhere we want.
        publicClass.name = "John";
        //We cannot use protected and default variables in another package.
//        publicClass.address = "Riga";
//        publicClass.age = 32;
        //We cannot use private variables outside the class where it was declared.
//        publicClass.birthDate;
        //We can use public methods to gain access to private variables.
        publicClass.printDate();
        //These methods are not visible here because of access modifiers.
//        publicClass.printAge();
//        publicClass.printAddress();
//        publicClass.printName();
//        publicClass.validateDate(LocalDate.now());
    }
}
