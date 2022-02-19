package collection.map.map_alishev;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Osnovi {

    public static void main(String[] args) {
        // Конвенция Map 1-й
        // неупорядоченное хранение, ключи должны быть уникальными, может быть null
        // значения могут повторяться, могут быть null
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Тройка");

        System.out.println("map = " + map);

        map.put(3, "Другое значение для ключа три");
        System.out.println("map = " + map);

        System.out.println("map.get(1) = " + map.get(1));
        // map.get(1) = null - вернётся null
//        System.out.println("map.get(1) = " + map.get(10));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
