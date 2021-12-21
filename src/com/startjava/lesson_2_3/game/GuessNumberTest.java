package com.startjava.lesson_2_3.game;

import com.my_practic.game.GuessNumber;
import com.my_practic.game.Player;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answerPlayer = "yes";

        while (!"no".equals(answerPlayer)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Имя первого игрока: ");
            com.my_practic.game.Player player = new com.my_practic.game.Player(scanner.nextLine());

            System.out.print("Имя второго игрока: ");
            com.my_practic.game.Player player2 = new Player(scanner.nextLine());

            com.my_practic.game.GuessNumber game = new GuessNumber(player, player2);

            game.play();

            do {
                System.out.println("Хотите продолжить Сумашедшую игру? [yes/no]");
                answerPlayer = scanner.nextLine();
            } while (!"yes".equals(answerPlayer) && !"no".equals(answerPlayer));
        }
    }
}