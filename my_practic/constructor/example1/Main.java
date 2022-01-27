package constructor.example1;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDateTime opened = LocalDateTime.of(1986, Month.MAY, 30, 4, 30, 0);
        BankAccount account = new BankAccount(new Customer("Tom"), opened, 12_642.0f);
        BankAccount newAccount = new BankAccount(account);
        System.out.println("Имя владельца для счета account = " + account.customer.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.customer.name);
        System.out.println("\nРезультат выполнения кода после изменения имени владельца счета \n");

        newAccount.customer.name = "Thomas";

        System.out.println("Имя владельца для счета account = " + account.customer.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.customer.name);

        System.out.println("\nРезультат выполнения кода после изменения имени владельца счета account:\n");

        account.customer.name = "Max";

        System.out.println("Имя владельца для счета account = " + account.customer.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.customer.name);
    }
}
