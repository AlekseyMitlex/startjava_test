package lyamda.tregulov.function;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normalno", "poka");

        list.forEach(s -> System.out.println("s = " + s));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list1.forEach(integer -> {
            System.out.println("integer = " + integer);
            integer *= 2;
            System.out.println("integer*2 = " + integer);
        });
    }
}
