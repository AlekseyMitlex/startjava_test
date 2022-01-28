package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        ArrayList<Number> a1 = new ArrayList<>();

        info<String> info1 = new info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);

        generics.info<Integer> info2 = new info<>(100);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);
    }
}

class info<T> {

    private T value;

    public info(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue() {
        return value;
    }

}