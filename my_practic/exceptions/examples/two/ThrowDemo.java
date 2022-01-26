package exceptions.examples.two;

public class ThrowDemo {

    static void demoproc() {
        try {
            throw new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException е) {
            System.out.println("Иcключeниe перехвачено в теле "
                    + "метода demoproc ().");
            throw е; // 11 повторно сгенерировать исключение
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException е) {
            System.out.println("Пoвтopный перехват: " + е);
        }
    }
}