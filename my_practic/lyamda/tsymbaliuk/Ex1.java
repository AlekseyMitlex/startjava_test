package lyamda.tsymbaliuk;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("hello", "cat", "java", "bag"));

        System.out.println("list = " + list);

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 3;
            }
        });

        System.out.println("list = " + list);
    }
}
