package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.Calculator.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        String playerAnswer = "yes";

        Scanner scanner = new Scanner(System.in);

        while ("yes".equals(playerAnswer)) {

            System.out.println(calculator());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                playerAnswer = scanner.nextLine();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}

