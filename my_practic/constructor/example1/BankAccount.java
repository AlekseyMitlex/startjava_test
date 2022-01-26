package constructor.example1;

import java.time.LocalDateTime;

public class BankAccount {

    String name;
    LocalDateTime opened;
    double balance;

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f",
                name, opened.toString(), balance);
    }
}
