import java.util.Scanner;

public class CalculatorTest {

    static String answerPlayer;

    public static void main(String[] args) {

        while (!"no".equals(answerPlayer)) {

            Calculator calc = new Calculator();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            calc.setFirstNumber(scanner.nextInt());
            System.out.println("Введите +, -, *, /, %, ^");
            calc.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число:");
            calc.setSecondNumber(scanner.nextInt());

            calc.countCalculator();

            answerPlayer = null;

            while (!"yes".equals(answerPlayer) & !"no".equals(answerPlayer)) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answerPlayer = scanner.nextLine();
                if (!"no".equals(answerPlayer)) {
                    answerPlayer = scanner.nextLine();
                }
            }
        }
    }
}