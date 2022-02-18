package collection.hashcodeEquals_alishev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashcodeEquals {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "Один");
        map.put(1, "Другое значение");

        set.add(1);
        set.add(1);

        System.out.println("map = " + map);
        System.out.println("set = " + set);

        Map<Person, String> map1 = new HashMap<>();
        Set<Person> set1 = new HashSet<>();

        // java видит объекты, как разные
        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map1.put(person1, "123");
        map1.put(person2, "123");

        set1.add(person1);
        set1.add(person2);

        System.out.println("map1 = " + map1);
        System.out.println("set1 = " + set1);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /* Контракт hashcode() equals()
       1) У двух проверяемых объектов вызываем метод hashcode()
       если хэши разные, то 2 объекта точно разные.

       если хеши одинаковые - может быть одинаковые или коллизия, поэтому
       вызываем equals()
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // Любой object конвертируется в целое число int, сравнивать гораздо проще и быстро
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
