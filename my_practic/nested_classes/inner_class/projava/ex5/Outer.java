package nested_classes.inner_class.projava.ex5;

public class Outer {

    private String str = "Outer";

    Object getThis() {
        return this;
    }

    class Inner1 extends Outer {

        private String str = "Inner1";

        Object getOuterThis() {
            return Outer.this.getThis();
        }

        String getStrInner1() {
            return str;
        }

        String getStrOuter() {
            return Outer.this.str;
        }
    }

}
