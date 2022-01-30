package codewar.kui8;

/*Write a function called repeatStr which repeats the
 given string string exactly n times.
        repeatStr(6, "I") // "IIIIII"
        repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"*/

public class Ex2 {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
            System.out.print(sb);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        repeatStr(5, "i");
    }
}
