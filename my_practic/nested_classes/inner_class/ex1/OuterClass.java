package nested_classes.inner_class.ex1;

public class OuterClass {

    private int outInt = 10;

    class InnerClass {

        int innerInt;

        InnerClass() {
        }

        InnerClass(int i) {
            innerInt = i;
        }

        int getOutInt() {
            return outInt;
        }

        int getInnerInt() {
            return innerInt;
        }
    }

    InnerClass getInnerClass() {
        return new InnerClass();
    }

    InnerClass getInnerClass(int i) {
        return new InnerClass(i);
    }
}
