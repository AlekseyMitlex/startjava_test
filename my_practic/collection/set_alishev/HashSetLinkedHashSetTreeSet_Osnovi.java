package collection.set_alishev;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet_Osnovi {

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


        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // union - объединение множеств
        // 1 - й вариант set1 = [0, 1, 2, 3, 4, 5, 6, 7]
        set1.addAll(set2);
        System.out.println("set1 = " + set1);
        set1.clear();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // 2 - й способ union = [0, 1, 2, 3, 4, 5, 6, 7]
        System.out.println("set1 = " + set1);
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union = " + union);

        // intersection - пересечение множеств intersection = [2, 3, 4, 5]
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);

        // difference - разность множеств difference = [0, 1]
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference = " + difference);


    }
}
