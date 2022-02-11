package array_list.tregulov;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // TODO : add()
        list.add("poka");
        list.add("privet");
        list.add("ok");
        // TODO : add(index)
        list.add(1, "hello");
        for (String s : list) {
            System.out.println(s + " ");
        }

        // TODO : get(index)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n" + "list.get = " + list.get(3));

        // TODO : get(index) - заменить индекс на новый
        list.set(1, "!!!");
        System.out.println("list = " + list);
    }
}
