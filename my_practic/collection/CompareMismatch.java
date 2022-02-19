package collection;

import java.util.Arrays;

public class CompareMismatch {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};

        //  Метод Compare использует лексикографическое сравнение
        //  Если идет раньше в словаре или по списку = значит меньше
        //  Когда первый массив(array1) меньше второго Compare возвращает > 0,
        //  Если одинаковые то = 0
        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array2, array5));

        System.out.println(Arrays.compare(array3, array4));
        System.out.println(Arrays.compare(array4, array3));

        //  Метод Mismatch находит индекс первого расхождения массивов
        //  или -1, если они одинаковые
        // Равные, поэтому -1
        System.out.println(Arrays.mismatch(array2, array5));
        // Разные, поэтому индекс расхождения [3]
        System.out.println(Arrays.mismatch(array2, array1));


    }
}
