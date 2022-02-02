package annotation.topjava_blog.suppress_warnings;

// TODO Данный пример не работает и не убирается зачеркивание
//  и не снимает желтый цвет
public class Parent {

    // Убирает желтые выделения Ideia, что не используется и т.д.
    @SuppressWarnings("unused")
    public void display() {
        System.out.println("Выполнился метод из родительского класса");
    }
}
