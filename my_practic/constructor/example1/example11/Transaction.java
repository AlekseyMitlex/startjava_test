package constructor.example1.example11;

import java.time.LocalDateTime;

public class Transaction {
    final BankAccount bankAccount;
    final LocalDateTime date;
    final double amount;

    /*
       Код ниже приведет к ошибке компиляции, если переменная amount будет final

       public Transaction(BankAccount account, LocalDateTime date) {
           this.bankAccount = account;
           this.date = date;
       }
    */
    public Transaction(BankAccount account, LocalDateTime date, double amount) {
        this.bankAccount = account;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Проведена транзакция на сумму - %s, \n\nС банковского счета 17:             - %s. \n\nДата и время транзакции: %s", amount, bankAccount, date.toString());
    }
}
