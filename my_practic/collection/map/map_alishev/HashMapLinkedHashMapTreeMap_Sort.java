package collection.map.map_alishev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap_Sort {

    public static void main(String[] args) {
        // внутри не гарантируется никакого порядка
        Map<Integer, String> hashMap = new HashMap<>();

        // В каком порядке пары(ключ, значение) были добавлены,
        // в таком порядке они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Пары (ключ, значения) сортируются по ключу (естественный порядок)
        Map<Integer, String> treeMap = new TreeMap<>();

//        testMap(hashMap);
//        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
