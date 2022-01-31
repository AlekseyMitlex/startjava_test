package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeParse {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2014, Month.SEPTEMBER, 1, 16, 40);
        LocalTime lt = LocalTime.of(16, 40);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", f);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2);

    }
}