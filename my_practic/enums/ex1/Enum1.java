package enums.ex1;

public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(Weekdays.FRIDAY);
        today.daysInfo();
    }
}

//TODO : Можно создать в отдельном файле или классе
enum Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
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
    }
}
