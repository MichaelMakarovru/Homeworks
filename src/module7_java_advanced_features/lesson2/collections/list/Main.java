package module7_java_advanced_features.lesson2.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        //Collections cannot use primitive data types.
        int[] ints = new int[5];
        List<Integer> integers = new ArrayList<>();

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        stringList.add(".");
        stringList.add(4, "Cat");

        stringList.remove(".");

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Java");
        stringList1.add("Programming language");

        System.out.println("Size = " + stringList.size());
        stringList.addAll(stringList1);

        System.out.println("Contains all = " + (stringList.containsAll(stringList1)));

        System.out.println("Is empty = " + stringList.isEmpty());

        System.out.println("Contains World = " + stringList.contains("World"));
        System.out.println("Contains . = " + stringList.contains("."));
        System.out.println("Size = " + stringList.size());
        System.out.println("Contains Java = " + stringList.contains("Java"));

        stringList1.clear();
        System.out.println("Empty = " + stringList1.isEmpty());
        System.out.println("Index of ! = " + stringList.indexOf("!"));
        System.out.println("Index 0 = " + stringList.get(0));
        stringList.set(0, "Hi");
        System.out.println("Index 0 = " + stringList.get(0));
        Object[] arrayFromList = stringList.toArray();

        System.out.println();
        print(stringList);

        System.out.println();
        System.out.println("Linked list");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        print(linkedList);
    }

    public static void print(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
