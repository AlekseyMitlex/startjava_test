package HashMap.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");
        System.out.println(passportsAndNames);

        // Запрос значение только по ключу
        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);

        // Удаление всего элемента только по ключу
        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

        // Проверка на присутствие элемента в HashMap по ключу
        System.out.println(passportsAndNames.containsKey(11111));
        // Проверка на присутствие элемента в HashMap по значению
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));

        // TODO : Получение списка всех ключей и значений keySet() и values()
        // Вывод всех ключей
        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);
        // Вывод всех значений
        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

        // TODO : Получение списка количества ключей и чистка значений size() и clear()
        // Вывод всех количества ключей
        System.out.println(passportsAndNames.size());
        // Чистка значений
        passportsAndNames.clear();
        System.out.println(passportsAndNames + "\n");

        // TODO : Создание заново ************
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");
        System.out.println(passportsAndNames + "\n" + "************");

        // TODO : Eсть ли в HashMap хотя бы один элемент isEmpty()
        if (!passportsAndNames.isEmpty()) {
            System.out.println("passportsAndNames = " + passportsAndNames);
        }

        // TODO : Объединение двух мап в одну putAll()
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportsAndNames2.put(925648, "Максим Олегович Архаров");

        System.out.println(passportsAndNames);
        System.out.println(passportsAndNames2);
        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);

        // TODO : перебор HashMap в цикле Map.Entry entrySet()
        System.out.println("\n" + "Перебор HashMap в цикле Map.Entry entrySet()");
        for (Map.Entry entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }
    }
}
