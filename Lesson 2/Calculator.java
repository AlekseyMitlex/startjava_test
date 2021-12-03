import java.util.Scanner;

class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void mathSign() {
        switch (sign) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            case '^':
                int degree = 1;
                while (secondNumber > 0) {
                    degree *= firstNumber;
                    secondNumber--;
                }
                System.out.println(degree);
                break;
            default:
                System.out.println("Жил-был программист и было у него два сына - Антон и Неантон");
        }
    }
}
