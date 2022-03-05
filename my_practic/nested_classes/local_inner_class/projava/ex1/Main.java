package nested_classes.local_inner_class.projava.ex1;

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.printInner("ARGUMENT");
    }
}