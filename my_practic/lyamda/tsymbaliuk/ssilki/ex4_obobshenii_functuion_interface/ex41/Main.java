package lyamda.tsymbaliuk.ssilki.ex4_obobshenii_functuion_interface.ex41;

import java.util.Arrays;

// Как можно используя ссылки сократить код
public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"Anna", "Ira", "Alexander", "Katia"};
        // Если не брать во внимание лямду, то пришлось бы
        //      имплементировать интерфейс Comparator или
        //      создавать анонимный класс(new Comparator<String>())
        // Поэтому нужна ссылка на метод
        Arrays.sort(names, Main::compareStringLenhth);
        System.out.println("names = " + Arrays.toString(names));
    }

    public static int compareStringLenhth(String a, String b) {
        return a.length() - b.length();
    }
}
