package lyamda.tsymbaliuk.ex4_obobshenii_functuion_interface;

// Наоборот - в качестве реализации используется ссылка на обобщенный метод
public class Gen {

    // Обобщенный метод - Метод который вернет ссылку параметрического типа Т,
    //      который в качестве параметра получает эту ссылку
    public <T> T nextElement(T current) {
        return current;
    }
}
