package module7_java_advanced_features.lesson2.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Latvia", "Riga");
        map.put("Lithuania", "Vilnius");
        map.put("Estonia", "Tallin");
        map.put("Example", "Riga");
        map.put("USA", "Washington");

        print(map);

        System.out.println();
        System.out.println(map.get("Latvia"));
        System.out.println(map.get("Ukraine"));
        System.out.println(map.containsValue("Riga"));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove("Example"));
        System.out.println(map.containsKey("Example"));
        map.put("Lithuania", "Kaunas");
        map.replace("Estonia", "Valka");
        System.out.println(map.size());

        print(map);

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Latvia", "Riga");
        treeMap.put("Lithuania", "Vilnius");
        treeMap.put("Estonia", "Tallin");
        treeMap.put("Example", "Riga");
        treeMap.put("USA", "Washington");

        System.out.println();
        print(treeMap);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Latvia", "Riga");
        linkedHashMap.put("Lithuania", "Vilnius");
        linkedHashMap.put("Estonia", "Tallin");
        linkedHashMap.put("Example", "Riga");
        linkedHashMap.put("USA", "Washington");

        System.out.println();
        print(linkedHashMap);
    }

    public static void print(Map<?, ?> map) {

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }
    }
}
