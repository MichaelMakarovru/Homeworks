package module7_java_advanced_features.lesson2.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Peach");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");

        print(hashSet);
        System.out.println();

        Set<Cat> catSet = new HashSet<>();
        Cat tom = new Cat("Tom");
        catSet.add(tom);
        catSet.add(new Cat("John"));
        catSet.add(new Cat("Jerry"));

        print(catSet);

        System.out.println();
        print(catSet);

        System.out.println(catSet.contains(tom));

        System.out.println();

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Peach");
        treeSet.add("Banana");
        treeSet.add("Orange");

        print(treeSet);
    }

    public static void print(Set<?> set) {
        for (Object o : set) {
            System.out.println(o + ": " + o.hashCode());
        }
    }
}
