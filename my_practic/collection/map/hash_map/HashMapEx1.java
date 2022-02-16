package collection.map.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<Students, Double> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>();
        Students st1 = new Students("Zaur", "Tregulov", 3);
        Students st2 = new Students("Maria", "Tregulov1", 1);
        Students st3 = new Students("Sergwey", "Tregulov2", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.5);
        System.out.println(map);

        Students st4 = new Students("Zaur", "Tregulov", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.equals(st4));
        //eqals i hashcode должны быть true / hashcode`i должны быть равны
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

    }

}

class Students {

    String name;
    String surname;
    int course;

    public Students(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (course != students.course) return false;
        if (name != null ? !name.equals(students.name) : students.name != null) return false;
        return surname != null ? surname.equals(students.surname) : students.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }
}
