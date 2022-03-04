package nested_classes.inner_class.ex2;

public class Outer {
    private String outerStr = "Outer";

    Outer() {
    }

    Outer(String str) {
        outerStr = str;
    }

    void printInnerStr(Outer.Inner inn) {
// строка ниже выдаст ошибку компиялции
//		println("Print from Outer innerStr = " + Inner.innerStr);
        System.out.println("Print from Outer innerStr = " + inn.innerStr);
    }

    class Inner {

        private String innerStr = "Inner";

        Inner() {
        }

        Inner(String str) {
            innerStr = str;
        }

        void printOterStr() {
            System.out.println("Print from Inner outerStr = " + outerStr);
        }
    }
}