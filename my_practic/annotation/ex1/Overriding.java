package annotation.ex1;

public class Overriding {

    public static void main(String[] args) {
        Parent p = new Parent("Zaur");
        p.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("It`s Parent class. Name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    // @Override Аннотация не даёт допустить случайные ошибки и проверяет правильность
    // перезаписывания, даже орфографию
    @Override
    void showInfo() {
        System.out.println("It`s Child class. Name = " + name);
    }
}