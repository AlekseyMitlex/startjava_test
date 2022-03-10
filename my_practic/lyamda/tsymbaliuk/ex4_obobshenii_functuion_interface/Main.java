package lyamda.tsymbaliuk.ex4_obobshenii_functuion_interface;

public class Main {

    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        Modifier<Integer> a = ng::add;
        Modifier<Double> b = ng::add;
        Modifier<String> s = ng::add;

    }
}
