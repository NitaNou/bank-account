package org.example;

public abstract class Account implements IBaseRate {

    private String name;
    private String SSN;
    private double balance;
    protected String accountNum;
    protected double rate;
    private static int unique5Digit = 10000;


    public Account(String name, String SSN, double initialDeposit) {
        this.name = name;
        this.SSN = SSN;
        balance = initialDeposit;
        this.accountNum = generateAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String generateAccountNumber() {
        // 1 or 2 --> Savings, Checking + last 2 digits of SSN + unique 5 digit num + random 3 digit num
        String lastTwoOfSSN = this.SSN.substring(this.SSN.length()-2);
        int random3DigitNum = (int)(Math.random() * Math.pow(10,3));
        this.accountNum = lastTwoOfSSN + unique5Digit + random3DigitNum;
        unique5Digit++;
        return this.accountNum;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing: " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing: " + amount);
        printBalance();
    }

    public void transferTo(String accountType, double amount) {
        balance = balance - amount;
        System.out.println("Transferring: " + amount + " to " + accountType);
        printBalance();
    }

    public void compound() {
        double interest = balance * (rate/100);
        balance = balance + interest;
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your BALANCE is: " + balance);
    }

    public void showInfo() {
        System.out.println("NAME: " + name
                           + "\nACCOUNT NUMBER: " + accountNum
                           + "\nBALANCE: " + balance
                           + "\nRATE: " + rate + "%");
    }



}
