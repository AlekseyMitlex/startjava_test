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

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name : treeSet) {
            System.out.println("s = " + name);
        }
    }
}
