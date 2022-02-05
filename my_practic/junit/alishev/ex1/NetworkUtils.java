package junit.alishev.ex1;

public class NetworkUtils {

    public static void getConnection() {
        // получаем соединение с сервером
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}
