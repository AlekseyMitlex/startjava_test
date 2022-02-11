package array_list.tregulov;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Carr> carrs = new ArrayList<>();

        Carr carr1 = new Carr();
        Carr carr2 = new Carr();
        Carr carr3 = new Carr();

        carrs.add(carr1);
        carrs.add(carr2);
        carrs.add(carr3);


        String s1 = new String("lol1");

        // TODO : add()
        list.add(new String("lol"));
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("poka");
        list.add(s1);

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

        // TODO : remove(Object) / remove(index)
        list.remove(2);
        System.out.println("list = " + list);
        list.remove("!!!");
        System.out.println("list = " + list);

        list.remove("lol1");
        System.out.println("list = " + list);
        System.out.println("******************** = ");

        // TODO : addAll(ArrayList aL) / addAll(index, ArrayList aL) объединяет коллекциии
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        list.addAll(list2);
        System.out.println("list = " + list);
        // Добавятся начиная с 1 индекса
        list.addAll(1, list2);
        System.out.println("list = " + list);

        // TODO : clear() - void быстро очищает ArrayList
        list.clear();
        System.out.println("list = " + list);

        // TODO : Обновка, все поудалялось
        list.add(new String("lol"));
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(s1);
        list.add("poka");
        System.out.println("list = " + list);
        System.out.println(" ======================= ");

        // TODO : IndexOf(Object) - int
        System.out.println(list.indexOf(s1));
        System.out.println(list.indexOf("ok"));
        System.out.println("carrs = " + carrs);
        System.out.println(carrs.indexOf(carr1));

        // TODO : lastIndexOf(Object) - int - выдаёт самый последний индекс искомы в коллекции
        // -1 если не нашел индекс
        System.out.println(list.lastIndexOf(s1));
        System.out.println(list.lastIndexOf("poka"));
        System.out.println(list.lastIndexOf("poka!!!"));

        // TODO : siza() - int
        System.out.println("list2.size() = " + list2.size());

        // TODO : isEmpty() - int Пустой ли ArrayList
        System.out.println("list.isEmpty() = " + list.isEmpty());

        // TODO : contains(Object) - проверяет есть ли объект в ArrayList
        System.out.println("list.contains(\"poka\") = " + list.contains("poka"));
        System.out.println("list.contains(\"poka\") = " + carrs.contains(carr2));

        // TODO : toString()
        System.out.println("list2.toString() = " + list2.toString());
        System.out.println("list.toString() = " + list.toString());
        System.out.println("carrs.toString() = " + carrs.toString());

        // TODO : clone() - Object при использовании StringBuilder,
        // TODO : изменяемые элементы, меняются и в другой коллекции
        ArrayList list1 = (ArrayList) carrs.clone();
        System.out.println("list1 = " + list1);
        System.out.println(" ************************** Перевод ArrayList в Array массив **********");

        // TODO : toArray() - Object [] / toArray(DataType [] array) - DataType []
        //  TODO : Перевод ArrayList в Array массив
        Object[] array1 = list2.toArray();
        for (Object o : array1) {
            System.out.println(o);
        }

        ArrayList<StringBuilder> list5 = new ArrayList<>();
        StringBuilder[] array2 = list5.toArray(new StringBuilder[10]);
        System.out.println("array2 = " + Arrays.toString(array2));


    }
}

class Carr {
}