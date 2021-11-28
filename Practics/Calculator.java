package alishev.lesson1;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        int a = 3700;
        int b = 2600;
        char calcSign;
               
        int sum;
        int sub;
        int mult;
        int divis;
        int remains;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите +, -, *, /, %, ^");
        calcSign= scanner.next().charAt(0);
                     
        if(calcSign == '+') {
            sum = a + b;
            System.out.println(sum);
        } else if(calcSign == '-') {
            sub = a - b;
            System.out.println(sub);
        } else if(calcSign == '*') {
            mult = a - b;
            System.out.println(mult);
        } else if(calcSign == '/') {
            divis = a / b;
            System.out.println(divis);
        } else if(calcSign == '%') {
            remains = a % b;
            System.out.println(remains);
        } else if(calcSign == '^') {
            int degree = 1;
            while (b > 0) {
               degree *= a;
               b--;               
            }         
            System.out.println(degree);
        } 
    }   
}
