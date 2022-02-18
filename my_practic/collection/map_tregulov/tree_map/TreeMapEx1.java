package collection.map_tregulov.tree_map;

import java.util.TreeMap;

public class TreeMapEx1 {

    public static void main(String[] args) {

        //  Хранятся в отсортированном порядке по возрастанию.
        //  В основе лежит красно-чёрное дерево, метод быстрый, но медленнее чем HashMap
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 4);
        Student st5 = new Student("Vasiliy", "Smirnov", 4);
        Student st6 = new Student("Sasha", "Kapustin", 4);
        Student st7 = new Student("Elena", "Sidorova", 4);

        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);

        System.out.println("treeMap = " + treeMap);
        // get
        System.out.println("treeMap.get(6.4) = " + treeMap.get(6.4));
        // remove
        System.out.println("treeMap.remove = " + treeMap.remove(5.8));

        // перезаписал
        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);

        // descendingMap()  сортировка по убыванию ключей
        System.out.println("treeMap.descendingMap() = " + treeMap.descendingMap());

        // tailMap() нахождение range - отрезков у кого больше ключ чем...
        // вывод всех кто больше > 7.3
        System.out.println("treeMap.tailMap = " + treeMap.tailMap(7.3));

        // headMap() нахождение range - отрезков у кого меньше ключ чем...
        System.out.println("treeMap.headMap = " + treeMap.headMap(7.3));

        // lastEntry() поиск элемента в самом конце с самым большим ключем
        System.out.println("treeMap = " + treeMap.lastEntry());

        // firstEntry() поиск элемента в самом начале с самым меньшим ключем
        System.out.println("treeMap.firstEntry() = " + treeMap.firstEntry());

        // Перезаписываем по возрастанию
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);
    }
}

class Student {

    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
}

