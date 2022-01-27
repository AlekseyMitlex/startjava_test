package baseJava_lessons.localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateTimePeriod {

    // Period класс, день/месяц/недели/года
    static void smenadejurnogo(LocalDate nahcalo, LocalDate konec, Period P) {
        LocalDate data = nahcalo;
        while (data.isBefore(konec)) {
            System.out.println("Nastupila data " + data + ". Pora menyat dejutnogo");
            data = data.plus(P);
        }
    }

    public static void main(String[] args) {
        LocalDate nahcalo = LocalDate.of(2014, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2017, Month.MAY, 31);
        // Raznii year/month/day/week
        Period P = Period.ofMonths(2);
        smenadejurnogo(nahcalo, konec, P);

        // Konkretnaya date
        System.out.println("DATE");
        Period P1 = Period.of(1, 2, 3);
        smenadejurnogo(nahcalo, konec, P1);

    }
}
