package nested_classes.local_inner_class;

public class LocalInner2 {

    public static void main(String[] args) {
        Math1 math1 = new Math1();
        math1.getResult(21, 4);
    }
}

class Math1 {

    private int a = 10;

    public void getResult(int delimoe, int delitel) {
        // Можно сократить код
        class Delenie {

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        System.out.println("delenie.getDelimoe() = " + delimoe);
        System.out.println("delenie.getDelitel() = " + delitel);
        System.out.println("delenie.getChastnoe() = " + delenie.getChastnoe());
        System.out.println("delenie.getOstatok() = " + delenie.getOstatok());
    }
}
