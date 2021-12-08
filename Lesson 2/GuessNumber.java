import java.util.Scanner;

public class GuessNumber {

    public Player Player1;
    public Player Player2;
    int compNumber = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player Player1, Player Player2) {
        this.Player1 = Player1;
        this.Player2 = Player2;
    }

    public void playGame() {
        while (Player1.getNumber() != compNumber && Player2.getNumber() != compNumber) {
            System.out.println("Число от " + Player1.getName());
            Player1.setNumber(scanner.nextInt());
            System.out.println("Число от " + Player2.getName());
            Player2.setNumber(scanner.nextInt());

            if (Player1.getNumber() == compNumber) {
                System.out.println("Победил " + Player1.getName() + " !!! Число  - " + compNumber);
                break;
            } else if (Player2.getNumber() == compNumber) {
                System.out.println("Победил " + Player2.getName() + " !!! Число  - " + compNumber);
                break;
            } else {
                if (Player1.getNumber() > compNumber) {
                    System.out.println(Player1.getNumber() + " Данное число, больше того, что загадал компьютер");
                } else if (Player1.getNumber() < compNumber) {
                    System.out.println(Player1.getNumber() + " Данное число меньше того, что загадал компьютер");
                }
                if (Player2.getNumber() > compNumber) {
                    System.out.println(Player2.getNumber() + " Данное число, больше того, что загадал компьютер");
                } else if (Player2.getNumber() < compNumber) {
                    System.out.println(Player2.getNumber() + " Данное число меньше того, что загадал компьютер");
                }
            }
        }
    }
}