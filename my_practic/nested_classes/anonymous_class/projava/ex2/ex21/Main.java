package nested_classes.anonymous_class.projava.ex2.ex21;

public class Main {

    public static void main(String[] args) {
        Base b = new Base("Base1");
        Base a1 = b.getAnonBase("Anon b a1");
        System.out.println("b.getThis = " + b.getThis());
        System.out.println("a1.getThis = " + a1.getThis());
        System.out.println("-------");
        External e = new External();
        System.out.println("e.getThis = " + e.getThis());
        System.out.println("-------");
        Base a2 = e.getAnonBase("Anon e a2");
        System.out.println("a2.getThis = " + a2.getThis());
    }
}
