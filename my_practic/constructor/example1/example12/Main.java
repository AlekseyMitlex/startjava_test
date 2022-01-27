package constructor.example1.example12;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = BankAccount.getInstance("Petya");
        BankAccount bankAccount2 = BankAccount.getInstance("Elena");

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);

        System.out.println(BankAccountUtils.namesConcatenate("Tom", "Jeferson"));
    }
}