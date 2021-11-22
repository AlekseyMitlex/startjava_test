public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 7;
        char x = '^'; // Остальные арифметические операции

        int sum;
        int sub;
        int mult;
        int divis;
        int remains;
        int caret;

        sum = a + b;
        sub = a - b;
        mult = a * b;
        divis = a / b;
        remains = c % b;
        caret = a ^ b;

        if (x == '+') {
            System.out.println("При использовании + :" + sum);
        } else if(x == '-') {
            System.out.println("При использовании - :" + sub);
        } else if(x == '-') {
            System.out.println("При использовании * :" + mult);
        } else if(x == '/') {
            System.out.println("При использовании / :" + divis);
        } else if(x == '%') {
            System.out.println("При использовании % :" + remains);
        } else if(x == '^') {
            System.out.println("При использовании ^ :" + caret);
        } 
    }
}