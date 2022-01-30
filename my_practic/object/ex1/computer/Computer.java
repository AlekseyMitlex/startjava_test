package object.ex1.computer;

public class Computer {

    public String name;
    public int ram;
    public int hdd;
    public double weight;

    public void on() {
        System.out.println("I`m On. My model " + name);
    }

    public void off() {
        System.out.println("I`m Off " + ram);
    }

    public void load() {
        System.out.println("I`m load. My vol. hdd = " + hdd + " Gb");
    }
}
