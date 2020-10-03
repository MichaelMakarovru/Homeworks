package module2_java_fundamentals.lesson4.packages;

import module2_java_fundamentals.lesson4.packages.innerpachage.Cat;

public class PackageExample {

    public static void main(String[] args) {
        //If we happen to have two classes with one name, we can import only one
        //To use the second one, we need to access it by full name (package + name)
        Cat cat = new Cat();
        module2_java_fundamentals.lesson4.packages.secondinnerpackage.Cat cat1 =
                new module2_java_fundamentals.lesson4.packages.secondinnerpackage.Cat();
    }
}
