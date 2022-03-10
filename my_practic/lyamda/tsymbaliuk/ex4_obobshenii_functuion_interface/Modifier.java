package lyamda.tsymbaliuk.ex4_obobshenii_functuion_interface;


// Функциональный интерфейс обобщенный
// Возвращает ссылку T типа и на вход принимает ссылку тоже T типа
@FunctionalInterface
interface Modifier<T> {
    public T change(T obj);
}

// Наоборот - Функциональный интерфейс описывает метод,
//      который явно указывает все типы используемых данных,
//      такие как на вход Integer и выход integer
interface IntElementGenerator {
    public Integer next(Integer carrent);
}


