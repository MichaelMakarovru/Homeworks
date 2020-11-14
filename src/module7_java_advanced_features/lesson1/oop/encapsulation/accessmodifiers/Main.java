package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {
        //We can use class with default access modifier, because it is located
        //in the same package.
        DefaultClass defaultClass = new DefaultClass();

        //We can use public classes anywhere we want.
        PublicClass publicClass = new PublicClass();
        //We can use public variables anywhere we want.
        publicClass.name = "John";
        //We can use protected and default variables inside the same package only.
        publicClass.address = "Riga";
        publicClass.age = 32;
        //We cannot use private variables outside the class where it was declared.
       // publicClass.birthDate = null;
        publicClass.printDate();
        publicClass.printAge();
        publicClass.printAddress();
        //publicClass.printName();
        //publicClass.validateDate(LocalDate.now());
    }
}
