package object.ex1.program;

import object.ex1.computer.Computer;

public class MyfirstProgram {

    public static void main(String[] args) {
        Computer comp = new Computer("IBM", 2048, 350, 2);
        System.out.println("comp = " + comp);
//        comp.setName("IBM");
//        comp.setHdd(-350);
//        comp.setRam(-2048);

        comp.on();
        comp.off();
        comp.load();
    }
}
