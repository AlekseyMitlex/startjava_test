package com.my_practic.calculator;

import java.util.Scanner;

public class Calculator1 {

    static private int firstNumber;
    static private int secondNumber;
    static private char sign;

    static public double calculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическое выражение(пример 9 * 10), состоящее из целых положительных чисел через пробел: ");

        do {
            String calc = scanner.nextLine();
            String[] numbers = calc.split(" ");
            firstNumber = Integer.parseInt(numbers[0]);
            sign = numbers[1].charAt(0);
            secondNumber = Integer.parseInt(numbers[2]);
        }while (firstNumber < 0 & secondNumber < 0);


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