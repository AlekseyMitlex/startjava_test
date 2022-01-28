package generics;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        // Так видит compilation
        ArrayList<Integer> al1 = new ArrayList<>();
        // Так видит RunTime(JVM), вся инфо о Generics удаляется
//        ArrayList al1 = new ArrayList<>();
//        int i = al1.get(0);
        // Происходит стирание типов, без кастинга JVM al1.get(0)
        // видит, как объект
//        int i = (Integer) al1.get(0);

    }
}
