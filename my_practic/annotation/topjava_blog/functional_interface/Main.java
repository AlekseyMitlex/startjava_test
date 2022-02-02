package annotation.topjava_blog.functional_interface;

public class Main implements MyFunctionalInterface {

    // TODO Данный пример не работает и не убирается зачеркивание
    // что делает аннотация не понятно


    public static void main(String[] args) {
        Main main = new Main();
        main.abstractMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Это сообщение из abstractMethod()");
    }
}
