package collection.list_tregulov.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListLIterator {

    public static void main(String[] args) {

        String s = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s);
        list1.add(s4);
        list1.add(s2);

        // TODO : Вывести на экран элементы листа
        // 1-q variant
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println("it.next() = " + it.next());
        }
        // 2-q variant with ListIterator
        ListIterator<String> it1 = list1.listIterator();
        while (it1.hasNext()) {
            System.out.println("it1.next() = " + it1.next());
        }

        // TODO : Вывести на экран элемент и удалить
        Iterator<String> it2 = list1.iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
            System.out.println("list1 = " + list1);
        }

    }

}
