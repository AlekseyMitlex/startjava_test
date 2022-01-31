package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeGet {

    public static void main(String[] args) {
        // getDayOfWeek/Month/Year
        LocalDate ld = LocalDate.of(2014, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2014, Month.SEPTEMBER, 1, 16, 40);
        // Узнать день недели по дате
        System.out.println(ldt.getDayOfWeek());
        // int, узнать день по дате в месяце
        System.out.println(ldt.getDayOfMonth());
        // int, узнать день по дате в году
        System.out.println(ldt.getDayOfYear());
        // узнать месяц по дате
        System.out.println(ldt.getMonth());
        // int, узнать месяц по дате в году
        System.out.println(ldt.getMonthValue());
        // int, узнать год
        System.out.println(ldt.getYear());
        // int, узнать Наносек по дате в году
        // нет секунд поэтому 0
        System.out.println(ldt.getNano());
        // int, узнать сек по дате в году
        // нет секунд поэтому 0
        System.out.println(ldt.getSecond());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getHour());

        // LocalDateTime те же методы, что и выше
    }
}
