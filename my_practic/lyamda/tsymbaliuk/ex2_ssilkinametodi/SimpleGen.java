package lyamda.tsymbaliuk.ex2_ssilkinametodi;

// ВАЖНО: класс не реализует указанный интерфейс
public class SimpleGen {

    private int number;

    public SimpleGen() {
        super();
    }

    public SimpleGen(int number) {
        super();
        this.number = number;
    }

    // Так же возвращает int, без параметров
    // по стандарту в параметре неявно/можно нигде не писать, расположено
    //      SimpleGen this - ссылка, принадлежит местному методу
    public int getNumber(SimpleGen this) {
        int temp = number;
        number += number;
        return temp;
    }

    // Так же возвращает static int, без параметров
    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
