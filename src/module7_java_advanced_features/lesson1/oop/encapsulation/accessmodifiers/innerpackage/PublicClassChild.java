package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.innerpackage;

import module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.PublicClass;

//This class inherits PublicClass and gains access to public and protected
//variables and methods
class PublicClassChild extends PublicClass {

    public void printAgeChild() {
        //Can access protected variable
        System.out.println(this.age);
        //Cannot access default(package-private) methods
        //printAge();
    }

    public void printAddressChild() {
        //Cannot access default(package-private) variables
        //System.out.println(this.address);
        //Can access protected method
        printAddress();
    }

    public void printNameChild() {
        //Can access public variable
        System.out.println(this.name);
        //Cannot access private method
        //printName();
    }

    public void printBirthDateChild() {
        //Cannot access private variable
       // System.out.println(this.birthDate);
        //Can access public method
        printDate();
    }
}
