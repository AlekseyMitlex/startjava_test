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
//        testMap(treeMap);
        // 6000 // 469 //300
//        measureTime(hashMap);
        // 6000 //400 // 300
//        measureTime(linkedHashMap);
        // 6000 //422 // 300
        measureTime(treeMap);
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

    private static void measureTime(Map<Integer, String> map) {

        // add() Заполняем нулями, значения ставим в конец листа 10 и 5
//            long start = System.currentTimeMillis();
//
//            for (int i = 0; i < 10000; i++) {
//                map.put(i, "i");
//                System.out.println("map = " + map);
//            }
//
//            long end = System.currentTimeMillis();
//            System.out.println(end - start);
//        }


        // add(index) Заполняем, значения ставим в конец листа 10 и 773
//        long start2 = System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//            // Добавляем в 0 индекс
//            map.put(0, "i");
//            System.out.println("map = " + map);
//        }
//
//        long end2 = System.currentTimeMillis();
//        System.out.println(end2 - start2);

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            map.get(i);
            System.out.println("map = " + map);
        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}