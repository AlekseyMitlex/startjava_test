public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.pol = "кабелёк";
        wolf.nickname = "Кусатыч";
        wolf.weight = 35F;
        wolf.age = 3;
        wolf.color = "серый";

        wolf.move();
        System.out.println(wolf.isSit());
        System.out.println(wolf.isRun());
        System.out.println(wolf.howl());
        System.out.println(wolf.isHunt());

        System.out.println("Пол волка :" + wolf.pol + "\n" + "Кличка волка: " + wolf.nickname + "\n"
                + "Вес волка: " + wolf.weight + "\n" + "Возраст волка: " + wolf.age + " года" + "\n" 
                + "Окрас волка: " + wolf.color);    
    }
}