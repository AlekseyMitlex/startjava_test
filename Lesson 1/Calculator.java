public class Calculator {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        char calcSign = '^'; // Остальные арифметические операции

        int sum;
        int sub;
        int mult;
        int divis;
        int remains;

        if (calcSign == '+') {
            sum = a + b;
            System.out.println("При использовании + :" + sum);
        } else if (calcSign == '-') {
            sub = a - b;
            System.out.println("При использовании - :" + sub);
        } else if (calcSign == '*') {
            mult = a * b;
            System.out.println("При использовании * :" + mult);
        } else if (calcSign == '/') {
            divis = a / b;
            System.out.println("При использовании / :" + divis);
        } else if (calcSign == '%') {
            remains = a % b;
            System.out.println("При использовании % :" + remains);
        } else if (calcSign == '^') {
            int degree = 1;
            while (b > 0) {
                degree *= a;
                b--;
            }
            System.out.println("При использовании ^ :" + degree);
        }
    }
}