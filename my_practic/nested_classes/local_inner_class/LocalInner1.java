package nested_classes.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {

    private int a = 10;

    public void getResult() {
/*         Local внутри метода/блока/конструктора класс Из него видны:
        — все (даже private) свойства и методы OuterClassа обычные и статические.
        — public и protected свойства и методы родителя OuterClassа обычные и статические. То есть те, которые видны в OuterClassе.

        Его видно:
        — только в том методе где он определён.

        Может наследовать:
        — обычные классы.
        — внутренние классы в OuterClassе и его предках.
        — такие же локальные классы определённые в том же методе.

        Может быть наследован:
        — таким же локальным классом определённом в том же методе.

        Может имплементировать интерфейс

        Может содержать:
        — только обычные свойства и методы (не статические).
*/
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                // Видна private а внутри Local
                System.out.println("a = " + a);
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("delenie.getDelimoe() = " + delenie.getDelimoe());
        System.out.println("delenie.getDelitel() = " + delenie.getDelitel());
        System.out.println("delenie.getChastnoe() = " + delenie.getChastnoe());
        System.out.println("delenie.getOstatok() = " + delenie.getOstatok());
    }
}
