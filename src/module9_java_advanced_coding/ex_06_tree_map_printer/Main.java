package module9_java_advanced_coding.ex_06_tree_map_printer;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("John", 35);
        map.put("Anna", 25);
        map.put("Michael", 20);
        map.put("Sarah", 15);
        map.put("Maria", 60);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        printFirstAndLast(map);
    }

    public static void printFirstAndLast(TreeMap<String, Integer> map) {

        boolean firstElement = true;

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            if (firstElement) {
                Map.Entry<String, Integer> entry
                        = (Map.Entry<String, Integer>) iterator.next();
                System.out.println(entry.getKey() + " " + entry.getValue());
                firstElement = false;
                continue;
            }

            Map.Entry<String, Integer> entry
                    = (Map.Entry<String, Integer>) iterator.next();
            if (!iterator.hasNext()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
