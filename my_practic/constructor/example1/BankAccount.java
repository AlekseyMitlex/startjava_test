package constructor.example1;

import java.time.LocalDateTime;

public class BankAccount {

    Customer customer;
    LocalDateTime opened;
    double balance;

    public BankAccount(BankAccount account) {
        customer = new Customer(account.customer.name);
        opened = LocalDateTime.now();
        balance = 0.0f;
    }

    public BankAccount(Customer customer, LocalDateTime opened, double balance) {
        this.customer = customer;
        this.opened = opened;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f",
                customer.name, opened.toString(), balance);
    }
}
