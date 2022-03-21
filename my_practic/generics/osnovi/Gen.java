package generics.osnovi;

public class Gen<T> {

    // объявление объекта типа T
    T ob;

    // Передать конструктору ссылку на объект типа T
    Gen(T o) {
        ob = o;
    }

    // Вернуть ob
    T getob() {
        return ob;
    }

    // Показать тип T
    void showType() {
        System.out.println("Тип T: " + ob.getClass().getName());
    }

    public static void main(String[] args) {
        // Код для кнопки
        // Работаем с обобщённым классом
        // Создаём Gen-ссылку для Integer
        // Создаём объект Gen<Integer>
        Gen<Integer> integerGen = new Gen<>(77);

        // Показать тип данных, используемый iOb
        integerGen.showType();

        // Получить значение iOb
        int value = integerGen.getob();
        System.out.println("Значение " + value);

        // Создадим объект Gen для String
        Gen<String> stringGen = new Gen<>("Обобщённый текст");

        // Показать тип данных, используемый strOb
        stringGen.showType();

        // Получить значение strOb
        String str = stringGen.getob();
        System.out.println("Значение: " + str);
    }
}