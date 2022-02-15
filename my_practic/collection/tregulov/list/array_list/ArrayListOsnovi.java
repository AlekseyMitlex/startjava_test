package collection.tregulov.list.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOsnovi {

    // TODO : List - упорядоченный список, в котором у каждого элемента есть индекс.
    //  Дубликаты значений допускаются.
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // Dobovlyaem raznie object
        list.add("privet");

        // Dlya sozdaniya i vneseniya object car, нужно создать Class Car
        Car car = new Car();
        list.add(car);

        // Dlya sozdaniya i vneseniya object student, нужно создать Class Student
        Student student = new Student();
        list.add(student);

        list.add(new StringBuilder("ok"));

        System.out.println("list = " + list);

        // Когда хотим добавлять только String, то используем generics
        // Используем количество объектов - правда не понимаю зачем пока что.
        // Т.к. он же автоматически расширяется, при добавлении новых
        // Возможно ради минимума
        ArrayList<String> list2 = new ArrayList<>(30);
        list2.add("tratrrr");

        // Создаются разные объекты
        System.out.println("// Создаются разные объекты = ***********");
        ArrayList<String> list5 = new ArrayList<>(list2);
        list2.set(0, "1111");
        System.out.println("list5 = " + list5);
        System.out.println("list2 = " + list2);
        System.out.println(list5 == list2);
        list2.add("poka");

        // Используем List. потому что это родитель для ArrayList
        List<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("ok"));
    }
}

class Car {
}

class Student {
}