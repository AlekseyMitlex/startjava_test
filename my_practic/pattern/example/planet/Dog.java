package pattern.example.planet;

public class Dog implements Nameable {

    String dogName;

    public String getName() {
        return dogName;
    }

    public void setName(String myName) {
        dogName = myName;
    }
}
