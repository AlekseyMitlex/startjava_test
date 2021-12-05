public class JaegerTest1 {

    public static void main(String[] args) {
        Jaeger1 jaegerOne = new Jaeger1("Striker Eureka", "Mark-5", "Australia", 76.20F, 1.85F, 10, 10, 9);

        System.out.println(jaegerOne.drift());
        jaegerOne.move();
        System.out.println(jaegerOne.block());
        jaegerOne.attack();

        System.out.println("Имя :" + jaegerOne.getModelName() + "\n" + "Модель: " + jaegerOne.getMark() + "\n"
                + "Производитель: " + jaegerOne.getOrigin() + "\n" + "Высота: " + jaegerOne.getHeight() + "\n"
                + "Вес: " + jaegerOne.getWeight() + "\n" + "Скорость: " + jaegerOne.getSpeed() + "\n" + "Сила: " + jaegerOne.getStrength() + "\n"
                + "Броня: " + jaegerOne.getArmor() + "\n");

        System.out.println("Второй робот: \n");

        Jaeger1 jaegerTwo = new Jaeger1("Crimson Typhoon", "Mark-4", "China", 76.20F,
        1.722F, 9, 8, 6);

        System.out.println(jaegerTwo.drift());
        jaegerTwo.move();
        System.out.println(jaegerTwo.block());
        jaegerTwo.attack();

        System.out.println("Имя :" + jaegerTwo.getModelName() + "\n" + "Модель: " + jaegerTwo.getMark() + "\n"
                + "Производитель: " + jaegerTwo.getOrigin() + "\n" + "Высота: " + jaegerTwo.getHeight() + "\n"
                + "Вес: " + jaegerTwo.getWeight() + "\n" + "Скорость: " + jaegerTwo.getSpeed() + "\n" + "Сила: " + jaegerTwo.getStrength() + "\n"
                + "Броня: " + jaegerTwo.getArmor() + "\n");
    }
}