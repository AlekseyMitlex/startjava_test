package object.ex1.computer;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public Computer() {
    }

    public Computer(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    public void on() {
        System.out.println("I`m On. My model " + name);
    }

    public void off() {
        System.out.println("I`m Off " + ram);
    }

    public void load() {
        System.out.println("I`m load. My vol. hdd = " + hdd + " Gb");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
