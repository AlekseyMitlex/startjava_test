package collection.set_tregulov.tree_set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetMethod {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet();
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println("treeSet = " + treeSet);

        // first первый по сортировке курса
        System.out.println("treeSet.first() = " + treeSet.first());
        // last последний по сортировке курса
        System.out.println("treeSet.last() = " + treeSet.last());
        // headSet вывести кто в сортировке имеет < значение по курсу
        Student st6 = new Student("Oleg", 3);
        System.out.println("treeSet.headSet = " + treeSet.headSet(st6));
        // tailSet вывести кто в сортировке имеет >= значение по курсу
        System.out.println("treeSet.tailSet = " + treeSet.tailSet(st6));
        // subSet вывести range (>= и <) значения по курсу
        Student st7 = new Student("Petya", 2);
        Student st8 = new Student("Ivan", 4);
        System.out.println("treeSet.subSet = " + treeSet.subSet(st7, st8));
        // equals проверка, равные курсы
        System.out.println("st7.equals(st3) = " + st3.equals(st7));
        System.out.println(st7.hashCode() == st3.hashCode());
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

    //  Все убираем, кроме return course == student.course;
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