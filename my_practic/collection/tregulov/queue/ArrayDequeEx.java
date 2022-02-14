package collection.tregulov.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

    // TODO : Двунаправленная очередь, могут использоваться
    //  и добавляться элементы с обоих концов.
    //  Работают оба правила FIFO - LIFO
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // TODO addFirst/addLast добавления элементов, вначало/конец списка,
        //  есть offerLast/offerFirst - добавления в начало/конец с ограничениями
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.addFirst(1);
        deque.addLast(8);
        System.out.println("deque = " + deque);

        // TODO removeFirst/removeLast удалить первый/последний элемент,
        //  poolFirst/poolLast удалить первый/последний элемент,
        //  без эксцепшн, когда нечего удалять и выводит null
        System.out.println("deque.removeFirst() = " + deque.removeFirst());
        System.out.println("deque.removeLast() = " + deque.removeLast());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());

        // TODO getFirst/getLast выводит первый/последний элемент,
        //  peeklFirst/peeklLast удалить первый/последний элемент,
        //  без эксцепшн, когда нечего удалять и выводит null

        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.addFirst(1);
        deque.addLast(8);
        System.out.println("deque = " + deque);
        System.out.println("deque.getFirst() = " + deque.getFirst());
        System.out.println("deque.getLast() = " + deque.getLast());
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());
    }
}
