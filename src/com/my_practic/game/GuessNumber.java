package com.my_practic.game;

import java.util.Scanner;

public class GuessNumber {

    private Player player;
    private Player player2;
    private boolean isVictory = false;

    int secretNumber = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player, Player player2) {
        this.player = player;
        this.player2 = player2;
    }

    public void guess(Player player) {
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

    public void getResult(Player player) {
        System.out.println("Попытки игрока  " + player.getName());
        for (int numbers : player.getNumberCopy()) {
            System.out.print(numbers + "\n");
        }
    }

    public void countAttempts(Player player) {
        if (player.getCount() == 10) {
            System.out.println("У Вас, закончились попытки! " + player.getName());
        }
    }

    public void inputNumber(Player player) {
        player.setCount(player.getCount() + 1);
        System.out.println("Число от " + player.getName());
        player.setNumbers(scanner.nextInt());
    }


    public void play() {
        System.out.println("Число компа " + secretNumber);
        System.out.println("У каждого игрока по " + 10 + " попыток!");
        do {
            inputNumber(player);
            guess(player);
            inputNumber(player2);
            guess(player2);
        } while (!isVictory);
        getResult(player);
        getResult(player2);
        player.getZero();
        player2.getZero();
    }
}
