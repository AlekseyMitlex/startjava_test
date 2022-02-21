package Initializing_fields;

import java.util.ArrayList;
import java.util.List;

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

        // Инициализация происходит в static field по принципу предыдущего примера:
        // - если в результате выполнения происходит проверяемое исключение.
        // - если инициализация производится путем выполнения кода, который не может быть представлен в виде выражения.
        static List<Character> alphabet;

        static {
            alphabet = new ArrayList<Character>();
            for (char c = 'a'; c <= 'z'; c++) alphabet.add(c);
        }

        // - Инициализация статических полей в месте объявления и статические блоки
        //      выполняются в порядке их объявления в классе
        static int i1 = initialize("i0");

        static int i2;

        static {
            i2 = initialize("i1");
        }

        static int i3 = initialize("i2");

        static int i4;

        static {
            i4 = initialize("i4");
        }

        static int initialize(String name) {
            System.out.println(name);
            return 0;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Before class loading");
        Class.forName(C.class.getName());
        System.out.println("After class loading");
    }
}
