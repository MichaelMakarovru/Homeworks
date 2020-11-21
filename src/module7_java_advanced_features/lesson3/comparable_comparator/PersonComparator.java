package module7_java_advanced_features.lesson3.comparable_comparator;

import java.util.Comparator;

//We can create class and implement Comparator to be able to declare
//sorting method in TreeSet, TreeMap or Collections.sort()
class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p2.getName().compareTo(p1.getName()) != 0) {
            return p2.getName().compareTo(p1.getName());
        }
        return p2.getAge() - p1.getAge();
    }
}
