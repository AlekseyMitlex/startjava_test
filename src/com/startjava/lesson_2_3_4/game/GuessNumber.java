package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    private int secretNumber = (int) (Math.random() * 101);

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void inputNumber(Player player) {
        System.out.println("Число от " + player.getName());
        player.setNumber(scanner.nextInt());
    }

    private boolean guess(Player player) {
        if (player.getNumber() > secretNumber) {
            System.out.println(player.getNumber() + " Данное число, больше того, что загадал компьютер +");
        } else if (player.getNumber() < secretNumber) {
            System.out.println(player.getNumber() + " Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", Вы угадали c " + player.getCount() + " попытки!");
            return true;
        }
        return false;
    }

     private boolean makeMove(Player player, int i) {
        inputNumber(player);
         player.setCount(i);
        if (!guess(player)) {
            if (player.getCount() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
            return true;
        }
        return false;
    }

    private void showAttempts(Player player) {
        System.out.println("Попытки игрока  " + player.getName());
        for (int number : player.getNumbersCopy()) {
            System.out.print(number + " ");
        }
    }

    public void play() {
        System.out.println("Число компа " + secretNumber);
        System.out.println("У каждого игрока по " + 10 + " попыток!");
        for (int i = 1; i <= 10; i++) {
            if (!makeMove(player1, i)) {
                break;
            }

            if (!makeMove(player2, i)) {
                break;
            }
        }
        showAttempts(player1);
        showAttempts(player2);
        player1.throwOff();
        player2.throwOff();
    }
}