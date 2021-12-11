package com.startjava.lesson_2_3.person;

public class  Person {
    
    String  pol = "Man";
    String name = "Ivan";
    float height = 1.80F;
    float weight = 85F;
    byte age = 27;

    void move() {
        System.out.println("moving");
    }

    boolean isSit() {
        return true;
    }

    boolean isRun() {
        return false;
    }

    String tell() {
        return "Helo";
    }

    boolean isLearnJava() {
        return true;
    }
}