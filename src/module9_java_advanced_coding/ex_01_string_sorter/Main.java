package module9_java_advanced_coding.ex_01_string_sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Dog");
        list.add("Zebra");
        list.add("tiger");
        list.add("Cat");
        list.add("Monkey");
        list.add("parrot");
        list.add("ant");
        list.add("Lion");

        sortStringsAscending(list);
        printList(list);
        System.out.println();

        sortStringsAscendingCaseInsensitive(list);
        printList(list);
    }

    static List<String> sortStringsAscending(List<String> list) {
        Collections.sort(list, new StringComparator());
        return list;
    }

    static List<String> sortStringsAscendingCaseInsensitive(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().compareTo(o1.toLowerCase());
            }
        });
        return list;
    }

    static void printList(List<String> list) {
        for (String s : list) {
            System.out.println((int) s.charAt(0) + ": " + s);
        }
    }
}


