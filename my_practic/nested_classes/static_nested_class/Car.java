package nested_classes.static_nested_class;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    static private int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    // Static класс - как обычный внешний класс, можно:
    // - Создать объект(engine) без создания(car) и делать с ним что угодно
    // - final и не иметь наследников
    // - extends Z наследовать классы, так и быть родителем
    // - static элементы и обычные
    // - static private имеют доступ к переменным внешнего класса
    public static class Engine {

        int hoursePower;
        static int countOfObjects;

        public Engine(int hoursePower) {
            // Можем обратиться к "a" т.к. static private
            System.out.println(a);
//            System.out.println(doorCount);
            this.hoursePower = hoursePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hoursePower=" + hoursePower +
                    ", countOfObjects: " + countOfObjects +
                    '}';
        }
    }
}

class CarTest {

    public static void main(String[] args) {
        // Так можно обращаться к NestedClass
        Car.Engine engine = new Car.Engine(256);
        System.out.println("engine = " + engine);

        Car car = new Car("red", 2, engine);
        System.out.println("car = " + car);
    }
}

class Z extends Car.Engine {

    public Z() {
        super(200);
    }
}