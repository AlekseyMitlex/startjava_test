package nested_classes.anonymous_class.projava.ex2.ex21;

public class Base {
    private String str = "Base";

    Base(String str) {
        System.out.println("Base constructor, str= " + str);
        System.out.println("Base constructor, this.str= " + this.str);
    }

    Object getThis() {
        return this;
    }

    String getStr() {
        return str;
    }

    Base getAnonBase(String str) {
        return new Base(str) {
            {
                System.out.println("Инициализатор анонимного класса");
                System.out.println("str = " + str);
                System.out.println("Base.this.str = " + Base.this.str + '\n');
            }
        };
    }
}

class External {
    private String str = "External";

    Object getThis() {
        return this;
    }

    Base getAnonBase(String str) {
        return new Base(str) {
            {
                System.out.println("Инициализатор анонимного класса");
                System.out.println("str = " + str);
                System.out.println("External.this.str = " + External.this.str);
                System.out.println("Base str = " + getStr() + '\n');
            }
        };
    }
}

