package lyamda.tsymbaliuk.lyamda.ex22_iscluchenie;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

// Лямды должны быть совместимы по типу проверяемых исключений
//      с теми абстрактными методами. которые они реализуют
// Проверяемое исключение обязательно должно быть в интерфейсе,
//      если есть в методе

public class Main {

    public static void main(String[] args) {
        Saver saver = obj -> {
            File file = new File("save.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println(obj.toString());
            pw.close();
        };

        try {
            saver.save("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
