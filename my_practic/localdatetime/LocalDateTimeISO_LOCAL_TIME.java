package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeISO_LOCAL_TIME {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2014, Month.SEPTEMBER, 1, 16, 40);
        LocalTime lt = LocalTime.of(16, 40);

        // DateTimeFormatter ISO_LOCAL_DATE for LocalDate
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d1));
        // DateTimeFormatter ISO_LOCAL_TIME for LocalDateTime
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt);
        System.out.println(lt.format(d2));
        // DateTimeFormatter ISO_LOCAL_DATE_TIME for LocalDateTime
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(d3));

        // Редкий формат, количество недель
        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d4));
    }
}
