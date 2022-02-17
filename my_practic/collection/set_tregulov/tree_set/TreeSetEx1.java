package collection.set_tregulov.tree_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {

    public static void main(String[] args) {
        // TODO : Хранит элементы сортируя по возрастанию, в основе лежит TreeMap,
        //  ключи это элементы, а значения - это константа - заглушка,
        //  не хранит null
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);

        System.out.println("treeSet = " + treeSet);

        // TODO : Методы теже самые
        System.out.println("treeSet.remove(2) = " + treeSet.remove(2));
        System.out.println("treeSet.contains(2) = " + treeSet.contains(2));
        System.out.println("treeSet = " + treeSet);
    }
}
