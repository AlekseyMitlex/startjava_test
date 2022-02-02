package annotation.topjava_blog.suppress_warnings;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child instance = new Child();
        instance.display();
    }
}
