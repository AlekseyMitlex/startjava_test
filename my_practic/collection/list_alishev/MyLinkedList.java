package collection.list_alishev;

import java.util.Arrays;

// Пример односвязный LinkedList
public class MyLinkedList {
    private Node head;
    private int size;

    private Node Head;

    // add() Реализуем метод
    public void add(int value) {
        // если это первое добавление в список
        if (head == null) {
            this.head = new Node(value);
        } else {

            //  Цепочка, начинается с head, считывает есть ли null,
            //  если нет, то переходит к следующему элементу,
            //  когда элемент будет последний, его ссылка будет указывать на null,
            //  мы выходим из цикла с переменной temp указывающей на ссылку
            //  [1]-[2]-[3]
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            // создаём в этой ссылке новый Узел(объект)
            temp.setNext(new Node(value));
        }

        size++;
    }

    // get() Реализуем метод
    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        throw new IllegalArgumentException();
    }

    // remove() Реализуем метод
    public void remove(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            // Находясь в удаляемом элементе, удалить его нельзя,
            // поэтому мы находимся в предыдущем и используем +1 (как будто в нужном)
            if ((currentIndex + 1) == index) {
                // Изменяем ссылку на(Получаем ссылку из предыдущего на нужный(который удаляем)
                // и на его ссылку, на следующий за ним
                temp.setNext(temp.getNext().getNext());
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    // Это в классе Object
    public String toString() {
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    // NODE CLASS
    private static class Node {
        private int Value;
        private Node next;

        // Конструктор только со значением, потому что,
        // при создании узла на вход будем подавать только значение
        public Node(int value) {
            Value = value;
        }

        public int getValue() {
            return Value;
        }

        public void setValue(int value) {
            Value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

class Test {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println("myLinkedList = " + myLinkedList);
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
    }
}
