package nested_classes.local_inner_class.projava.ex2.ex21;

public class Main {

    // интерфейс используемый ниже
    interface IntHolder {
        int getValue();
    }

    public static void main(String[] args) {
        // Массив для хранения 10 объектов
        IntHolder[] holders = new IntHolder[10];

        for (int i = 0; i < 10; i++) { // Заполнить массив
            final int fi = i; // локальная переменная fi вне класса
            class MyIntHolder implements IntHolder { // Локальный класс
                public int getValue() {
                    return fi; // использует переменную fi
                }
            }
            holders[i] = new MyIntHolder(); // в массив вносится экземпляр
            // локального класса
        }
        // Локальный класс теперь вне области видимости, поэтому мы не можем к
        // нему обратиться.
        // Но в массиве у нас есть 10 действующих экземпляров этого класса.
        // Локальная переменная fi вне области нашей видимости, но она все еще в
        // области видимости метода getValue() каждого из 10 объектов.
        // Поэтому мы можем вызвать метод getValue() для каждого объекта
        // и вывести значения. Выводятся цифры от 0 до 9.
        for (int i = 0; i < 10; i++)
            System.out.print(holders[i].getValue() + " ");
    }
}