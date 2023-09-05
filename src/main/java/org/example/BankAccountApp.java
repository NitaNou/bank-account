package org.example;

import utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        /*
        Checking checkingAccount1 = new Checking("Charlie Bucket", "123456789", 2000);
        Savings savingsAccount1 = new Savings("Charlie Bucket", "987654321", 1000);
        checkingAccount1.showInfo();
        checkingAccount1.compound();
        System.out.println("*************************");
        savingsAccount1.showInfo();
        savingsAccount1.compound();
         */

        String path = "/Users/benita.nou/Projects/bank-account/src/main/resources/NewBankAccounts.txt";
        List<String[]> dataSet = CSV.read(path);
        for (String[] accountHolder : dataSet) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initialDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + SSN + " " + accountType + " $" + initialDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
            } else if (accountType.equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }


    }
}