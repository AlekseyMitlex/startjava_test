package lyamda.tsymbaliuk.lyamda.ex2_dostup;

// Уровень доступа лямда
public class SimpleClass {
    // Есть прямой доступ к приватным полям из лямды(arr.length);
    //      ко всем методам
    // Если лмда объявлена в теле метода, то доступ к
    //      локальным переменным только final or effective-final
    private int[] arr;

    private Summator sm = () -> {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    };

    public SimpleClass(int[] arr) {
        super();
        this.arr = arr;
    }

    public Summator getSummatorInstance() {
        return this.sm;
    }
}
