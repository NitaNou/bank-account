package org.example;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking checkingAccount1 = new Checking("Charlie Bucket", "123456789", 2000);
        Savings savingsAccount1 = new Savings("Charlie Bucket", "987654321", 1000);

        checkingAccount1.showInfo();
        checkingAccount1.compound();
        System.out.println("*************************");
        savingsAccount1.showInfo();
        savingsAccount1.compound();

    }
}