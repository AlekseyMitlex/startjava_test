package nested_classes.inner_class.ex4;

public class Main {

    public static void main(String[] args) {
        // Примеры наследования внутренних классов и операторов new и super
        Outer out = new Outer();
        Outer.Inner01 in01 = out.new Inner01();

        Outer.Inner01.Inner02 in02 = in01.new Inner02(in01);
        Outer.Inner01.Inner02 in021 = new Outer().new Inner01().new Inner02(new Outer().new Inner01());

        System.out.println(in01.getOutStr());
        System.out.println(in02.getOutStr());
        System.out.println(in02.getStrInn01());
        in01.printStr();
        in02.printStr();
        System.out.println("---------");
        in021.printStr();

    }

}
