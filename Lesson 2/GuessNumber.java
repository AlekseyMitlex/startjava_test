import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private boolean isVictory = false;

    int secretNumber = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    public void inputNumber(Player player) {
        System.out.println("Число от " + player.getName());
        player.setNumber(scanner.nextInt());
    }

    public void guess(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println("Победил " + player.getName() + " !!! Число  - " + secretNumber);
            isVictory = true;
        } else if (player.getNumber() > secretNumber) {
            System.out.println(player.getNumber() + " Данное число, больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println(player.getNumber() + " Данное число меньше того, что загадал компьютер");
        }
    }

    public void play() {
        do {
            inputNumber(player1);
            inputNumber(player2);
            guess(player1);
            guess(player2);
        } while (!isVictory);
    }
}