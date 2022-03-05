package nested_classes.anonymous_class.projava.ex1;

interface Iout {
    void justPrint();
}

class External {

    String str = "External";

    void extPrint() {
        System.out.println("ExtPrint");
    }
}

class Outer {

    void outPrint() {
        Iout iout = new Iout() {
            public void justPrint() {
                System.out.println("Just Print!");
            }
        };
        iout.justPrint();
    }

    void extPrint() {
        External ext = new External() {
            String str = "Anonymous";

            void extPrint() {
                System.out.println("AnonymPrint");
                super.extPrint();
                System.out.println("str = " + str);
                System.out.println("super.str = " + super.str);
            }
        };
        ext.extPrint();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outPrint();
        out.extPrint();
    }
}
