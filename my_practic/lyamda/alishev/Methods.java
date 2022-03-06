package lyamda.alishev;

import java.util.*;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        // Метода заполнения целыми числами
        fillArr(arr);
        fillList(list);

        System.out.println("list = " + list);
        System.out.println("arr = " + Arrays.toString(arr));

        // 2-способа. Умножить каждый элемент на 2 и вывести результат

        // 1-й способ, по старинке
        for (int i = 0; i < 10; i++) {
            arr[i] *= 2;
            list.set(i, list.get(i) * 2);
        }

        // MAP METHODS
        System.out.println("------MAP METHODS-----------");

        //2-q способ через лямда
        // Напрямую мы не можем обратиться через лямда,
        //      поэтому формируем как поток IntStream и используем map,
        //      который берет каждое выражение из потока и сопоставляет ему новое выражение
        //      (Каждый элемент, берется map и передаётся в лямду a*2)
        Arrays.stream(arr).map(a -> a * 2);
        list.stream().map(a -> a * 2);

        // Чтобы вывести, запомним и нам нужно в массиве добавить toArray(),
        //      а в листе это будет collect(Collectors.toList()).
        //      Просто берётся поток и превращается обратно в массив/лист
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());


        System.out.println("list = " + list);
        System.out.println("arr = " + Arrays.toString(arr));


        // Каждому элементу массива/листа присваиваем 3
        arr = Arrays.stream(arr).map(a -> 3).toArray();
        list = list.stream().map(a -> 3).collect(Collectors.toList());

        System.out.println("list = " + list);
        System.out.println("arr = " + Arrays.toString(arr));


        // FILTER METHODS
        System.out.println("------FILTER METHODS-----------");

        // Фильтрует данные, если нужно подмножество из общего, то можем получить нужные
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        // Метода заполнения целыми числами
        fillArr(arr2);
        fillList(list2);

        // Допустим нужны только чётные числа из массива от 1-10
        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println("list2 = " + list2);
        System.out.println("arr2 = " + Arrays.toString(arr2));

        // FOREACH METHODS
        System.out.println("------FOREACH METHODS-----------");

        // Метод итерирования, простой
        Arrays.stream(arr2).forEach(a -> System.out.println(a));
        list2.stream().forEach(a -> System.out.println(a));

        // REDUCE METHODS

        // Берёт набор данных и сжимает до 1 элемента,
        // например хотим посчитать сумму элементов, на входе 10 элементов, а на выходе 1
        System.out.println("------REDUCE METHODS-----------");

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        // acc - аккумуляторует данные, будет все время обновляться, b - это текущий элемент,
        //      getAsInt() - преобразует наш поток в конкретное целое число
        int amount = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        int multiplication = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println("Сумма = " + amount);
        System.out.println("Произведение = " + multiplication);

        System.out.println("------ВЫЗОВ ОДИН ЗА ДРУГИМ-----------");

        // Оставить не чётные числа и умножить на 2
        int[] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();

        fillArr(arr4);
        fillList(list4);

        int[] amount1 = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println("amount1 = " + Arrays.toString(amount1));

        // тоже самое и в Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println("до set = " + set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println("после set = " + set);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
