package baseJava_lessons.OOP.Inheritance.example1;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("voda");
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Driver extends Employee implements Help_able, Swim_able {

    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    public void pomosh() {
        System.out.println("Driver okazivaet pomosh");
    }

    public void tushitPojar(String s) {
        System.out.println("Driver tushit pojar pri pomoshi " + s);
        System.out.println(a);
    }

    public void swim() {
        System.out.println("Driver plavaet");
    }
}

class Teacher extends Employee implements Help_able {


    int kolichestvouchenikov;

    void uchit() {
        System.out.println("uchit");
    }

    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar pri pomoshi " + s);
        System.out.println(a);
    }

}

interface Help_able {
    // abstract моджно не писать, java сама дописывает
    abstract void pomosh();

    void tushitPojar(String s);

    // Всегда будет переписана java - public final static a
    int a = 10;

}

interface Swim_able {

    void swim();
}