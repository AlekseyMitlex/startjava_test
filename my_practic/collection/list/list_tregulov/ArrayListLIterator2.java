package collection.list.list_tregulov;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListLIterator2 {

    public static void main(String[] args) {
        // TODO : ПАЛИНДРОМ - сравнение символов с начала и конца друг с другом
        String s = "madam";
        List<Character> list = new LinkedList<>();
        // В String есть метод toCharArray(), который переводит символы
        // в массив
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }

        System.out.println("list = " + list);

        // Создаём 2 литератора
        // Будет идти с начало List`a с 0 символа
        ListIterator<Character> iterator = list.listIterator();
        // Будет идти с конца List`a
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalidrome = true;
        // Проверка на Есть элемент вначал и вконце
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            // Если есть. то равны ли они?
            if (iterator.next() != reverseIterator.previous()) {
                // Если нет то вышибает
                isPalidrome = false;
                break;
            }
        }
        // Просто цикл для вывода сообщения на экран
        if (isPalidrome) {
            System.out.println("Palidrome");
        } else {
            System.out.println("NOT Palidrome");
        }
    }

}
