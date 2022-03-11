package lyamda.tsymbaliuk.lyamda.ex21_fi_obobshennii;

import java.util.Locale;

// Если мы хотим реализовать ФИ обобщенный, то придется
//      явно указывать параметр типа(дженерик)
public class Main {

    public static void main(String[] args) {
        Modificator<String> mod = text -> text.toUpperCase(Locale.ROOT);
        System.out.println(mod.modofocation("hello"));
    }
}
