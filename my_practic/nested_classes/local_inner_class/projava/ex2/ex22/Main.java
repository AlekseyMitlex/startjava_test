package nested_classes.local_inner_class.projava.ex2.ex22;

public class Main {

    public static void main(String[] args) {
        GetLocalClass lc = new External().getLocal("test");
        System.out.println(lc.getLocalStr());
        System.out.println(lc.getStr());
    }
}
