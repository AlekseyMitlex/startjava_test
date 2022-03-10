package lyamda.tsymbaliuk.ssilki.ex4_obobshenii_functuion_interface;

// Класс с 3 перегруженными методами
// Формально, каждый метод подходит под реализацию функционального обобщенного интерфейса
public class NumberGenerator {

    public Integer add(Integer n) {
        return n + 10;
    }

    public Double add(Double n) {
        return n + 10.0;
    }

    public String add(String n) {
        return n + " " + n;
    }
}
