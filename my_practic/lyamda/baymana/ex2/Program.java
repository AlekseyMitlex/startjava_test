package lyamda.baymana.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));


        // 1-й вариант. Среднее арифметическое классическим способом
        int summa = 0;
        double aAdultPersons = 0;
        for (Person p : persons) {
            if (p.getAge() >= 18) {
                summa += p.getAge();
                aAdultPersons++;
            }
        }
        double averageAge = summa / aAdultPersons;
        System.out.println(averageAge);

        // 2-й вариант
        double averageAge2 = persons.stream()
                .filter(p -> p.getAge() >= 18)
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("averageAge2 = " + averageAge2);


//        for (Person p : persons) {
//            System.out.println(p);
//        }

//        persons.stream().forEach(p -> System.out.println(p));
        persons.stream()
                .filter(p -> p.getAge() >= 18) // Только совершеннолетних выводит
                .sorted(Comparator.comparing(Person::getName)) // Сортировка по длине имени
                .map(Person::getName) // Выводит только имена(стринги)
                .forEach(System.out::println); // Итерирование по коллекции


    }
}
