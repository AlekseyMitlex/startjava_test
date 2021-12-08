import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answerPlayer = "yes";

        while (!"no".equals(answerPlayer)) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Имя первого игрока");
            Player Player1 = new Player(scanner.nextLine());

            System.out.println("Имя второго игрока");
            Player Player2 = new Player(scanner.nextLine());

            GuessNumber Game = new GuessNumber(Player1, Player2);

            do {
                Game.playGame();
                System.out.println("Хотите продолжить Сумашедшую игру? [yes/no]");
                answerPlayer = scanner.nextLine();
            } while (!"yes".equals(answerPlayer) && !"no".equals(answerPlayer));
        }
    }
}