package collection.queue.queue_alishev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueLinkedList {

    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        // Очередь FIFO
        Queue<Person> people = new LinkedList<>();

        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        // Первый пришёл и первый ушёл
        for (Person person : people) {
            System.out.println(person);
        }
        // ArrayBlockingQueue часто применяется, чтобы ограничить многозадачность/многопоточность,
        // ёмкость 10 - это ограничение, например с ArrayList она могла быть бесконечно длинной,
        // при заполнении мы не сможем добавить новый объект
        Queue<Person> people1 = new ArrayBlockingQueue<Person>(10);

        people1.add(person3);
        people1.add(person2);
        people1.add(person4);
        people1.add(person1);

        // Удалит head/первый в очереди элемент
        System.out.println("people1.remove() = " + people1.remove());
        // peek первый в очереди элемент. Узнать кто стал первым после удаления
        System.out.println("people1.peek() = " + people1.peek());
        System.out.println("people1 = " + people1);

        // C 4 people2.add срабтает исключение IllegalStateException: Queue full,
        // так как стоит ограничение ёмкость 3, поэтому необходимо добавлять через offer() b ,
        // будет возвращать специально значение true/false
        Queue<Person> people2 = new ArrayBlockingQueue<Person>(3);

        System.out.println(people2.offer(person3));
        System.out.println(people2.offer(person2));
        System.out.println(people2.offer(person4));
        System.out.println(people2.offer(person1));
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}