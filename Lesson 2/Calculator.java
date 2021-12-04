import java.util.Scanner;

class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;
    
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }
    

    public void countCalculator() {
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
