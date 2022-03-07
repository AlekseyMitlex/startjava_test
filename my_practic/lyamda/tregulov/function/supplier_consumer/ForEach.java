package lyamda.tregulov.function.supplier_consumer;

import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normalno", "poka");

        list.forEach(s -> System.out.println("s = " + s));
    }
}
