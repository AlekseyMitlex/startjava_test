package lyamda.tregulov.function.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

// - Решение примера через lyamda c использованием родных интерфейсов
//      Predicate(interface Function) задачи ex1-ex2-ex4
//      interface Predicate - сравнивает объект типа Т
public class StudentPredicate {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public StudentPredicate(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "StudentPredicate{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class StudentInfo {

    // Можно вставить любой объект который implements`ирует interface Predicate c дженериком Student
    void testStudents(ArrayList<StudentPredicate> aL, Predicate<StudentPredicate> t) {
        for (StudentPredicate s : aL) {
            //Единственный метод Predicate test()
            if (t.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<StudentPredicate> list = new ArrayList<>();
        StudentPredicate st1 = new StudentPredicate("Ivan", 'm', 22, 3, 8.3);
        StudentPredicate st2 = new StudentPredicate("Nikolay", 'm', 28, 2, 6.4);
        StudentPredicate st3 = new StudentPredicate("Elena", 'f', 19, 1, 8.9);
        StudentPredicate st4 = new StudentPredicate("Petr", 'm', 35, 4, 7);
        StudentPredicate st5 = new StudentPredicate("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();

        Predicate<StudentPredicate> p1 = st -> st.avgGrade > 7.5;
        Predicate<StudentPredicate> p2 = st -> st.sex == 'm';

        // Обычная проверка
        si.testStudents(list, p1);
        System.out.println("-----------------------------------");

        // Проверка объединенная
        si.testStudents(list, p1.and(p2));
        System.out.println("---");
        si.testStudents(list, p1.or(p2));
        System.out.println("-----------------------------------");

        // Проверка с negate(). Вывод всех, кто не соответствует p1
        si.testStudents(list, p1.negate());
    }
}
