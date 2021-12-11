package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setPol("кабелёк");
        wolf.setNickname("Кусатыч");
        wolf.setWeight(35F);
        wolf.setAge(9);
        wolf.setColor("серый");

        wolf.move();
        System.out.println(wolf.isSit());
        System.out.println(wolf.isRun());
        System.out.println(wolf.howl());
        System.out.println(wolf.isHunt());

        System.out.println("Пол волка :" + wolf.getPol() + "\n" + "Кличка волка: " + wolf.getNickname() + "\n"
                + "Вес волка: " + wolf.getWeight() + "\n" + "Возраст волка: " + wolf.getAge() + "  лет" + "\n"
                + "Окрас волка: " + wolf.getColor());
    }
}