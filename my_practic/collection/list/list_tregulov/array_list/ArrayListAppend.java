package collection.list.list_tregulov.array_list;

import java.util.ArrayList;

// TODO : get(index) - добавить/изменить индекс на новый
public class ArrayListAppend {

    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder stringBuilder1 = new StringBuilder("hello");
        StringBuilder stringBuilder2 = new StringBuilder("ok");
        StringBuilder stringBuilder3 = new StringBuilder("privet");
        list.add(stringBuilder1);
        list.add(stringBuilder2);
        list.add(stringBuilder3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        System.out.println("list= " + list);
        for (StringBuilder stringBuilder : list) {
            System.out.print(stringBuilder + " ");
        }
    }
}
