package module7_java_advanced_features.lesson3.iterable_iterator;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("John", 25));
        personList.add(new Person("Mary", 25));

        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println();

        MyCustomCollection<Person> customCollection = new MyCustomCollection<>();

        customCollection.add(new Person("Ann", 23));
        customCollection.add(new Person("Mike", 23));

        for (Person person : customCollection) {
            System.out.println(person);
        }


    }
}
