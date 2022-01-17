package Pattern.example.mammal;

public class Dog extends Mammal implements Nameable {

    String Dogname;

    Head head;

    @Override
    public void makeNoise() {
        System.out.println("make barking");
    }

    public String getName() {
        return Dogname;
    }

    public void setName(String Myname) {
        Dogname = Myname;
    }
}
