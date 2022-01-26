package exceptions.examples.first;

public class MyException {

    public static void main(String[] args) {
        int catNumber;
        int zero;
//        catNumber = 1; // у меня один кот
//        zero = 0; // ноль, он и в Африке ноль
//        int result = catNumber / zero;

        try { // мониторим код
            catNumber = 1; // у меня один кот
            zero = 0; // ноль, он и в Африке ноль
            int result = catNumber / zero;
            System.out.println("Не увидите это сообщение!");
        } catch (ArithmeticException e) {
            System.out.println("Увидите это сообщение! " + e);
        }
        System.out.println("Жизнь продолжается");
    }
}
