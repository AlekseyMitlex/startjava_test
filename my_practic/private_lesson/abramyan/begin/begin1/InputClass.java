package private_lesson.abramyan.begin.begin1;

import java.util.Scanner;

public class InputClass implements Arithmetic, Print {

    int storonaKvadrata;
    int perimetr;

    static Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("Введите сторону квадрата :");
        storonaKvadrata = scanner.nextInt();
    }

    @Override
    public void doPerimeter() {
        perimetr = 4 * storonaKvadrata;
    }

    @Override
    public void outputDataTxt() {
        System.out.print("Периметр квадрата равен: ");
    }

    @Override
    public void outputDataNumeric() {
        System.out.print(perimetr);
    }
}
