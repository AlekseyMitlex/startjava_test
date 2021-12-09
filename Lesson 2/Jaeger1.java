public class Jaeger1 {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger1(String modelName, String mark, String origin, float height, float weight,
            int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String block() {
        return "evasion";
    }

    public void attack() {
        System.out.println("Вы выстрелили ракетой");
    }
    
    @Override
    public String toString() {
        return "Имя :" + modelName + "\n" + "Модель: " + mark + "\n"
                + "Производитель: " + origin + "\n" + "Высота: " + height + "\n"
                + "Вес: " + weight + "\n" + "Скорость: " + speed + "\n" + "Сила: " + strength + "\n"
                + "Броня: " + armor + "\n";
    }
}