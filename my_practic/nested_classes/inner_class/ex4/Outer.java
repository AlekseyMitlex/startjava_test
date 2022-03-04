package nested_classes.inner_class.ex4;

public class Outer {

    private String outstr = "Outer";
    private String str = "strOuter00";

    class Inner01 extends Outer {

        private String strInn01 = "strInn01";
        private String str = "strInner01";

        String getOutStr() {
            return outstr;
        }

        void printStr() {
            System.out.println("Inner01>" + str);
            System.out.println("Inner01>" + Inner01.super.str);
        }

        class Inner02 extends Outer.Inner01 {

//            public Inner02() {
//                this(new Outer().new Inner01());
//            }

            public Inner02(Outer.Inner01 o) {
                o.super();
            }

            private String str = "strInner02";

            String getOutStr() {
                return outstr;
            }

            String getStrInn01() {
                return strInn01;
            }

            void printStr() {
                System.out.println("Inner02>" + str);
                System.out.println("Inner02>" + Inner02.super.str);
            }
        }
    }

    void printStr() {
        System.out.println(str);
    }

}

