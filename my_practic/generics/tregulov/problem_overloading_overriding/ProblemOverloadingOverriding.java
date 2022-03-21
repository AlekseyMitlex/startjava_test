package generics.tregulov.problem_overloading_overriding;

public class ProblemOverloadingOverriding {
    public static void main(String[] args) {
//        ArrayList<Number> a1 = new ArrayList<>();

        info1<String> info3 = new info1<>("privet");
        System.out.println(info3);
        String s = info3.getValue();
        System.out.println(s);

        info1<Integer> info4 = new info1<>(100);
        System.out.println(info4);
        Integer i = info4.getValue();
        System.out.println(i);
    }

    // JVM не видит <String> и <Integer> у Overloading methods
    // существует такая проблема у Overloading methods
//    public void abc(info1<String> info1) {
//        String j = info1.getValue();
//    }
//
//    public void abc(info1<Integer> info1) {
//        Integer k = info1.getValue();
//    }
}

class info1<T> {

    private T value;

    public info1(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue() {
        return value;
    }

}

class Parent {

    public void abc(info1<String> info1) {
        String j = info1.getValue();
    }
}

class Child extends Parent {

    // JVM не видит <String> и <Integer> у  Overriding methods
    // существует такая проблема у  Overriding methods
//    public void abc(info1<Integer> info1) {
//        Integer k = info1.getValue();
//    }
}