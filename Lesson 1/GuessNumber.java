public class GuessNumber {

    public static void main(String[] args) {
        int secretNumber = 30; // загаданное число (0-100]
        int playerNumber = 70;    // Число игрока

        while (playerNumber != secretNumber) {
            if(playerNumber > secretNumber) {
                System.out.println(playerNumber + " Данное число меньше того, что загадал компьютер");
                playerNumber--;
            } else if(playerNumber < secretNumber) {
                System.out.println(playerNumber + " Данное число меньше того, что загадал компьютер");
                playerNumber++;
            }
            System.out.println("Поздравляю, число угадано! " + playerNumber);
        }
    }
}