package lyamda.tregulov.function.supplier_consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

// interface Supplier - возвращает объект типа Т
public class Car {

    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Our car is='" + model + '\'' +
                ", color oi='" + color + '\'' +
                ", and engine=" + engine +
                '}';
    }
}

class Test10 {

    // Метод который создаёт 3 машины
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    // Метод который меняет машину consumer.accept
    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = createThreeCars(() ->
                new Car("Nissan Tilda", "silver metalic", 1.6));
        System.out.println("ourCarSuppliers = " + ourCar);

        // 1-й способ Consumer с методом
        changeCar(ourCar.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updater car = " + car);
        });
        System.out.println("ourCar = " + ourCar);

        // 2-й Consumer без метода
        Consumer<Car> consumer = car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updater car = " + car);
        };
        consumer.accept(ourCar.get(0));
        System.out.println("ourCar = " + ourCar);

    }
}
