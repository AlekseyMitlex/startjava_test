import java.util.ArrayList;
import java.util.List;

public class Person {

    public static double sum(List<Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(5);
        list.add(10.5);
    }
}