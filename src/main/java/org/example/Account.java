package org.example;

public abstract class Account implements IBaseRate {

    String name;
    String SSN;
    double balance;
    String accountNum;
    double rate;
    static int unique5Digit = 10000;


    public Account(String name, String SSN, double initialDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initialDeposit;
        this.accountNum = generateAccountNumber();
        System.out.println("NAME: " + name);
        System.out.print("NEW ACCOUNT: ");
    }

    private String generateAccountNumber() {
        // 1 or 2 --> Savings, Checking
        // last 2 digits of SSN
        // unique 5 digit num
        // random 3 digit num

        String lastTwoOfSSN = this.SSN.substring(this.SSN.length()-2);
        int random3DigitNum = (int)(Math.random() * Math.pow(10,3));
        this.accountNum = lastTwoOfSSN + unique5Digit + random3DigitNum;
        unique5Digit++;
        return this.accountNum;
    }



}
