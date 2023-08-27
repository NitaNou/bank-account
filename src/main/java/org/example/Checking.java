package org.example;

public class Checking extends Account{

    int debitCardNum;
    int debtCardPIN;

    public Checking(String name, String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        System.out.println("CHECKING ACCOUNT #: " + "2" + accountNum);
    }
}
