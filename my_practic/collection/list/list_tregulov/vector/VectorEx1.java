package collection.list.list_tregulov.vector;

import java.util.Vector;

public class VectorEx1 {
    //  Общий вывод ArrayList всегда лучше. Vector устарел
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println("vector = " + vector);
        System.out.println("vector.firstElement() = " + vector.firstElement());
        System.out.println("vector.lastElement() = " + vector.lastElement());
        System.out.println(vector.remove(2));
        System.out.println("vector.get(2) = " + vector.get(2));
    }
}
