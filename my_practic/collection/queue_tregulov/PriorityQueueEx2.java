package collection.queue_tregulov;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {

    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println("priorityQueue = " + priorityQueue);

        //  pool() удаляет сначала с наивысшим приоритетом(по курсу),
        //  когда нечего удалять - не будет эксцепшн и выводит null
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
    }
}

class Student implements Comparable<Student> {

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // Применили сортировку по курсу
    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    // TODO : Все убираем, кроме return course == student.course;
    //  чтобы всё было в соответствии с нашими параметрами в compareTo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
