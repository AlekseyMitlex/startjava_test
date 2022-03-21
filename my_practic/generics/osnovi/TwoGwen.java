package generics.osnovi;

class TwoGen<T, V> {

    T ob1;
    V ob2;

    // Передать конструктору ссылки на объекты двух типов
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }

    public static void main(String[] args) {

        // Используем созданный класс
        TwoGen<Integer, String> twogenObj = new TwoGen<>(78, "Обобщённый текст2");

        // Узнаем типы
        twogenObj.showTypes();

        // Узнаем значения
        int value = twogenObj.getob1();
        System.out.println("Значение: " + value);

        String str = twogenObj.getob2();
        System.out.println("Значение: " + str);
    }
}