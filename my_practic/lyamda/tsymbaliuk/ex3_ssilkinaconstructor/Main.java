package lyamda.tsymbaliuk.ex3_ssilkinaconstructor;

import java.util.ArrayList;
import java.util.Arrays;

// Как получить ссылку на конструктор ArrayList/массива
public class Main {

    public static void main(String[] args) {
        System.out.println("---------------Ссылка на конструктор ArrayList`a----------");
        // Присваиваем ссылке типа функциональный интерфейс -
        //      ссылку на объект конструктора класса ArrayList
        // Типы возвращаемые должны быть совместимы и параметра одинаковы
        GeneratorList gen = ArrayList::new;
        // Используя эту ссылку - можем вызвать метод этого интерфейса
        Object a = gen.createNewObject();
        System.out.println("a.getClass() = " + a.getClass());

        System.out.println("---------------Ссылка на конструктор Массива----------");

        // Всё тоже самое
        GeneratorMassive gen2 = int[]::new;
        Object b = gen2.createNewObject(10);
        System.out.println("b = " + Arrays.toString((int[]) b));
    }
}
