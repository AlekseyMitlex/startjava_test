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

/*     Static вложенный класс
     Из него (самого класса) видны:
    — статические свойства и методы OuterClassа (даже private).
    — статические свойства и методы родителя OuterClassа public и protected. То есть те, которые видны в OuterClassе.

    Из его экземпляра видны:
    — все (даже private) свойства и методы OuterClassа обычные и статические.
    — public и protected свойства и методы родителя OuterClassа обычные и статические. То есть те, которые видны в OuterClassе.

    Его видно:
    — согласно модификатору доступа.

    Может наследовать:
    — обычные классы.
    — такие же статические внутренние классы в OuterClassе и его предках.

    Может быть наследован:
    — любым классом:
    — вложенным
    — не вложенным
    — статическим
    — не статическим!

    Может имплементировать интерфейс

    Может содержать:
    — статические свойства и методы.
    — не статические свойства и методы.

    Экземпляр этого класса создаётся так:
    OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
*/
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