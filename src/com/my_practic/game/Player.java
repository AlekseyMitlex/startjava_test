package com.my_practic.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] number = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumber() {
        return number[count + 1];
    }

    public void setNumbers(int numbers) {
        number[count + 1] = numbers;
    }

    public int[] getNumberCopy() {
        return Arrays.copyOf(number, count);
    }

    public void getZero() {
        Arrays.fill(number , 0);
        count = -2;
    }


}
