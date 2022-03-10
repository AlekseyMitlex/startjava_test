package lyamda.tsymbaliuk.ex2_ssilkinametodi;

// Функциональный интерфейс - пример с одним нереализованным методом с
//      int значением, параметров у которого нет
@FunctionalInterface
public interface Generator {

    public int getNextElement();
}
