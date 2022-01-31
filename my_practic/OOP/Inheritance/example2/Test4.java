package OOP.Inheritance.example2;

public class Test4 {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();
    }
}

class Human implements Jumpable {

    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}


class Animal implements Jumpable {

    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {

    void jump();
}

// interface может наследовать интерфейсы
interface A2 extends Jumpable {
    void abc();
}

interface B2 extends A2, Jumpable {
    void def();
}

// Абстрактт класс может наследовать конкретный или абстрактный класс
// и имплементировать 2 и более интерфейса
// A2 включено в B2 соответственно поэтому можно не имплеиентить А2
abstract class D implements B2 {
}