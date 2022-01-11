package baseJava_lessons.OOP.Abstraction.example1;

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.perimetr();
        f1.ploshad();
        f1.showinfo();
    }
}
// В реальности объект фигура не существует
// Не, знает, как делать эти методы, не знает как работают,
// но знает точно, что они должны быть

abstract class Figura {

    int kolichestvoStoron;

    abstract void perimetr();

    abstract void ploshad();

    void showinfo() {
        System.out.println("Eto Figura");
    }
}

class Kvadrat extends Figura {

    int storona1 = 10;
    int kolichestvoStoron = 4;

    public void perimetr() {
        System.out.println("Perimetr kvadtata = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadtata = " + storona1 * storona1);
    }

}

class Pryamougolnik extends Figura {

    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perimetr Pryamougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad Pryamougolnika = " + storona1 * storona2);
    }
}

class Okruknost extends Figura {

    int kolichestvoStoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr Okruknosti = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad Okruknosti = " + radius * radius);
    }
}

abstract class Chetirehugolnik extends Figura {
    void def() {
        System.out.println("Eto Chetirehugolnik");
    }
}