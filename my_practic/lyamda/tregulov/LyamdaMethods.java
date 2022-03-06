package lyamda.tregulov;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Использование lyamda в коллекции
public class LyamdaMethods {

    public static void main(String[] args) {
        List<String> list = List.of("privet", "poka", "kak dela?", "vse normalno");
        System.out.println("list = " + list);

        // Лямда вывод (внутри код - обычный forEach, который итерирует по коллекции)
        list.forEach(s -> System.out.println("s = " + s));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(2);
        al.add(5);
        al.add(7);
        al.add(4);
        al.add(6);
        al.add(1);

        // Lyamda - Predicate - удаляет элементы, подходящие нашему условию11
        // 1-й вариант
        al.removeIf(element -> element % 3 == 0);
        System.out.println("al = " + al);
        // 2-й вариант
        Predicate<Integer> p = element -> element % 3 == 0;
        al.removeIf(p);
        System.out.println("al = " + al);

        // Lyamda Сортировка, внутри компаратор
        al.sort((x, y) -> x.compareTo(y));
        System.out.println("al = " + al);

        // Lyamda Сортировка в ОБРАТНОМ "- x", внутри компаратор
        al.sort((x, y) -> -x.compareTo(y));
        System.out.println("al = " + al);
    }
}
