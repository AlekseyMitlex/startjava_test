import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int x = 0;

        while (x == 0) {

            Calculator calc = new Calculator();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            calc.setFirstNumber(scanner.nextInt());
            System.out.println("Введите +, -, *, /, %, ^");
            calc.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число:");
            calc.setSecondNumber(scanner.nextInt());

            calc.countCalculator();

            System.out.println("Хотите продолжить вычисления? [yes/no]:");

            scanner.nextLine();

            switch (scanner.nextLine()) {
                case "yes":
                    break;
                case "no":
                    x++;
                    System.out.println("The End");
            }
        }
    }
}