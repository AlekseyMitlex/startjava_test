package comparation.comparation_alishev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Если стандартная сортировка не устраивает, необходимо 2 способа:
// 1-й
//  - Создать класс
//  - implements Comparator
//  - Переопределить метод compare
// 2-й
//  - Создать прямо в методе Collections.sort -
//  Анонимный класс и реализовать его

public class ComparatorEx1 {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("aaser");
        animals.add("dog");
        animals.add("catbnfff");
        animals.add("frog");
        animals.add("ab");
        animals.add("bird");
        animals.add("b");

        // 1-й способ
        // Сортировка по лексикографическому порядку
        Collections.sort(animals, new StringlengthComparator());
        System.out.println("animals = " + animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        // 2-й способ
        // Сортировка - в обратную, т.е от большего к меньшему по числу
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("numbers = " + numbers);
    }
}

//  Сортировка - по длине(количеству) символов
class StringlengthComparator implements Comparator<String> {


    /* По конвенции принято, если:
        o1 > o2 = 1;    compare(2, 1) => 1;
        o1 < o2 = - 1;  compare(1, 2) => - 1;
        o1 == o2 = 0;   compare(1, 1) => 0;
    */
    // Идёт сравнение 0 индекса с 1, т.к. сортировка по возрастанию,
    // если необходимо менять места, далее сравнивает 1 со 2 и т.д.
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
}