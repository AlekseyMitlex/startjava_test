package lyamda.tsymbaliuk.lyamda.ex1;

// ФИ принимает стринг и на выходе стринг
// Лямда функция - анонимная функция реализующая функциональный интерфейс,
//      используются в том же контексте, что и ссылки на методы
@FunctionalInterface
public interface StringModificator {
    public String getString(String text);
}
