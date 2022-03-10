package lyamda.tsymbaliuk.ssilki.ex5_kompoziciya_funkcii;

import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String[]> fun = functionComposition(Main::intToStr, Main::strToStrArray);
        String[] res = fun.apply(5);

        System.out.println("res = " + Arrays.toString(res));
    }


    // Метод принимает F  выход S, затем принимает S выход R.
    //      В итоге принимает F выводит R
    public static <F, S, R> Function<F, R> functionComposition(Function<F, S> f1, Function<S, R> f2) {
        class Composition {
            public R comp(F t) {
                S temp = f1.apply(t);
                return f2.apply(temp);
            }
        }
        Composition a = new Composition();
        return a::comp;
    }

    // Первый метод на вход принимает int, а на выходе получаем хитрым образом строку
    public static String intToStr(Integer count) {
        return "Hello " + count;
    }

    // Второй метод принимает строку, а возвращает массив строк
    public static String[] strToStrArray(String text) {
        String[] r = text.split(" ");
        String[] result = new String[Integer.valueOf(r[1])];
        for (int i = 0; i < result.length; i++) {
            result[i] = r[0];
        }
        return result;
    }
}