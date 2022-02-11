package generics.tregulov.type_erasure;

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

class info<T> {

    private final T value;

    public info(T value) {
        this.value = value;
    }

    // Parametrizovannii Method
    public <V> V abc(V val) {
        return val;
    }

    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue() {
        return value;
    }

}
