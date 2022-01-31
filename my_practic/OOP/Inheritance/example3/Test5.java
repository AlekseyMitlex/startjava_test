package OOP.Inheritance.example3;

public class Test5 {
}

interface I1 {
    void abc();

    // Если нужно оверайдить 10 классах из 100, поэтому с default
    // default - не имеет отношение к access modifier
    // default method - должен иметь тело
    default void ghi() {
        System.out.println("eto method ghi");
    }

    // static method не наследуются, поэтому чтожно вызвать
    // только с помощью тип данных этого интерфейса, где создан
    // public проставит java перед методом
    static void def() {
        System.out.println("eto static method def");
    }

    interface I5 {
        static void fed() {
            System.out.println("eto static method def");
        }

    }


    class R implements I1, I5 {

        public void abc() {
            System.out.println("eto method abc");
        }

        public static void main(String[] args) {
            R z = new R();
            z.abc();
            z.ghi();
            I1.def();
            I5.fed();
        }
    }
}
