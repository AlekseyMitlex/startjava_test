package collection.list_alishev;

import java.util.Arrays;

// TODO : Пример односвязный LinkedList
public class MyLinkedList {
    private Node head;
    private int size;

    private Node Head;

    public void add(int value) {
        // если это первое добавление в список
        if (head == null) {
            this.head = new Node(value);
        } else {

            // TODO: Цепочка, начинается с head, считывает есть ли null,
            //  если нет. то переходит к следующему элементу,
            //  когда элемент будет последний, его ссылка будет указывать на null,
            //  мы выходим из цикла с переменной temp указывающей на ссылку
            // [1]-[2]-[3]
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            // TODO: создаём в этой ссылке новый Узел(объект)
            temp.setNext(new Node(value));
        }

        size++;
    }

    // Это в классе Object
    public String toString() {
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
            result[idx++] = temp.getValue();
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
