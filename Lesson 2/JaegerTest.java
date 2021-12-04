public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("Australia");
        jaegerOne.setHeight(76.20F);
        jaegerOne.setWeight(1.85F);
        jaegerOne.setSpeed(10);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(9);

        System.out.println(jaegerOne.drift());
        jaegerOne.move();
        System.out.println(jaegerOne.block());
        jaegerOne.attack();

        System.out.println("Имя :" + jaegerOne.getModelName() + "\n" + "Модель: " + jaegerOne.getMark() + "\n"
                + "Производитель: " + jaegerOne.getOrigin() + "\n" + "Высота: " + jaegerOne.getHeight() + "\n"
                + "Вес: " + jaegerOne.getWeight() + "\n" + "Скорость: " + jaegerOne.getSpeed() + "\n" + "Сила: " + jaegerOne.getStrength() + "\n"
                + "Броня: " + jaegerOne.getArmor() + "\n");

        System.out.println("Второй робот: \n");

        Jaeger jaegerTwo = new Jaeger();

        jaegerTwo.setModelName("Crimson Typhoon");
        jaegerTwo.setMark("Mark-4");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setHeight(76.20F);
        jaegerTwo.setWeight(1.722F);
        jaegerTwo.setSpeed(9);
        jaegerTwo.setStrength(8);
        jaegerTwo.setArmor(6);

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