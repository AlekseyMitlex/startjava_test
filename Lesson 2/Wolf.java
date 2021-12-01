public class Wolf {

    private String pol;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть > 8 лет!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("\nШел долго - долго");
    }

    public boolean isSit() {
        System.out.println("Что-то подустал волчёк -  решил посидеть и отдохнуть");
        return true;
    }

    public boolean isRun() {
        System.out.println("Бежать сил совсем нет");
        return false;
    }

    public String howl() {
        System.out.println("Завыл волк от голода. УУУУУУУУУУУУугргррг");
        return "УУУУУУ";
    }

    public boolean isHunt() {
        System.out.println("Делать нечего, пойду на охоту!!!");
        return true;
    }
}