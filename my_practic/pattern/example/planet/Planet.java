package pattern.example.planet;

public class Planet implements Nameable {

    String planetName;

    public String getName() {
        return planetName;
    }

    public void setName(String myName) {
        planetName = myName;
    }
}
