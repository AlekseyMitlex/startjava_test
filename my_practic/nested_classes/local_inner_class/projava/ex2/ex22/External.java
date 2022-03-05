package nested_classes.local_inner_class.projava.ex2.ex22;

interface GetLocalClass {
    String getLocalStr();

    String getStr();
}

class Ext {
    String str = "Ext";
}

public class External {
    String str = "External";

    GetLocalClass getLocal(final String argstr) {

        class Local extends Ext implements GetLocalClass {
            String str = "Local";

            public String getLocalStr() {
                return argstr;
            }

            public String getStr() {
                return str + " "
                        + External.this.str
                        + " " + super.str;
            }
        }

        System.out.println("Метод getLocal() отработал.");
        return new Local();
    }

}
