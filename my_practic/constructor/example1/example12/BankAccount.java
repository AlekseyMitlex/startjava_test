package constructor.example1.example12;

import java.time.LocalDateTime;

public class BankAccount {

    private static BankAccount instance;

    String name;
    LocalDateTime opened = LocalDateTime.now();
    double balance = 0.0f;

    private BankAccount(String name) {
        this.name = name;
    }

    public static BankAccount getInstance(String name) {
        if (instance == null) {
            instance = new BankAccount(name);
        }
        return instance;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f\n", name, opened.toString(), balance);
    }
}
