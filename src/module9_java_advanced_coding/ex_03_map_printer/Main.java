package module9_java_advanced_coding.ex_03_map_printer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);
        map.put("C++", 20);
        map.put("Basic", 35);

        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print("Key: " + list.get(i).getKey() + ", Value: " + list.get(i).getValue());

            if (i != list.size() - 1) {
                System.out.println(",");
            } else {
                System.out.println(".");
            }
        }
    }
}
