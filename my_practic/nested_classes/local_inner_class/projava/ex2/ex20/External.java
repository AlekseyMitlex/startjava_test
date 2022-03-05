package nested_classes.local_inner_class.projava.ex2.ex20;

interface GetLocalClass {
    String getLocalStr();
}

public class External {

    GetLocalClass getLocal(final String str) {

        class Local implements GetLocalClass {
            public String getLocalStr() {
                return str;
            }
        }

        System.out.println("Метод getLocal() отработал.");
        return new Local();
    }
}