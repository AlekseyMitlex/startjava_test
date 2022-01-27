package baseJava_lessons.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeOfPattern {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.SEPTEMBER, 1);
        java.time.LocalDateTime ldt = LocalDateTime.of(2014, Month.SEPTEMBER, 1, 16, 40);

        // ofPattern Построй свою ДАТУ
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
    }
}