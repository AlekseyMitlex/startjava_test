package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static char sign;

    public static double calculate(String calc) {
        String[] numbers = calc.split(" ");
        firstNumber = Integer.parseInt(numbers[0]);
        sign = numbers[1].charAt(0);
        secondNumber = Integer.parseInt(numbers[2]);
        double result = 0;
        switch (sign) {
            case '+' -> result = Math.addExact(firstNumber, secondNumber);
            case '-' -> result = Math.subtractExact(firstNumber, secondNumber);
            case '*' -> result = Math.multiplyExact(firstNumber, secondNumber);
            case '/' -> result = Math.floorDiv(firstNumber, secondNumber);
            case '%' -> result = Math.floorMod(firstNumber, secondNumber);
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            default -> System.out.println("Не то нажал");
        }
        return result;
    }
}