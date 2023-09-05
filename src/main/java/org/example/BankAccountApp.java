package org.example;

import utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        String path = "/Users/benita.nou/Projects/bank-account/src/main/resources/NewBankAccounts.txt";
        List<String[]> dataSet = CSV.read(path);
        for (String[] accountHolder : dataSet) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initialDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, SSN, initialDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, SSN, initialDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acct : accounts) {
            System.out.println("**************************");
            acct.showInfo();
        }

    }
}