package private_lesson.abramyan.begin.begin1;

// Дана сторона квадрата a. Найти его периметр P = 4·a.

public class Main {

    public static void main(String[] args) {
        InputClass figura = new InputClass();

        figura.input();
        figura.doPerimeter();
        figura.outputDataTxt();
        figura.outputDataNumeric();
    }
}
