package lyamda.tsymbaliuk.lyamda.ex1;

import java.util.Locale;

public class Main {

    // Лямда функция - анонимная функция реализующая функциональный интерфейс,
    //      используются в том же контексте, что и ссылки на методы
    // Объявляем ссылку типа ФИ(StringModificator) и переменная для записи ссылки sm
    // То что в параметрах и возвращаем должно СОПАДАТЬ ПО КОЛИЧЕСТВУ И ТИПУ
    //      text - параметр, text.toUpperCase(Locale.ROOT) - то что возвращаем в методе модернизируя
    // -> - лямда оператор
    public static void main(String[] args) {
        // Однострочная лямда функция
        StringModificator sm = text -> text.toUpperCase(Locale.ROOT);
        System.out.println("sm = " + sm.getString("hello"));

        // Многострочная лямда функция
        // Используюся скобки {}
        // return - каcается только лямда функции, он не касается, что в методе
        StringModificator sm2 = text -> {
            String result = "";
            for (char let : text.toCharArray()) {
                if (Character.isLetter(let) || let == ' ') {
                    result += let;
                }
            }
            return result;
        };
        System.out.println(sm2.getString(" Hello12345 world"));
    }
}
