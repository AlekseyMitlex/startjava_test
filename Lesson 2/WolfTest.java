public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

            wolf.pol = "кабелёк";
            wolf.nickname = "Кусатыч";
            wolf.weight = 35F;
            wolf.age = 3;
            wolf.color = "серый";

            wolf.move();
            wolf.isSit();
            wolf.isRun();
            wolf.howl();
            wolf.isHunt();

            System.out.println("Пол волка :" + wolf.pol + "\n" + "Кличка волка: " + wolf.nickname + "\n"
            + "Вес волка: " + wolf.weight + "\n" + "Возраст волка: " + wolf.age + " года" + "\n" 
            + "Окрас волка: " + wolf.color);
    }

}