package module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.innerpackage;

import module7_java_advanced_features.lesson1.oop.encapsulation.accessmodifiers.PublicClass;

class PublicClassChild extends PublicClass {

    public void printAgeChild() {
        System.out.println(this.age);
        //printAge();
    }

    public void printAddressChild() {
        //System.out.println(this.address);
        printAddress();
    }

    public void printNameChild() {
        System.out.println(this.name);
        //printName();
    }

    public void printBirthDateChild() {
       // System.out.println(this.birthDate);
        printDate();
    }
}
