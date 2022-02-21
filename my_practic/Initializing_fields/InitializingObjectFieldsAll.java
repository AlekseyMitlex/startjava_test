package Initializing_fields;

public class InitializingObjectFieldsAll {

    // Инициализация полей в месте объявления и в инициализационном блоке происходит до инициализации в конструкторе.
    // Инициализации полей в месте объявления и в инициализационных блоках выполняются в порядке их объявления в классе.
    // Инициализация полей базового класса происходит полностью до инициализации производного класса,
    //      т.е. сначала выполняются все инициализаторы базового класса, а потом все инициализаторы производного класса.

    static int initialize(String message) {
        System.out.println(message);
        return 0;
    }

    static class A {
        int i0 = initialize("i0");

        int i1;

        {
            i1 = initialize("i1");
        }

        int i2 = initialize("i2");

        int i3;

        A() {
            i3 = initialize("i3");
        }
    }

    static class B extends A {
        int i4 = initialize("i4");

        int i5;

        {
            i5 = initialize("i5");
        }

        int i6;

        B() {
            i6 = initialize("i6");
        }
    }

    public static void main(String[] args) {
        new B();
    }
}
