package src.BankAccount.Solution1;

import src.BankAccount.Solution1.*;

public class Main{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("987654321", "Jane Doe", 500.0);

        account1.deposit(500.0);
        account2.withdraw(200.0);

        System.out.println(account1.getAccountHolderName() + "'s balance is $" + account1.getBalance());
        System.out.println(account2.getAccountHolderName() + "'s balance is $" + account2.getBalance());
    }
}
