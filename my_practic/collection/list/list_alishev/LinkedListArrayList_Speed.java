package collection.list.list_alishev;

import java.util.ArrayList;
import java.util.List;

public class LinkedListArrayList_Speed {

    public static void main(String[] args) {

        // TODO : Сравнение LinkedList и ArrayList
        List<Integer> linkedList = new java.util.LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {

        // TODO: add() Заполняем нулями, значения ставим в конец листа 10 и 5
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        // TODO: add(index) Заполняем, значения ставим в конец листа 10 и 773
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // Добавляем в 0 индекс
            list.add(0, i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

        // TODO: get() получаем данные 3670 и 5
//        long start1 = System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//        }
//
//        long end1 = System.currentTimeMillis();
//        System.out.println(end1 - start1);
    }
}
