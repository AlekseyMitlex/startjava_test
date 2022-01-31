package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeplusMinus {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        // Immutable все даты и время
        System.out.println(ld1);

        // Метод плюс/минус дни
        ld1.plusDays(5);
        System.out.println(ld1);
        // Только так можно +5 дней создав нов объект ld2
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println(ld2);
        // Или так +30 дней создав новый объект ld1
        ld1 = ld1.plusDays(30);
        System.out.println(ld1);
        ld1 = ld1.minusDays(30);
        System.out.println(ld1);

        // Метод плюс/минус недели
        ld1 = ld1.minusWeeks(30);
        System.out.println(ld1);
        ld1 = ld1.plusWeeks(30);
        System.out.println(ld1);

        // Метод плюс/минус месяц
        ld1 = ld1.minusMonths(30);
        System.out.println(ld1);
        ld1 = ld1.plusMonths(30);
        System.out.println(ld1);

        // Метод плюс/минус год
        ld1 = ld1.minusYears(30);
        System.out.println(ld1);
        ld1 = ld1.plusYears(30);
        System.out.println(ld1);


        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);

        // Метод плюс/минус часы/минуты/секунды/наноСек
        lt1 = lt1.minusHours(30).minusMinutes(30).minusSeconds(30).minusNanos(30);
        System.out.println(lt1);
        lt1 = lt1.plusHours(30);
        System.out.println(lt1);

        lt1 = lt1.minusMinutes(30);
        System.out.println(lt1);
        lt1 = lt1.plusMinutes(30);
        System.out.println(lt1);

        lt1 = lt1.minusSeconds(30);
        System.out.println(lt1);
        lt1 = lt1.plusSeconds(30);
        System.out.println(lt1);

        lt1 = lt1.minusNanos(30);
        System.out.println(lt1);
        lt1 = lt1.plusNanos(30);
        System.out.println(lt1);

        // Имеет все такие же методы выше
        LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 10, 17, 25);
        System.out.println(ldt1);
    }
}

