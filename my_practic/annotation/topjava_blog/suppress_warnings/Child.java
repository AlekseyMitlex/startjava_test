package annotation.topjava_blog.suppress_warnings;

public class Child extends Parent {

    @Override
    @Deprecated(since = "1.2", forRemoval = true)
    public void display() {
        System.out.println("Выполнился метод из класса-наследника");
    }
}
