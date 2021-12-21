package com.my_practic.calculator;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String input = "1+1";
        String[] arr = "[+\\-*/]".split(input);
        System.out.println(Arrays.toString(arr)); // [1, 1]
    }
}
