package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeIsBeforeIsAfter {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        LocalDate ld2 = LocalDate.of(2012, Month.JUNE, 15);

        // isBefore/isAfter сравнение до или после, boolean(true/false0)
        System.out.println(ld1.isBefore(ld2));

        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(23, 30);
        System.out.println(ld1.isBefore(ld2));

        java.time.LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 10, 17, 25);
        java.time.LocalDateTime ldt2 = LocalDateTime.of(2017, 9, 10, 17, 25);
        System.out.println(ldt1.isAfter(ldt2));

    }
}
