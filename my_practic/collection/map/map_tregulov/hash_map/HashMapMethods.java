package collection.map.map_tregulov.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        //  Размер массива и фактор при котором массив увеличиться вдвое,
        //  в данном случае, при заполнении 12(16*0,75)
        //  Чем больше capacity занимает памяти, тем быстрее будет поиск,
        //  потому что меньше будут образовываться LinkeList`i в конкретной позиции.
        //  Вывод: жертвуем памятью, но выигрываем в скорости доступа к элементу
        Map<Integer, String> map3 = new HashMap<>(16, 0.75f);

        // неупорядоченное хранение, ключи должны быть уникальными, может быть null
        // значения могут повторяться, могут быть null
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Maria Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(85214, null);

        System.out.println("map1 = " + map1);

        // TODO : putIfAbsent - добавь элемент в HashMap, если такого элемента нет,
        //  если есть, то не добавиться
        map1.putIfAbsent(null, "Sergey Petrov");
        map1.putIfAbsent(85214, null);
        System.out.println("map1 = " + map1);

        // TODO : get вывести на экран
        System.out.println("map1 = " + map1.get(15879));

        // TODO : remove удаляет
        System.out.println("map1.remove(15879) = " + map1.remove(15879));
        System.out.println("map1 = " + map1);

        // TODO : containsValue - проверяет по значению элемент в Hashmap
        System.out.println("map1.containsValue(\"Ivan Ivanov\") = " + map1.containsValue("Ivan Ivanov"));

        // TODO : containsKey - - проверяет по ключу элемент в Hashmap
        System.out.println("map1.containsKey(1000) = " + map1.containsKey(1000));

        // TODO : keySet - возвращает множество ключей.
        System.out.println("map1.keySet() = " + map1.keySet());

        // TODO : values - возвращает множество значений
        System.out.println("map1.values() = " + map1.values());

        // TODO : Дженерикс могут быть одинаковы
        Map<String, String> map2 = new HashMap<>();

        map2.put("Sasha", "Dobtii");
        map2.put("Misha", "Umniy");
        System.out.println("map2 = " + map2);

        // TODO : setEntry - возвращает множество элементов из HashMap
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("entry.getKey() + \":\" + entry.getValue() = " + entry.getKey() + ":" + entry.getValue());
        }


    }
}
