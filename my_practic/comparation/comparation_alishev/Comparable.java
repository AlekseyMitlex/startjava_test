package comparation.comparation_alishev;

import java.util.*;


// Не сработает вывод на экран. потому как TreeSet не будет знать,
// как сортировать. Поэтому необходимо класс Person1 implements Comparable<Person1>,
// при этом необходимо переопределить метод compareTo по какому элементу будем сортировать,
// ID или NAME b т.к. используем TreeSet необходимо так же переопределить hashCode() and equals()
public class Comparable {
    public static void main(String[] args) {
        List<Person1> peopleList = new ArrayList<>();
        Set<Person1> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        System.out.println("peopleList = " + peopleList);
        System.out.println("peopleSet = " + peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person1(3, "Katy"));
        collection.add(new Person1(4, "George"));
        collection.add(new Person1(2, "Tom"));
        collection.add(new Person1(1, "Bob"));
    }
}

class Person1 implements java.lang.Comparable<Person1> {
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person1 person1 = (Person1) o;

        if (id != person1.id) return false;
        return name != null ? name.equals(person1.name) : person1.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    // В отличие от первых примеров мы имплементим Comparable и переопределяем compareTo,
    // поэтому сравниваем не 2 объекта, а этот объект с каким то другим
    // Cортировка по ID
    /*@Override
    public int compareTo(Person1 o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }*/

    // Cортировка по NAME длине символов
    @Override
    public int compareTo(Person1 o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}