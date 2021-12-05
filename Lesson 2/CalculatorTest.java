import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answerPlayer = "yes";
        while (!"no".equals(answerPlayer)) {
            Calculator calc = new Calculator();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            calc.setFirstNumber(scanner.nextInt());
            System.out.println("Введите +, -, *, /, %, ^");
            calc.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число:");
            calc.setSecondNumber(scanner.nextInt());

            calc.calculator();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answerPlayer = scanner.nextLine();
            } while (!"yes".equals(answerPlayer) && !"no".equals(answerPlayer));
        }
    }
}