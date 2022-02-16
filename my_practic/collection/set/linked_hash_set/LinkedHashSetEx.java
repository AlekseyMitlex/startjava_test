package collection.set.linked_hash_set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

    public static void main(String[] args) {
        //TODO: порядок добавления, в основе лежит HashMap,
        // ключи - элементы, значения - это константа - заглушка
        LinkedHashSet<Integer> lhs = new LinkedHashSet();
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);

        System.out.println("lhs = " + lhs);

        lhs.remove(8);
        System.out.println("lhs.contains(8) = " + lhs.contains(8));
    }
}
