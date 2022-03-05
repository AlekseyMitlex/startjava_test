package nested_classes.inner_class.projava.ex1;

//http://pr0java.blogspot.com/2015/08/4.html
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
