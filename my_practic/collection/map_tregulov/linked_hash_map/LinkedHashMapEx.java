package collection.map_tregulov.linked_hash_map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {

        // TODO: Порядок по стандарту может быть false/tru,
        //  где false - по добавлению, а true - последний используемый переходит в конец
        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 4);

        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);

        System.out.println("lhm = " + lhm);

        System.out.println("lhm.get = " + lhm.get(7.2));
        System.out.println("lhm.get = " + lhm.get(7.5));
        System.out.println("lhm = " + lhm);
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
