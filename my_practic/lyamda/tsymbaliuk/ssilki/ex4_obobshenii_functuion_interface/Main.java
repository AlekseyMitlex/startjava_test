package lyamda.tsymbaliuk.ssilki.ex4_obobshenii_functuion_interface;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        Modifier<Integer> a = ng::add;
        Modifier<Double> b = ng::add;
        Modifier<String> s = ng::add;

        System.out.println("----------");
        Gen gen = new Gen();
        IntElementGenerator generator = gen::nextElement;

        System.out.println("----------");

        Saver<String> sr = Main::saveToFile;
        try {
            sr.saveTo("Hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Если наш метод генерирует проверяемое исключение,
    //      то интерфейс должен пробрасывать искобчение
    public static <T> void saveToFile(T el) throws IOException {
        PrintWriter pw = new PrintWriter(new File("save.txt"));
        pw.println(el);
    }
}
