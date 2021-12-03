import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator object = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        object.setFirstNumber(scanner.nextInt());
        System.out.println("Введите +, -, *, /, %, ^");
        object.setSign(scanner.next().charAt(0));
        System.out.println("Введите второе число:");
        object.setSecondNumber(scanner.nextInt());

        object.mathSign();

        outer:
        while (true) {

            System.out.println("Хотите продолжить вычисления? [yes/no]:");

            switch (scanner.nextLine()) {
                case "yes":
                    System.out.println("Введите первое число:");
                    object.setFirstNumber(scanner.nextInt());
                    System.out.println("Введите +, -, *, /, %, ^");
                    object.setSign(scanner.next().charAt(0));
                    System.out.println("Введите второе число:");
                    object.setSecondNumber(scanner.nextInt());

                    object.mathSign();
                case "no":
                    if (scanner.nextLine() == "no") {
                        break outer;
                    }
                    System.out.println("The End");
                    break outer;

            }
        }
    }
}