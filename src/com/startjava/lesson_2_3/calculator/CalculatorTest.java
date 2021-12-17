package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

import static com.my_practic.calculator.Calculator1.calculator;
import static com.startjava.lesson_2_3.calculator.Calculator.input;

public class CalculatorTest {

    public static void main(String[] args) {
        String answerPlayer = "yes";

        while ("yes".equals(answerPlayer)) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите математическое выражение(пример 9 * 10 через пробел): ");
            String calc = scanner.nextLine();
            String[] numbers = calc.split(" ");

            input(numbers);
            System.out.println(calculator());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answerPlayer = scanner.nextLine();
            } while (!"yes".equals(answerPlayer) && !"no".equals(answerPlayer));
        }
    }
}

