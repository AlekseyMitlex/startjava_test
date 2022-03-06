package lyamda.alishev.osnovi;

// Лямда не приносит что-то новое в Java, она помогает с кодом, сокращает его
// Скобки {} в лямда, если несколько параметров
// Просто параметр x, java подгружает из Executable1 int
// (x) нужны скобки, когда используются несколько аргументов
// Можно добавить внешнюю переменную, но она должна быть final или НепомнюКак final
// Лямда возможно, если только 1 абстрактный метод в интерфейсе, иначе аноним класс делать
// У анонимного класса есть области своей видимости, а у лямда нет, поэтому лямда видит дальше
/*
        Лямду можно записывать в переменную:
        Comparator<String> comparator = (s1, s2) -> {
        if (s1.length() > s2.length()) return 1;
        else if (s1.length() < s2.length()) return -1;
        else return 0;
        };
*/

// 3 варианта реализации одного и тоже и 1 из них Лямда

// Есть интерфейс м в нем метод, который нужно реализовать
interface Executable {
    void execute();
}

//  Класс с методом run, который ждет в качестве аргументов реализацию какую то с интерфейсом Executable
class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

// Создаём класс и имплементируем Executable, реализуем логику метода
class ExecutableImplementation implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class ex1 {

    public static void main(String[] args) {
        Runner runner = new Runner();
        // Так вот в качестве аргументов необходимо передать реализацию интерфейса Executable
        // Итак ... 3 способа
        // 1-й. Создать класс, который имплементирует Executable и его объект передать в аргумент
        runner.run(new ExecutableImplementation());

        // 2-й. Используем анонимный класс, без реализации класса ExecutableImplementation
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        // 3-й способ, только лямда, без реализации дополнительных классов
        runner.run(() -> System.out.println("Hello"));
    }

}
