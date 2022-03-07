package lyamda.tregulov.function.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno lambdas");

        // Lyamda - Predicate - удаляет элементы, подходящие нашему условию
        // 1-й ваиант. Удалим элементы с длиной меньше 5
        al.removeIf(element -> element.length() < 5);
        System.out.println("al = " + al);
        // 2-й вариант
        Predicate<String> p = element -> element.length() < 5;
        al.removeIf(p);
    }
}
