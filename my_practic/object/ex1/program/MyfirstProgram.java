package object.ex1.program;

import object.ex1.computer.Computer;

public class MyfirstProgram {

    public static void main(String[] args) {
        Computer comp = new Computer();

        comp.name = "IBM";
        comp.hdd = 350;

        comp.on();
        comp.off();
        comp.load();
    }
}
