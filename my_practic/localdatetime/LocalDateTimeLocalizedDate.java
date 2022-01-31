package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeLocalizedDate {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, Month.SEPTEMBER, 1);
        java.time.LocalDateTime ldt = LocalDateTime.of(2014, Month.SEPTEMBER, 1, 16, 40);

        // LocalizedDate
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld);
        System.out.println(ld.format(shortFormat));
        System.out.println(ldt);
        System.out.println(ldt.format(shortFormat));

        // Only LocalDateTime
        DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(ldt);
        System.out.println(ldt.format(shortFormat1));

        // Писать можно и так
        System.out.println(shortFormat1.format(ldt));
    }
}
