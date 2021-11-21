public class ConditionalStatement {

    public static void main(String[] args) {

        int age = 40;
        if(age > 20) {
            System.out.println("Возраст верен");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Пол муской");
        }
        if (!maleGender) {
            System.out.println("Пол женский");
        }
        
        double height = 1.83;
        if (height < 1.80) {
            System.out.println("карлик");
        } else {
            System.out.println("Я не карлик");
        }

        char firstLetter = 'A';
        if (firstLetter == 'M') {
            System.out.println("Моё имя Майкл");
        } else if (firstLetter == 'И') {
            System.out.println("Моё имя  не Майкл");
        } else {
            System.out.println("Моё имя Алексей");
        }
    }
}