package constructor.example1.example11;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Tom");
        System.out.println(account);

        VipBankAccount vipAccount = new VipBankAccount("Thomas", "VIP");
        System.out.println(vipAccount + "\n");
        System.out.println("_______________\n");

        LocalDateTime actionDate = LocalDateTime.now();
        BankAccount accountTransaction = new BankAccount("Tom");
        Transaction transaction = new Transaction(accountTransaction, actionDate, 1234);

        System.out.println(transaction);
    }
}
