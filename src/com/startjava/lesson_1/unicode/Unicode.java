package com.startjava.lesson_1.unicode;

public class Unicode {

    public static void main(String[] args) {
        char startRange = 'Ⓐ'; //  [9398, 10178].
        char endRange = '⟂';  

        while (startRange <= endRange) {
            System.out.print(startRange);
            startRange++;
        }
    }  
}