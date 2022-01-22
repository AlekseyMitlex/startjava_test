package private_lesson.abramyan.begin.begin1;

public interface Print {

    default void outputDataTxt() {
        System.out.print("Периметр квадрата равен: ");
    }

    default void outputDataNumeric(int perimetr) {
        System.out.print(perimetr);
    }
}
