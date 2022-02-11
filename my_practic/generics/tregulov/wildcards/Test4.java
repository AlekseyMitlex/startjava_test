package generics.tregulov.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {

        // <?> является супер типом для любого List`a
        List<?> list = new ArrayList<String>();

/*         Не может так, несмотря на то, что видит String.
         Т.к. ? Может быть не String и мы допустим ошибку
        list.add("privet")*/

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        abc(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("oKk");
        list2.add("okk");
        list2.add("ok");
        abc(list2);

        List<Double> list3 = new ArrayList<>();
        list3.add(3.14);
        list3.add(3.15);
        list3.add(3.16);
        showListInfo(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("oKk");
        list4.add("okk");
        list4.add("ok");
        showListInfo(list4);

        // TODO : bounded wildcards
        // Integer можно реализовывать наследников,
        // String в этом случае нельзя
        List<? extends Number> list30 = new ArrayList<Integer>();

        // Object можно реализовывать родителей,
        // String в этом случае нельзя
        List<? super Number> list35 = new ArrayList<Object>();

        ArrayList<Double> list5 = new ArrayList<>();
        list5.add(3.14);
        list5.add(3.15);
        list5.add(3.16);
        System.out.println("sum(list5) = " + sum(list5));

        ArrayList<Integer> list6 = new ArrayList<>();
        list6.add(3);
        list6.add(3);
        list6.add(3);
        System.out.println("sum(list5) = " + sum(list6));
    }

    // Использования ?  универсального метода для разных list`ov
    static void showListInfo(List<?> list) {
        System.out.println("Moi list soderjit sleduushie elementi = " + list);
    }

    // Моя задумка,так тоже наверное можно. Универсальный метод для разных list`ov
    static public <V> V abc(V val) {
        System.out.println("111Moi list soderjit sleduushie elementi = " + val);
        return val;
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
