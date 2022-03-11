public class Person implements Runnable {

    public void run() {
        for (int i = 0; i < 1000; i++)
            doWork();
    }

    private static void doWork() {
    }

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++)
                doWork();
        };

        Person r = new Person();
        new Thread(r).start();

    }
}