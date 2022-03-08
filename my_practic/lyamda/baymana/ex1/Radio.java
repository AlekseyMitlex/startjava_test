package lyamda.baymana.ex1;

public class Radio implements ElectricityConsumer {

    public void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
