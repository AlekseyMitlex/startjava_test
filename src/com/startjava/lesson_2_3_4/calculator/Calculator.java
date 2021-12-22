package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static char sign;

    public static double calculate(String mathExpression) {
        String[] numbers = mathExpression.split(" ");
        firstNumber = Integer.parseInt(numbers[0]);
        sign = numbers[1].charAt(0);
        secondNumber = Integer.parseInt(numbers[2]);

        return switch (sign) {
            case '+' -> Math.addExact(firstNumber, secondNumber);
            case '-' -> Math.subtractExact(firstNumber, secondNumber);
            case '*' -> Math.multiplyExact(firstNumber, secondNumber);
            case '/' -> Math.floorDiv(firstNumber, secondNumber);
            case '%' -> Math.floorMod(firstNumber, secondNumber);
            case '^' -> Math.pow(firstNumber, secondNumber);
            default -> 0;
        } ;
    }
}

//switch (sign) {
//        case '+' : return Math.addExact(firstNumber, secondNumber);
//        case '-' : return Math.subtractExact(firstNumber, secondNumber);
//        case '*' : return Math.multiplyExact(firstNumber, secondNumber);
//        case '/' : return Math.floorDiv(firstNumber, secondNumber);
//        case '%' : return Math.floorMod(firstNumber, secondNumber);
//        case '^' : return Math.pow(firstNumber, secondNumber);
//        }
//        return 0;

//switch (sign) {
//        case '+' -> result = Math.addExact(firstNumber, secondNumber);
//        case '-' -> result = Math.subtractExact(firstNumber, secondNumber);
//        case '*' -> result = Math.multiplyExact(firstNumber, secondNumber);
//        case '/' -> result = Math.floorDiv(firstNumber, secondNumber);
//        case '%' -> result = Math.floorMod(firstNumber, secondNumber);
//        case '^' -> result = Math.pow(firstNumber, secondNumber);
//default -> System.out.println("Не то нажал");
//        }
//        return result;