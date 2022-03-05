package nested_classes.anonymous_class.projava.ex2;

abstract class Base {
    private static int i;

    Base(int i) {
        System.out.println("Base constructor, i= " + i);
        Base.i = i + 10;
        System.out.println("Base constructor, Base.i= " + Base.i);
    }

    public abstract void f();

    public static Base getAnonBase(int i) {
        return new Base(i) {
            private int anonI;

            // инициализатор анонимного класса
            {
                anonI = i + 20;
                System.out.println("Инициализатор анонимного класса i = " + i);
                System.out.println("Инициализатор анонимного класса anonI = " + anonI);
                System.out.println("Инициализатор анонимного класса Base.i = " + Base.i);
            }

            public void f() {
                System.out.println("Метод f() анонимного класса i = " + i);
                System.out.println("Метод f() анонимного класса anonI = " + anonI);
                System.out.println("Метод f() анонимного класса Base.i = " + Base.i);
                // i++; // если раскоментировать то будет ошибка
            }
        };
    }
}

public class Main {

    public static void main(String[] args) {

        Base anon = Base.getAnonBase(10);
        anon.f();

    }
}
