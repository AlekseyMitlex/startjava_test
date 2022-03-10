package lyamda.tsymbaliuk.ssilki.ex4_obobshenii_functuion_interface.ex42;

import java.util.Arrays;

// Как в качестве 2-го параметра использовать и передавать метод
public class Main {

    public static void main(String[] args) {
        String[] array = new String[]{"hello", "world"};
        changeStringArray(array, String::toUpperCase);
        System.out.println("array = " + Arrays.toString(array));
    }

    // Примени этот метод к каждому элементу этого массива
    public static void changeStringArray(String[] array, StringModificationFunction smf) {
        for (int i = 0; i < array.length; i++) {
            array[i] = smf.modification(array[i]);
        }
    }
}
