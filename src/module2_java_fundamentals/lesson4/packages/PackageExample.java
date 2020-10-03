package module2_java_fundamentals.lesson4.packages;

import module2_java_fundamentals.lesson4.packages.innerpachage.Cat;

public class PackageExample {

    public static void main(String[] args) {
        Cat cat = new Cat();
        module2_java_fundamentals.lesson4.packages.secondinnerpackage.Cat cat1 =
                new module2_java_fundamentals.lesson4.packages.secondinnerpackage.Cat();
    }
}
