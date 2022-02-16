package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

    public static void main(String[] args) {
        // TODO : натуральная сортировка(по возрастанию) или Comparable/Comparator,
        //  используется элемент из очереди, приоритет которого выше
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        //1 4 7 8 10

        // TODO : Когда выводим на экран отображается 1 4 7 10 8,
        //  когда используем, наивысшим приоритетом будет 8, потом 10
        System.out.println("priorityQueue = " + priorityQueue);
        // TODO : peek вызывается элемент с наивысшим приоритетом
        System.out.println("priorityQueue.peek() = " + priorityQueue.peek());
        // TODO : remove удаляется элемент с наивысшим приоритетом
        System.out.println("priorityQueue.remove() = " + priorityQueue.remove());
        System.out.println("priorityQueue.remove() = " + priorityQueue.remove());
        System.out.println("priorityQueue.remove() = " + priorityQueue.remove());
        System.out.println("priorityQueue.remove() = " + priorityQueue.remove());
        System.out.println("priorityQueue.remove() = " + priorityQueue.remove());
    }
}
