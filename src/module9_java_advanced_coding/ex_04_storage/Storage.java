package module9_java_advanced_coding.ex_04_storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Storage {

    private final Map<String, List<String>> map;

    public Storage() {
        map = new HashMap<>();
    }

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public void addToStorage(String key, String value) {

        if (null == map.get(key)) {
            map.put(key, new ArrayList<>());
        }
        List<String> list = map.get(key);
        list.add(value);
    }

    public void printValues(String key) {
        for (String s : map.get(key)) {
            System.out.println(s);
        }
    }

    public void findKeys(String value) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            for (String s : entry.getValue()) {
                if (value.equals(s)) {
                    System.out.println(entry.getKey());
                    break;
                }
            }

        }
    }
}
