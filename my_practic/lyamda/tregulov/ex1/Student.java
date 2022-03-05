package lyamda.tregulov.ex1;

import java.util.ArrayList;

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

    void printStudentsOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsbySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
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
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("____________________________");
        si.printStudentsUnderAge(list, 9);
        System.out.println("____________________________");
        si.printStudentsOverAge(list, 25);
        System.out.println("____________________________");
        si.printStudentsUnderAge(list, 27);
        System.out.println("____________________________");
        si.printStudentsbySex(list, 'm');
        System.out.println("____________________________");
        si.printStudentsMixCondition(list, 7.2, 23, 'f');

    }
}
