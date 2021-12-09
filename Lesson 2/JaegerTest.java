public class JaegerTest {

    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();

        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.20F);
        strikerEureka.setWeight(1.85F);
        strikerEureka.setSpeed(10);
        strikerEureka.setStrength(10);
        strikerEureka.setArmor(9);

        System.out.println(strikerEureka.drift());
        strikerEureka.move();
        System.out.println(strikerEureka.block());
        strikerEureka.attack();

        System.out.println(strikerEureka); // strikerEureka.toStrung(); Одно и тоже

        System.out.println("Второй робот: \n");

        Jaeger crimsonTyphoon = new Jaeger();

        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.20F);
        crimsonTyphoon.setWeight(1.722F);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);

        System.out.println(crimsonTyphoon.drift());
        crimsonTyphoon.move();
        System.out.println(crimsonTyphoon.block());
        crimsonTyphoon.attack();

        System.out.println(crimsonTyphoon); // strikerEureka.toStrung(); Одно и тоже
        
    }
}