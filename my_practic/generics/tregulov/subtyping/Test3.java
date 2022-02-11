package generics.tregulov.subtyping;

public class Test3 {

    public static void main(String[] args) {
//        ArrayList<Number> a1 = new ArrayList<>();

        info<String> info1 = new info<>("privet");
        System.out.println("info1 = " + info1);
        String s = info1.getValue();
        System.out.println("s = " + s);

        info<Integer> info2 = new info<>(100);
        System.out.println("info2 = " + info2);

        Integer i = info2.getValue();
        System.out.println("i = " + i);

        info<Bus> info3 = new info<>(new Bus());
        System.out.println("info3 = " + info3);
        Bus sBus = info3.getValue();
        System.out.println("info3.getValue() = " + info3.getValue());
    }
}

// TODO : Способо ограничитть дженерик T с помощью Number только числами
// так же может имплементировать интерфейсы
//class info<T extends Numbe & I1 & I2r> {
class info<T> {

    private final T value;

    public info(T value) {
        this.value = value;
    }

    // Parametrizovannii Method
    public <V> V abc(V val) {
        return val;
    }

    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue() {
        return value;
    }
}

class Bus {
}

interface I1 {
}

interface I2 {
}
