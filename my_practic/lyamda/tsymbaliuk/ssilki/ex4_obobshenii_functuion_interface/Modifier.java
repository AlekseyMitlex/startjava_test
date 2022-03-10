package lyamda.tsymbaliuk.ssilki.ex4_obobshenii_functuion_interface;

import java.io.IOException;

// Функциональный интерфейс(ФИ) обобщенный
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

// ФИ обобщенный - сохраняет куда-то объект, который прийдёт в качестве параметра
// нужно указать проверяемое исключение throws IOException
@FunctionalInterface
interface Saver<T> {
    public void saveTo(T element) throws IOException;
}


