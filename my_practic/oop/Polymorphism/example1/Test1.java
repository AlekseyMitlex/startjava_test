package oop.Polymorphism.example1;

public class Test1 {

    public static void main(String[] args) {
//        Driver[] array1 = {new Driver(), new Driver()};
//        Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
//        Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};


        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
//        Help_able h = new Teacher();
//        h.help();
//        emp1.help();
//
//        emp1.work();
//        emp2.work();
//        emp3.work();
        Employee[] array2 = {emp1, emp2, emp3};

        for (Employee emp : array2) {
            emp.work();
        }
    }
}

abstract class Employee implements Help_able {

    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {

    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {

    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {

    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {

    void help();
}