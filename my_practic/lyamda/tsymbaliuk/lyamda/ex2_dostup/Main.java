package lyamda.tsymbaliuk.lyamda.ex2_dostup;

public class Main {

    public static void main(String[] args) {
        SimpleClass a = new SimpleClass(new int[]{1, 2, 3});
        Summator sm = a.getSummatorInstance();
        System.out.println("sm.getSum() = " + sm.getSum());

        System.out.println("-------------------");

        // Можно не создавать новые значения массива, для показа как можно
        MathUtilite.setArr(new int[]{3, 4, 5});
        System.out.println(MathUtilite.getSummator().getSum());
    }
}
