package collection.list.list_tregulov.array_list.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

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

        //  add()
        list.add(new String("lol"));
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("poka");
        list.add(s1);

        //  add(index)
        list.add(1, "hello");
        for (String s : list) {
            System.out.println(s + " ");
        }

        //  get(index) - вывести все элементы
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n" + "list.get = " + list.get(3));

        //  set(index) - заменить индекс на новый
        list.set(1, "!!!");
        System.out.println("list = " + list);

        //  remove(Object) / remove(index) - элемент удалить
        list.remove(2);
        System.out.println("list = " + list);
        list.remove("!!!");
        System.out.println("list = " + list);

        list.remove("lol1");
        System.out.println("list = " + list);
        System.out.println("******************** = ");

        //  addAll(ArrayList aL) / addAll(index, ArrayList aL) объединяет коллекции
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

        //  clear() - void быстро очищает ArrayList
        list.clear();
        System.out.println("list = " + list);

        //  Обновка
        list.add(new String("lol"));
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(s1);
        list.add("poka");
        System.out.println("list = " + list);
        System.out.println(" IndexOf(Object) - int======================= ");

        //  IndexOf(Object) - int
        System.out.println(list.indexOf(s1));
        System.out.println(list.indexOf("ok"));
        System.out.println("carrs = " + carrs);
        System.out.println(carrs.indexOf(carr1));

        //  lastIndexOf(Object) - int - выдаёт самый последний индекс искомый в коллекции
        // -1 если не нашел индекс
        System.out.println(list.lastIndexOf(s1));
        System.out.println(list.lastIndexOf("poka"));
        System.out.println(list.lastIndexOf("poka!!!"));

        //   size() - int
        System.out.println("list2.size() = " + list2.size());

        //   isEmpty() - int Пустой ли ArrayList
        System.out.println("list.isEmpty() = " + list.isEmpty());

        //   contains(Object) - проверяет есть ли объект в ArrayList
        System.out.println("list.contains(\"poka\") = " + list.contains("poka"));
        System.out.println("list.contains(\"poka\") = " + carrs.contains(carr2));

        //   toString()
        System.out.println("list2.toString() = " + list2.toString());
        System.out.println("list.toString() = " + list.toString());
        System.out.println("carrs.toString() = " + carrs.toString());

        //   clone() - Object при использовании StringBuilder,
        //   изменяемые элементы, меняются и в другой коллекции
        ArrayList list1 = (ArrayList) carrs.clone();
        System.out.println("list1 = " + list1);
        System.out.println(" ************************** Перевод ArrayList в Array массив **********");

        //   toArray() - Object [] / toArray(DataType [] array) - DataType []
        //  Перевод ArrayList в Array массив
        //  РАЗНИЦА ^ 1-й вариант возвращает Объекты, 2-й возвращает,
        //  то что напишем вначале, в параметрах

        // Output list2.toArray() - is massive Object
        Object[] array1 = list2.toArray();
        // Красивый вывод 2 варианта:  1-й -
        System.out.println("array1 = " + Arrays.toString(array1));
        // 2-й
        for (Object o : array1) {
            System.out.print(o + " ");
        }

        // toArray(DataType [] array) - DataType []
        // 1-й
        ArrayList<StringBuilder> list5 = new ArrayList<>();
        StringBuilder[] array2 = list5.toArray(new StringBuilder[10]);
        System.out.println("\n" + "array2 = " + Arrays.toString(array2));
        // 2 - вариант
        Object[] list10 = list2.toArray(new Object[5]);
        for (Object o1 : list10) {
            System.out.print(o1 + ", ");
        }

        //   Arrays.asList(DataType []) - List<DataType>
        //  - Эти копии связаны одними данными.
        //  Изменяя любой индекс меняется и в другом
        List list3 = Arrays.asList(list);
        System.out.println("\n" + "list3 = " + list3);
        list.remove(0);
        System.out.println("\n" + "list3 = " + list3);

        //   Collections.sort(ArrayList<Datatype>) - void
        //  Сортировка массива по порядку
        String s = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list4 = new ArrayList<>();
        list4.add(s3);
        list4.add(s);
        list4.add(s4);
        list4.add(s2);
        System.out.println("list4 = " + list4);
        Collections.sort(list4);
        System.out.println("list4 = " + list4);

        //   equals(ArrayList<Datatype>) - boolean
        //  Равны или нет 2 шт Arraylist`a

        ArrayList<String> list6 = list4;
        System.out.println("list4.equals(list6) = " + list4.equals(list6));

        // Даже новой созданные будут равны. потому что String мне кажется!!!!
        ArrayList<String> list7 = new ArrayList<>();
        list7.add(s3);
        list7.add(s);
        list7.add(s4);
        list7.add(s2);
        Collections.sort(list7);
        System.out.println("list7 = " + list7);

        System.out.println("list7.equals(list6) = " + list7.equals(list6));
        System.out.println("list7.equals(list6) = " + list6.equals(list7));
        System.out.println("list7.equals(list6) = " + list4.equals(list7));
        System.out.println("list7.equals(list6) = " + list7.equals(list4));


    }
}

class Carr {
}