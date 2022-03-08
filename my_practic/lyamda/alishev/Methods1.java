package lyamda.alishev;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Methods1 {

    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        System.out.println("stringCollection = " + stringCollection);

        // FILTER METHODS AND SORTED(forEach)
        System.out.println("------FILTER METHODS AND SORTED(forEach)-----------");

        // Фильтрует данные, если нужно подмножество из общего, то можем получить нужные,
        //      в данном случае всё что начинается с "a" выводим на экран
        // Элементы сортируются в обычном порядке, если вы не предоставили свой компаратор
        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);

        // MAP METHODS
        System.out.println("------MAP METHODS-----------");

        // Напрямую мы не можем обратиться через лямда,
        //      поэтому формируем, как поток IntStream и используем map,
        //      который берет каждое выражение из потока и сопоставляет ему новое выражение
        //      (Каждый элемент, берется map и передаётся в лямду)
        // Меняет регистр и сортирует от большего к меньшему(в числовом)
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // Match METHODS
        System.out.println("------Match METHODS-----------");

        // Для проверки, удовлетворяет ли поток заданному предикату,
        // используются различные операции сопоставления (match).
        // Все операции сопоставления являются конечными и возвращают результат типа boolean

        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true

        // Count METHODS
        System.out.println("------Count METHODS-----------");

        // Операция Count является конечной операцией и возвращает
        // количество элементов в потоке. Типом возвращаемого значения является long

        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3

        // REDUCE METHODS

        // Берёт набор данных и сжимает до 1 элемента,
        // например хотим посчитать сумму элементов, на входе 10 элементов, а на выходе 1
        System.out.println("------REDUCE METHODS-----------");

        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
    }
}
