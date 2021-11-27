public class GuessNumber {

    public static void main(String[] args) {
        int number = 30; // загаданное число (0-100]
        int user = 70;    // Число игрока

        while (user < number) {
            System.out.println(user + " Данное число больше того, что загадал компьютер");
            user++;
        }
        while (user > number) {
            System.out.println(user + " Данное число меньше того, что загадал компьютер");
            user--;
        }
        if (user == number)  {
            System.out.println("Поздравляю, число угадано! " + user);
        }
    }
}