package collection.tregulov.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

    //  TODO : коллекция хранящая последовательность элементов,
    //  FIFO - добавляет в конец очереди, используется из начала очереди
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // TODO : add - добавляет элементы в конец очереди
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Alrksandr");
        System.out.println("queue = " + queue);

        // TODO : offer - добавляет элементы в конец очереди,
        //  разница между add и offer в то что, если есть очередь,
        //  то offer бы ограничил создание элементов, при достижения этого лимита очереди
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Alrksandr");
        System.out.println("queue = " + queue);

        // TODO : remove - удаляетя Zaur, первый в списке и т.д. ро очереди ближе к концу,
        //  можно удалить из середины, но Que не предназчен для такого и теряется весь
        //  смысл использования, проще использовать другой List
        System.out.println("queue.remove() = " + queue.remove());
        // TODO : poll тоже что и remove, но не выкинет эксцепшн в конце, а выкатит null
        System.out.println("queue.poll() = " + queue.poll());
        // TODO : element - показывает верхний/первый элемент в очередь, если нет то выбросит эксцепшн
        System.out.println("queue.element() = " + queue.element());
        // TODO : peek тоже что и element, но не выкинет эксцепшн в конце, а выкатит null
        System.out.println("queue.peek() = " + queue.peek());

    }

}
