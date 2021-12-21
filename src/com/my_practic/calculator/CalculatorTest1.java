package com.my_practic.calculator;

import java.util.Scanner;

import static com.my_practic.calculator.Calculator1.calculator;

public class CalculatorTest1 {

    public static void main(String[] args) {
        String answerPlayer = "yes";
        Scanner scanner = new Scanner(System.in);

        while ("yes".equals(answerPlayer)) {

            System.out.println(calculator());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answerPlayer = scanner.nextLine();
            } while (!"yes".equals(answerPlayer) && !"no".equals(answerPlayer));
        }
    }
}
