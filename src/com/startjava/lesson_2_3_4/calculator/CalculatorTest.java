package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String playerAnswer = "yes";

        while ("yes".equals(playerAnswer)) {
            System.out.print("Введите математическое выражение(пример 9 * 10 через пробел): ");
            Scanner scanner = new Scanner(System.in);
            String mathExpression = scanner.nextLine();
            System.out.println(Calculator.calculate(mathExpression));

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                playerAnswer = scanner.nextLine();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}

