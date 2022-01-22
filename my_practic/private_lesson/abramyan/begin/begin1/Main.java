package private_lesson.abramyan.begin.begin1;

// Дана сторона квадрата a. Найти его периметр P = 4·a.

public class Main {

    static InputClass figura = new InputClass();

    public static void main(String[] args) {

        figura.input();
        figura.doPerimeter();
        figura.outputDataTxt();
        figura.outputDataNumeric(figura.perimetr);

    }
}
