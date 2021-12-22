package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private boolean isVictory = false;

   private int secretNumber = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void guess(Player player) {
        if (player.getNumber() == secretNumber || player.getCount() == 8) {
            if (player.getNumber() == secretNumber) {
                System.out.println("Игрок " + player.getName() + " угадал число " + " с " + player.getCount() + " попытки");
                isVictory = true;
            } else if (player.getCount() == 8) {
                System.out.println("\nУ игрока " + player.getName() + " закончились попытки\n");
                isVictory = true;
            }
        } else if (player.getNumber() > secretNumber) {
            System.out.println(player.getNumber() + " Данное число, больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println(player.getNumber() + " Данное число меньше того, что загадал компьютер");
        }
    }

    private void countAttempts(Player player) {
        System.out.println("Попытки игрока  " + player.getName());
        for (int numbers : player.getNumbersCopy()) {
            System.out.print(numbers + "\n");
        }
    }

    private void showAttempts (Player player) {
        if (player.getCount() == 10) {
            System.out.println("У Вас, закончились попытки! " + player.getName());
        }
    }

    private void inputNumber(Player player) {
        player.setCount(player.getCount() + 1);
        System.out.println("Число от " + player.getName());
        player.setNumber(scanner.nextInt());
    }


    public void play() {
        System.out.println("Число компа " + secretNumber);
        System.out.println("У каждого игрока по " + 10 + " попыток!");
        do {
            inputNumber(player1);
            guess(player1);
            inputNumber(player2);
            guess(player2);
        } while (!isVictory);
        countAttempts(player1);
        countAttempts(player2);
        player1.throwOff();
        player2.throwOff();
    }
}