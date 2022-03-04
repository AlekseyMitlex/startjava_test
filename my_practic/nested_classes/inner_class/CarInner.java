package nested_classes.inner_class;

public class CarInner {

    String color;
    private int doorCount;
    Engine engine;

    // 1-й способ создать объект двигателя
//    public CarInner(String color, int doorCount, int hoursePower) {
//        this.color = color;
//        this.doorCount = doorCount;
//        // Используя кол-во л/с hoursePower создаём объект Inner`a
//        this.engine = this.new Engine(hoursePower);
//    }

    // 2-й способ создать объект двигателя
    public CarInner(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        // Можем обратиться к private hoursePower через создание объекта Inner
        Engine engine = new Engine(150);
        System.out.println("hoursePower = " + engine.hoursePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "CarInner{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

/*     Inner класс - всегда завязан на своём внешнем классе.
     Из него видны:
    — все (даже private) свойства и методы OuterClassа обычные и статические
    — public и protected свойства и методы родителя OuterClassа обычные и статические

     Его видно:
    — согласно модификатору доступа

     Может наследовать:
    — обычные классы
    — такие же внутренние классы в OuterClassе и его предках

     Может быть наследован:
    — таким же внутренним классом в OuterClassе и его наследниках

     Может имплементировать интерфейс

     Может содержать:
    — только обычные свойства и методы (не статические).

     Экзэмпляр этого класса создаётся так:
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
          Внешний класс может обращаться к private элементам
          inner class`a, прежде создав его объект
*/
    public class Engine {

        private int hoursePower;
        // БОЛЬШОЙ ВОПРОС - ПОЧЕМУ Static МОЖНО?
        public static int a = 5;


        public Engine(int hoursePower) {
            this.hoursePower = hoursePower;
            // Видна private переменная из внешнего класса
            System.out.println("doorCount = " + doorCount);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hoursePower=" + hoursePower +
                    '}';
        }
    }
}

class CarInnerTest {

    public static void main(String[] args) {
        CarInner car = new CarInner("black", 4);
        // 2-й способ создать объект двигателя.
        // new должно относиться к Engine, т.к. car уже создан
        CarInner.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println("car = " + car);
        System.out.println("engine = " + engine);

        // 3-й способ создать объект двигателя. Не распространенный вариант,
        // потому как теряется ссылка на car и непонятно какой машине принадлежит двигатель
        CarInner.Engine engine1 = new CarInner("yellow", 5).new Engine(97);
    }
}
