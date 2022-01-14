package Algoritm.examples;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(19);
        // Сортировка Арейлиста
        Collections.sort(arrayList);
        System.out.println(arrayList);
        // Бинарный Поиск индекса в Аррейлисте значения = 5
        int index1 = Collections.binarySearch(arrayList, 5);
        System.out.println(index1);

        // Переворачиваем массив
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // Перемешать массив как попало
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
