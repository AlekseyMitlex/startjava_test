package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static char sign;

    public static double calculate(String mathExpression) {
        String[] splittedExpression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(splittedExpression[0]);
        sign = splittedExpression[1].charAt(0);
        secondNumber = Integer.parseInt(splittedExpression[2]);

        return switch (sign) {
            case '+' -> Math.addExact(firstNumber, secondNumber);
            case '-' -> Math.subtractExact(firstNumber, secondNumber);
            case '*' -> Math.multiplyExact(firstNumber, secondNumber);
            case '/' -> Math.floorDiv(firstNumber, secondNumber);
            case '%' -> Math.floorMod(firstNumber, secondNumber);
            case '^' -> Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.println("Не то нажал");
                yield 0;
            }
        };
    }
}