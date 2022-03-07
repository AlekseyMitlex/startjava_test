package lyamda.tregulov.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// - Решение примера через lyamda c использованием родных интерфейсов
//      Predicate(interface Function) задачи ex1-ex2-ex4
//      interface Predicate - сравнивает объект типа Т
public class StudentFunction {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public StudentFunction(String name, char sex, int age, int course, double avgGrade) {
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
    void testStudents(ArrayList<StudentFunction> aL, Predicate<StudentFunction> t) {
        for (StudentFunction s : aL) {
            //Единственный метод Predicate test()
            if (t.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<StudentFunction> students = new ArrayList<>();
        StudentFunction st1 = new StudentFunction("Ivan", 'm', 22, 3, 8.3);
        StudentFunction st2 = new StudentFunction("Nikolay", 'm', 28, 2, 6.4);
        StudentFunction st3 = new StudentFunction("Elena", 'f', 19, 1, 8.9);
        StudentFunction st4 = new StudentFunction("Petr", 'm', 35, 4, 7);
        StudentFunction st5 = new StudentFunction("Maria", 'f', 23, 3, 9.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo si = new StudentInfo();

        Function<StudentFunction, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, stud -> stud.avgGrade);
        double res1 = avgOfSmth(students, stud -> (double) stud.course);
        double res2 = avgOfSmth(students, stud -> (double) stud.age);
        System.out.println("res avgGrade = " + res);
        System.out.println("res course = " + res1);
        System.out.println("res age = " + res2);
    }

    // Найти среднее арифметическое по курсу/оценке/возрасту и т.д.
    private static double avgOfSmth(List<StudentFunction> list, Function<StudentFunction, Double> f) {
        double result = 0;
        for (StudentFunction st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
