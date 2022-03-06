package lyamda.alishev.osnovi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LymdaComparator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

        // 2 варианта
        // 1-й анонимный класс + компаратор
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("list = " + list);

        // 2-й вариант лямда+компаратор, так же убрали скобки,
        //      т.к. все 1 строка в каждом секторе
        list.sort((s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        });

        System.out.println("list = " + list);

        // Лямду можно записывать в переменную
        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        };
    }
}
