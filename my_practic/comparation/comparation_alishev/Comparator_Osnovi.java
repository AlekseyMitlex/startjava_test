package comparation.comparation_alishev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Osnovi {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("aaser");
        animals.add("dog");
        animals.add("catbnfff");
        animals.add("frog");
        animals.add("ab");
        animals.add("bird");
        animals.add("b");

        // Сортировка по лексикографическому порядку
        Collections.sort(animals, new StringlengthComparator());
        System.out.println("animals = " + animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new BackwardsInegerComparator());
        System.out.println("numbers = " + numbers);
    }
}

// Если стандартная сортировка не устраивает, необходимо -
// implements Comparator и переопределить сортировку - по длине(количеству) символов
class StringlengthComparator implements Comparator<String> {


    /* По конвенции принято, если:
        o1 > o2 = 1;    compare(2, 1) => 1;
        o1 < o2 = - 1;  compare(1, 2) => - 1;
        o1 == o2 = 0;   compare(1, 1) => 0;
    */
    // Идёт сравнение 0 индекса с 1, т.к. сортировка по возрастанию,
    // если необходимо меняет места, далее сравнивает 1 со 2 и т.д.
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

// сортировка - в обратную, т.е от большего к меньшему по числу
class BackwardsInegerComparator implements Comparator<Integer> {

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
}