package collection.list_alishev;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOsnovi {

    public static void main(String[] args) {
        // TODO : Согласно конвенции, в связи с тем, что ArrayList реализует List,
        //  писать всегда надо List
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList = " + arrayList);

        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList.get(99) = " + arrayList.get(9));

        System.out.println("arrayList.size() = " + arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList = " + arrayList.get(i));
        }

        for (Integer integer : arrayList) {
            System.out.println("arrayList = " + integer);
        }

        // TODO : один из самых неэффективных методов в ArrayList
        //  из за удаления и добавления всех индексов, кроме последнего
        arrayList.remove(5);
        System.out.print("arrayList = " + arrayList);


    }
}
