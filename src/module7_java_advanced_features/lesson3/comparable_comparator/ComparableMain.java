package module7_java_advanced_features.lesson3.comparable_comparator;

import java.util.*;

public class ComparableMain {

    public static void main(String[] args) {

        Set<Person> personSet = new TreeSet<>();

        //Java uses compareTo method when adding Person object to TreeSet
        personSet.add(new Person("Carl", 10));
        personSet.add(new Person("John", 25));
        personSet.add(new Person("Ann", 22));
        personSet.add(new Person("Ann", 14));

        print(personSet);
        System.out.println();

        //Implementation of Comparator using inner anonymous class
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p2.getName().compareTo(p1.getName()) != 0) {
                    return p2.getName().compareTo(p1.getName());
                }
                return p2.getAge() - p1.getAge();
            }
        };

        //We can use custom Comparator and use it when adding Person object to TreeSet
        //This will make Java use compare method from Comparator instead of compareTo
        //method declared in Person
        Set<Person> reversedPersonSet = new TreeSet<>(personComparator);
        reversedPersonSet.add(new Person("Ann", 22));
        reversedPersonSet.add(new Person("Carl", 10));
        reversedPersonSet.add(new Person("John", 25));
        reversedPersonSet.add(new Person("Ann", 14));

        print(reversedPersonSet);
        System.out.println();

        Set<Person> reversedPersonSet2 = new TreeSet<>(new PersonComparator());
        reversedPersonSet2.add(new Person("Ann", 22));
        reversedPersonSet2.add(new Person("Carl", 10));
        reversedPersonSet2.add(new Person("John", 25));
        reversedPersonSet2.add(new Person("Ann", 14));

        print(reversedPersonSet2);
        System.out.println();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Wendy", 14));
        personList.add(new Person("Andrew", 15));
        Collections.sort(personList);
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println();
        Collections.sort(personList, personComparator);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public static void print(Set<Person> set) {
        for (Person p : set) {
            System.out.println(p);
        }
    }
}
