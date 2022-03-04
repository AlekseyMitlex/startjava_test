package nested_classes.inner_class.ex2;

public class Main {

    public static void main(String[] args) {
        Outer out1 = new Outer("Outer1");

        Outer.Inner inn1_1 = out1.new Inner("Inner1-1");
        Outer.Inner inn1_2 = out1.new Inner("Inner1-2");

        out1.printInnerStr(inn1_1);
        out1.printInnerStr(inn1_2);

        inn1_1.printOterStr();
        inn1_2.printOterStr();
    }
}
