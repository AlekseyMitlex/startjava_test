package collection.tregulov.stack;

public class StackEx1 {

    // TODO : Пример LIFO работа метода, последний пришел и первый ушёл
    static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 end");
    }

    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 end");
    }

    static void abc3() {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 end");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        abc3();
        System.out.println("main ends");
    }
}
