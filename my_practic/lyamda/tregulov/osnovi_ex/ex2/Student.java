package lyamda.tregulov.osnovi_ex.ex2;

import java.util.ArrayList;

// Решение примера через interface задачи ex1
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
        FindStudentsOverGrade fsog1 = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsog2 = new FindStudentsUnderGrade();
        FindStudentsOverAge fsog3 = new FindStudentsOverAge();
        FindStudentsUnderAge fsog4 = new FindStudentsUnderAge();
        FindStudentsBySex fsog5 = new FindStudentsBySex();
        FindStudentsMixCondition fsog6 = new FindStudentsMixCondition();

        si.testStudents(list, fsog1);
        System.out.println("-----------------------------------");
        si.testStudents(list, fsog2);
        System.out.println("-----------------------------------");
        si.testStudents(list, fsog3);
        System.out.println("-----------------------------------");
        si.testStudents(list, fsog4);
        System.out.println("-----------------------------------");
        si.testStudents(list, fsog5);
        System.out.println("-----------------------------------");
        si.testStudents(list, fsog6);
    }
}

interface StudentCheks {
    boolean test(Student s);
}

class FindStudentsOverGrade implements StudentCheks {
    public boolean test(Student s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentCheks {
    public boolean test(Student s) {
        return s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentCheks {
    public boolean test(Student s) {
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentCheks {
    public boolean test(Student s) {
        return s.age > 27;
    }
}

class FindStudentsBySex implements StudentCheks {
    public boolean test(Student s) {
        return s.sex == 'm';
    }
}

class FindStudentsMixCondition implements StudentCheks {
    public boolean test(Student s) {
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}