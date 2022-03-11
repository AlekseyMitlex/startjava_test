package lyamda.tsymbaliuk.lyamda.ex2_dostup;

// Static лямда имеет доступ static полям и методам
public class MathUtilite {

    private static int[] arr = new int[]{1, 2, 3};

    private static Summator summator = () -> getSum(arr);

    public static void setArr(int[] arr) {
        MathUtilite.arr = arr;
    }

    public static Summator getSummator() {
        return summator;
    }

    public static int getSum(int[] array) {
        int summa = 0;
        for (int element : array) {
            summa += element;
        }
        return summa;
    }
}
