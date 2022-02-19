package collection.list.list_tregulov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        // TODO : removeAll(Collection <?> c ) - boolean
        //  Если мы хотим из 1-го ArrayList, удалить элементы второго
        ArrayList<String> aI1 = new ArrayList<>();
        aI1.add("one");
        aI1.add("two");
        aI1.add("three");
        aI1.add("four");
        aI1.add("five");
        System.out.println("aI1 = " + aI1);

        ArrayList<String> aI2 = new ArrayList<>();
        aI2.add("one");
        aI2.add("three");
        aI2.add("four");
        aI2.add("ten");

        aI1.removeAll(aI2);
        System.out.println("aI1 = " + aI1);

        System.out.println(" =******************** ");
        // TODO : retainAll(Collection <?> c ) - boolean
        //  В 1-й ArrayList, остануться элементы, которых
        //  нет во втором так же
        aI1.retainAll(aI2);
        System.out.println("aI1 = " + aI1);

        // TODO : containsAll(Collection <?> c ) - boolean
        //  Сожержит ли первый ArrayList все элементы второго ArrayList`a
        boolean result = aI1.containsAll(aI2);
        System.out.println("result = " + result);

        // TODO : sublist(int fromIndex, int toIndex) - List <E>
        //  Создаёт отрывок из ArraList`a
        aI1.add("one");
        aI1.add("two");
        aI1.add("three");
        aI1.add("four");
        aI1.add("five");
        System.out.println("aI1 = " + aI1);

        // Это не отдельная сущность/List. Визуализация на экрану отдельного
        // саблиста. Можно добавлять элементы только через саблист, нельзя после
        // через aI1. Иначе саблист перестанет работать
        List<String> sublist = aI1.subList(1, 4);
        System.out.println("sublist = " + sublist);
        sublist.add("ten");
        // Добавиться "ten" после sublist
        System.out.println("sublist = " + sublist);
        System.out.println("aI1 = " + aI1);

        // TODO : toArray() - Object [] из АррейЛиста в массив объектов
        Object[] array = aI1.toArray();
        System.out.println("array = " + Arrays.toString(array));
        // Если хотим создать массив типа String.
        // [0] - писать так и не думать о размере массива
        String[] array1 = aI1.toArray(new String[15]);
        System.out.println("array1 = " + Arrays.toString(array1));

        // TODO : List.of(E.elements) - List<E>
        //        List.copyOf(Collection <E>c) - List<E>
        // List.of(E.elements) - List<E>. т.о. Можно быстро создать лист.
        // Но изменять его НЕЛЬЗЯ
        List<String> list = List.of("odin", "dva", "tri");
        System.out.println("list = " + list);
        // List.copyOf(Collection <E>c) - List<E>
        List<String> list2 = List.copyOf(aI1);
        System.out.println("list2 = " + list2);


    }
}
