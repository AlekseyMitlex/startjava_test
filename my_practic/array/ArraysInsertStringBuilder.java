package array;

public class ArraysInsertStringBuilder {
    public static void main(String[] args) {
        char[] array = new char[]{'p', 'r', 'i', 'v', 'e', 't'};

        StringBuilder sb = new StringBuilder("Hellow World");
        sb.insert(2, array, 1, 3);
        System.out.println(sb);
    }
}
