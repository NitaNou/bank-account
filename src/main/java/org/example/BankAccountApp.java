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
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }


    }
}