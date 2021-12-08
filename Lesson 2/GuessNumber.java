import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    int secretNumber = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        while (true) {
            System.out.println("Число от " + player1.getName());
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == secretNumber) {
                System.out.println("Победил " + player1.getName() + " !!! Число  - " + secretNumber);
                break;
            } else if (player1.getNumber() > secretNumber) {
                System.out.println(player1.getNumber() + " Данное число, больше того, что загадал компьютер");
            } else if (player1.getNumber() < secretNumber) {
                System.out.println(player1.getNumber() + " Данное число меньше того, что загадал компьютер");
            }

            System.out.println("Число от " + player2.getName());
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == secretNumber) {
                System.out.println("Победил " + player2.getName() + " !!! Число  - " + secretNumber);
                break;
            } else if (player2.getNumber() > secretNumber) {
                System.out.println(player2.getNumber() + " Данное число, больше того, что загадал компьютер");
            } else if (player2.getNumber() < secretNumber) {
                System.out.println(player2.getNumber() + " Данное число меньше того, что загадал компьютер");
            }
        }
    }
}