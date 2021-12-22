package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answerPlayer = "yes";

        while (!"no".equals(answerPlayer)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Имя первого игрока: ");
            Player player1 = new Player(scanner.nextLine());

            System.out.print("Имя второго игрока: ");
            Player player2 = new Player(scanner.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);

            game.play();

            do {
                System.out.println("Хотите продолжить Сумашедшую игру? [yes/no]");
                answerPlayer = scanner.nextLine();
            } while (!"yes".equals(answerPlayer) && !"no".equals(answerPlayer));
        }
    }
}