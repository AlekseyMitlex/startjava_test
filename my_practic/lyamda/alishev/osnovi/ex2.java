package lyamda.alishev.osnovi;

interface Executable1 {
    int execute(int x, int y);
}

//  Класс с методом run, который ждет в качестве аргументов реализацию какую то с интерфейсом Executable
class Runner1 {
    public void run(Executable1 e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class ex2 {

    public static void main(String[] args) {
        Runner1 runner = new Runner1();

        runner.run(new Executable1() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello");
                System.out.println("Goodbye");
                return x + y;
            }
        });

        // Скобки {} в лямда, если несколько параметров
        // Просто параметр x, java подгружает из Executable1 int
        // (x) нужны скобки, когда используются несколько аргументов
        // Можно добавить внешнюю переменную, но она должна быть final или НепомнюКак final
        // Лямда возможно, если только 1 абстрактный метод в интерфейсе, иначе аноним класс делать
        // У анонимного класса есть области своей видимости, а у лямда нет, поэтому лямда видит дальше

        int a = 10;
        runner.run((x, y) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return x + y + a;
        });
    }

}


