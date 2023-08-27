package org.example;

public class Savings extends Account{

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        System.out.println("SAVINGS ACCOUNT #: " + "1" + accountNum);
    }
}
