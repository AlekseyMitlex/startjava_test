package nested_classes.inner_class.ex5;

public class Main {

    public static void main(String[] args) {

        Outer out = new Outer();
        System.out.println("out.this - > " + out.getThis());
        Outer.Inner1 in1 = out.new Inner1();

        System.out.println("in1.this - > " + in1.getThis());
        System.out.println("in1.OuterThis - > " + in1.getOuterThis());
        System.out.println("in1.getStrInner1 - > " + in1.getStrInner1());
        System.out.println("in1.getStrOuter  - > " + in1.getStrOuter());
    }
}
