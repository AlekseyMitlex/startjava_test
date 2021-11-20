public class ConditionalStatement{

    public static void main(String[] args){

    int vozrast = 40;
    boolean polMuzh = true;
    double rost = 1.83;
    char is1Bukva = 'A';

        if(vozrast > 20) {
            System.out.println("Возраст верен");
        }

        if (polMuzh = true) {
            System.out.println("Пол муской");
        }
        if (polMuzh != false) {
            System.out.println("Пол женский");
        }
        
        if (rost < 1.80) {
            System.out.println("карлик");
        } else {
            System.out.println("Я не карлик");
        }

        if (is1Bukva == 'M') {
            System.out.println("Моё имя Майкл");
        } else if (is1Bukva == 'И'){
            System.out.println("Моё имя  не Майкл");
        } else {
            System.out.println("Моё имя Алексей");
        }
    }
}