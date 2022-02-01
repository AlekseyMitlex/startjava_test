package enums.ex1;

import java.util.Arrays;

public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(Weekdays.FRIDAY);
        today.daysInfo();
        System.out.println("today.weekDay = " + today.weekDay);
        Weekdays w1 = Weekdays.FRIDAY;
        Weekdays w2 = Weekdays.FRIDAY;
        Weekdays w3 = Weekdays.FRIDAY;
        System.out.println(w1 == w3);
        // false - константы одинаковые, но разные типы(Weekdays и Weekdays2)
        System.out.println("Weekdays2.FRIDAY == Weekdays.FRIDAY = " + Weekdays2.FRIDAY.equals(Weekdays.FRIDAY));
        // valueOf позволяет вернуть enum из String значения ||
        // не понятно зачем он нужен, если ничего нельзя вернутиь кроме констант
        Weekdays w14 = Weekdays.valueOf("MONDAY");
        System.out.println("w14 = " + w14);
        //  values Возвращает массив констант, который принадлежит enum
        Weekdays[] array = Weekdays.values();
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }
}

// Можно создать в отдельном файле или классе
// В enum могут содержаться переменные/методы/конструкторы
enum Weekdays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    // Может быть только private - по дефолту
    Weekdays(String mood) {
        this.mood = mood;
    }
    // Можно без параметров и Weekdays убрать настроение
//    Weekdays() {
//    }

    public String getMethod() {
        return mood;
    }
}

enum Weekdays2 {
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();
}

class Today {
    Weekdays weekDay;

    public Today(Weekdays weekDays) {
        this.weekDay = weekDays;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Idi na rabotu");
            case SATURDAY, SUNDAY -> System.out.println("Otdihaem");
        }

        System.out.println("Nastroenie d etot den: " + weekDay.getMethod());
    }
}
