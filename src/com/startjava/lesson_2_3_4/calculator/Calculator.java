package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static private int firstNumber;
    static private int secondNumber;
    static private char sign;

    static public void input(String[] numbers) {

        firstNumber = Integer.parseInt(numbers[0]);
        sign = numbers[1].charAt(0);
        secondNumber = Integer.parseInt(numbers[2]);
    }

    static public double calculator() {
        double result = 0;
        switch (sign) {
            case '+' -> {
                result = Math.addExact(firstNumber, secondNumber);
            }
            case '-' -> {
                result = Math.subtractExact(firstNumber, secondNumber);
            }
            case '*' -> {
                result = Math.multiplyExact(firstNumber, secondNumber);
            }
            case '/' -> {
                result = Math.floorDiv(firstNumber, secondNumber);
            }
            case '%' -> {
                result = Math.floorMod(firstNumber, secondNumber);
            }
            case '^' -> {
                result = Math.pow(firstNumber, firstNumber);
            }
            default -> System.out.println("Не то нажал");
        }
        return result;
    }
}