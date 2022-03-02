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
        // Local внутри метода/блока/конструктора класс
        // Не может быть static
        // Область видимости, только в блоке где находится.
        // Может обращаться к private элементам внешнего класса
        // - Может обращаться к элементам блока, в котором он написан
        //      при условии, что они final или effectively final
        // - Некоторые реализации за счёт этого уже не хипе, а в стеке находятся,
        //      поэтому реализация будет быстрее
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
