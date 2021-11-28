public class Calculator {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        char sign = '/'; // (+, -, *, /, ^, %) Подставляем знаки

        int result;

        if (sign == '+') {
            result = a + b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '-') {
            result = a - b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '*') {
            result = a * b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '/') {
            result = a / b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '%') {
            result = a % b;
            System.out.println("Результат вычисления = " + result);
        } else if (sign == '^') {
            int degree = 1;
            while (b > 0) {
                degree *= a;
                b--;
            }
            System.out.println("При использовании ^ :" + degree);
        }
    }
}