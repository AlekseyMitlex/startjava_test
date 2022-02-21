package Initializing_fields;

public class InitializationInConstructorAndInheritance {

    // конструктор B первым делом вызвал конструктор предка - класса A
    // конструктор A проинициализировал поле a объекта А
    // при возврате из конструктора A, конструктор B проинициализировал поле b объекта B
    static class A {
        String a;

        A() {
            a = "a";
            System.out.println("a initialized");
            System.out.println("b=" + ((B) this).b);
        }
    }

    static class B extends A {
        String b;

        B() {
            b = "b";
            System.out.println("b initialized");
            System.out.println("b=" + b);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new B();
    }
}
