package nested_classes.anonymous_class;

public class AnonymousClass {

    private int a1 = 10;

    // Anonymous не имеют имени.
    // Используются в тех же самых местах, что и LocalClass.
    public static void main(String[] args) {

        // - Мы создали какой-то класс, имплементировали Math,
        //      оверрайд метод doOperation. Какой класс? - Анонимный,
        //      т.е. Создать класс, объект которого "m" - имплементировать интерфейс и
        //      овверайдить метод - это то же самое
        // - Это всё является одним выражением, поэтому в конце стоит ";"
        // - Внутрь можем добавлять, всё что хотим, как и в любой класс.
        // - Таких анонимных классов может быть бесконечно.
        // - Ничего не измениться если это будет класс MathExtends, по сути мы также extends класс и
        //      наследуем метод или можем оверрайдить метод.
        // ИМЕЕТ СМЫСЛ, если вам нужно 1 раз создать объект,
        //      имплементить/екстендить, оверрайдить метод, чтобы лишний раз все написать.
        // Можем обращаться к private внешнего класса
        Math m1 = new Math() {
            int c = 10;

            void abc() {
            }

            @Override
            public int doOperation(int a, int b) {
                // Добираемся к private a1 c помощью объекта класса AnonymousClass, т.к. a1 не static
                AnonymousClass aClass = new AnonymousClass();
                return a + b + aClass.a1;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        MathExtends m3 = new MathExtends() {
        };

        System.out.println("m.doOperation(3,6) + = " + m1.doOperation(3, 6));
        System.out.println("m.doOperation(3,6) * = " + m2.doOperation(3, 6));
        System.out.println("m.doOperation(3,6) / = " + m3.doOperation(6, 3));
    }
}

interface Math {

    int doOperation(int a, int b);
}

class MathExtends {

    int doOperation(int a, int b) {
        return a / b;
    }
}