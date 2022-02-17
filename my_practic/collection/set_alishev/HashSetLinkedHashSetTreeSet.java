package collection.set_alishev;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet {

    public static void main(String[] args) {

        // внутри не гарантируется никакого порядка
        Set<String> hashSet = new HashSet<>();

        // В каком порядке пары(ключ) были добавлены,
        // в таком порядке они и вернутся
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Пары (ключ) сортируются по ключу (естественный порядок)
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Tom");
        hashSet.add("Tom");

        for (String name : hashSet) {
            System.out.println("s = " + name);
        }

        // Работает очень быстро этот метод в Set. О(1)
        System.out.println(hashSet.contains("Tom"));

        System.out.println("hashSet = " + hashSet.isEmpty());
    }
}
