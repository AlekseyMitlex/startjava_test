package lyamda.tregulov.osnovi_ex.ex3;

import java.util.ArrayList;

// Решение примера через lyamda задачи ex1-ex2
public class Student {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {

    void printStudent(Student st) {
        System.out.println("Imya studenta: " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age +
                ", kurs: " + st.course + ", srednyaya ocenka: " + st.avgGrade);
    }

    // Можно вставить любой объект который implements`ирует интерфейс StudentCheks
    void testStudents(ArrayList<Student> aL, StudentCheks sc) {
        for (Student s : aL) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();

        // По сути мы имплементируем интерфейс и оверрайдим его метод
        // Можно писать 4 способами, смысл один и тот же. 2-й лучше

        // Полный вариант написания, необходим кстати, если в теле будут дополнительные переменные и т.д.
        si.testStudents(list, (Student st) -> {
            return st.avgGrade > 8.5;
        });
        System.out.println("-----------------------------------");

        // Самый короткий вариант написания
        si.testStudents(list, st -> st.age > 27);
        System.out.println("-----------------------------------");

        // 3-й способ Анонимный класс по сути, тоже самое
        si.testStudents(list, new StudentCheks() {
            @Override
            public boolean test(Student st) {
                if (st.sex == 'f') return true;
                else return false;
            }
        });
        System.out.println("-----------------------------------");

        // Средний вариант написания
        si.testStudents(list, (Student st) -> st.course > 1);
        System.out.println("-----------------------------------");
        si.testStudents(list, (Student st) -> {
            return st.name.equals("Petr");
        });
        System.out.println("-----------------------------------");
        si.testStudents(list, (Student st) -> st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f');
    }
}

interface StudentCheks {
    boolean test(Student s);
}