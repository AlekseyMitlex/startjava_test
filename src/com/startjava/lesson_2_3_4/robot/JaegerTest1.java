package com.startjava.lesson_2_3_4.robot;

public class JaegerTest1 {

    public static void main(String[] args) {
        Jaeger1 strikerEureka = new Jaeger1("Striker Eureka", "Mark-5", "Australia", 76.20F, 1.85F,
        10, 10, 9);

        System.out.println(strikerEureka.drift());
        strikerEureka.move();
        System.out.println(strikerEureka.block());
        strikerEureka.attack();

        System.out.println(strikerEureka); // strikerEureka.toStrung(); Одно и тоже

        System.out.println("Второй робот: \n");

        Jaeger1 crimsonTyphoon = new Jaeger1("Crimson Typhoon", "Mark-4", "China", 76.20F,
        1.722F, 9, 8, 6);

        System.out.println(crimsonTyphoon.drift());
        crimsonTyphoon.move();
        System.out.println(crimsonTyphoon.block());
        crimsonTyphoon.attack();

        System.out.println(crimsonTyphoon); // strikerEureka.toStrung(); Одно и тоже
    }
}