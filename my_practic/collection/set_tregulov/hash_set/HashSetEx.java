package collection.set_tregulov.hash_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {

        //  Не допускает дубликатов, неупорядоченное множество,
        //  могут быть null,
        //  ключи это элементы HashSet, константа - заглушка
        Set<String> set = new HashSet<>();

        // TODO : add - тоже, что и put
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);
        System.out.println("set = " + set);

        // TODO : remove - удалить
        System.out.println("set.remove(\"Zaur\") = " + set.remove("Zaur"));
        // TODO : size - количество элементов
        System.out.println("set.size = " + set.size());
        // TODO : isEmpty - пусто ли наш Set?
        System.out.println("set.isEmpty() = " + set.isEmpty());
        // TODO : contains - хранится ли элемент?
        System.out.println("set.contains(\"Marina\") = " + set.contains("Marina"));


    }
}
