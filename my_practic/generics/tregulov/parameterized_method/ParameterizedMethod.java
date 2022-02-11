package generics.tregulov.parameterized_method;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(150);
        int a = GenMethod.getSecondElement(al1);
        System.out.println("a = " + a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        String s = GenMethod.getSecondElement(al2);
        System.out.println("s = " + s);


    }
}

class GenMethod {

    // Методо возвращает 2-й элемент
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(1);
    }
}
