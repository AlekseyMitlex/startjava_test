package collection.set_tregulov.hash_set;

import java.util.HashSet;

public class HashSetEx2 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(1);
        hashSet2.add(8);

        // adAll - объединяет 2 множества в 1, при этом без дубликатов
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println("union = " + union);

        // retainAll - оставляет пересечение множеств, т.е. те что совпадают из 2-х множеств
        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println("intersect = " + intersect);

        // removeAll - удалить из 1 множества все элементы 2-го
        HashSet<Integer> substruct = new HashSet<>(hashSet1);
        substruct.removeAll(hashSet2);
        System.out.println("substruct = " + substruct);
    }
}
