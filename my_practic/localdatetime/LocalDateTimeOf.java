package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeOf {

    public static void main(String[] args) {
        // Дата и время меняется с помощью метода of();
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2014, Month.MAY, 15);
        System.out.println(ld2);

        // Часы/минуты/сек/наноСек меняется с помощью метода of();
        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(15, 30, 45);
        LocalTime lt3 = LocalTime.of(15, 30, 45, 26);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);

        // год/месяц/день и часы/минуты/сек/наноСек и минуты меняется с помощью метода of();
        LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 10, 17, 25);
        LocalDateTime ldt2 = LocalDateTime.of(2015, Month.SEPTEMBER, 10, 17, 25, 45);
        LocalDateTime ldt3 = LocalDateTime.of(2015, Month.JANUARY, 10, 17, 25, 45, 34);
        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt1);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);

    }
}
