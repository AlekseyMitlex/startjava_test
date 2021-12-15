package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {

    static private int firstNumber;
    static private int secondNumber;
    static private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    static public void calculator() {
        switch (sign) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            case '^':
                pow();
                break;
            default:
                System.out.println("Жил-был программист и было у него два сына - Антон и Неантон");
        }
    }

    private static void pow() {
        int degree = 1;
        while (secondNumber > 0) {
            degree *= firstNumber;
            secondNumber--;
        }
        System.out.println(degree);
    }
}