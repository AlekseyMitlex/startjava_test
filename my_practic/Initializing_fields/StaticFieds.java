package Initializing_fields;

public class StaticFieds {

    public static class C {
        // Как видно из вывода переменная i инициализируется в результате загрузки класса
        // Print:   Before class loading
        //          C.i initialized
        //          After class loading
        static int i = value();

        static int value() {
            System.out.println("C.i initialized");
            return 1;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Before class loading");
        Class.forName(C.class.getName());
        System.out.println("After class loading");
    }
}
