package localdatetime;

import java.time.LocalDateTime;
import java.time.*;

public class LocalDateTimeDuration {

    public static void main(String[] args) {

        // Duration Работает только с LocalTime и LocaDateTime месяц+ через Period
        // Дни/час/минута/секунда/милиСек/наноСек
        LocalDateTime nahcalo = LocalDateTime.of(2014, Month.SEPTEMBER, 1, 16, 40);
        Period p = Period.ofMonths(3);
        LocalTime lt = LocalTime.of(10, 30);
        Duration d = Duration.ofMinutes(3);
        System.out.println(nahcalo.plus(d).plus(p));

    }
}
