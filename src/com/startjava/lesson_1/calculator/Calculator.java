package com.startjava.lesson_1.calculator;

public class Calculator {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        char sign = '^'; // (+, -, *, /, ^, %) Подставляем знаки

        int result;

        if (sign == '+') {
            result = a + b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '-') {
            result = a - b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '*') {
            result = a * b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '/') {
            result = a / b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '%') {
            result = a % b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '^') {
            if (b == 0) {
                System.out.println(1);
            }
            int degree = 1;
            for (int i = 0; i < b ; i++) {
                degree = degree * a;
            }
            System.out.println("При использовании ^ :" + degree);
        }
    }
}