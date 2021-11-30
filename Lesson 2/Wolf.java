public class Wolf {
    String pol;
    String nickname;
    float weight;
    byte age ;
    String color;

    void move() {
        System.out.println("\nШел долго - долго");
    }

    boolean isSit() {
        System.out.println("Что-то подустал волчёк -  решил посидеть и отдохнуть");
        return true;
    }

    boolean isRun() {
        System.out.println("Бежать сил совсем нет");
        return false;
    }

    String howl() {
        System.out.println("Завыл волк от голода. УУУУУУУУУУУУугргррг");
        return "УУУУУУ";
    }

    boolean isHunt() {
        System.out.println("Делать нечего, пойду на охоту!!!\n");
        return true;
    }


}