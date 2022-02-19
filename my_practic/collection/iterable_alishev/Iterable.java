package collection.iterable_alishev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list = " + list);

        // До Java 5 итерированное через iterator, а точнее:
        // - Получали доступ к объекту класса Iterator,
        //      который лежит в объекте класса ArrayList и хранит наши элементы.
        // - Вызываем метод iterator(), который есть у всех, кто реализует Iterable.
        //      Возвращает объект класса который реализует интерфейс Iterator
        Iterator<Integer> iterator = list.iterator();
        // Before Java 5. Устарел
        // - Есть ли что-то далее спрашивает iterator.hasNext(),
        //      смотрим через iterator.next(), если да, то выводим
        // - Преимущество такого итерирования до сих пор,
        //      заключается в том, что может одновременно, проходится по
        //      элементам и удалять эти элементы. Это возможно из-за того,
        //      что мы прошли элемент(обработали) и после удаляем.
        //      Метод foreach не может так обрабатывать.

        // Создаём переменную счетчик. После каждого цикла будем инкрементировать
        int idx = 0;
        while (iterator.hasNext()) {
            // Если перенесем это строку ниже, то курсор будет некорректно отображать индексы
            System.out.println("iterator.next() = " + iterator.next());
            // Удаляем элемент, на который указывает указатель int cursor
            if (idx == 1) {
                iterator.remove();
            }

            idx++;
        }

        System.out.println("list = " + list);


        // Java 5 появился цикл. Под капотом использует iterator
        /*for (int x : list) {
            System.out.println("x = " + x);
        }*/
    }
}
