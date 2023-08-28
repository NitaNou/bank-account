package org.example;

public class Savings extends Account{

    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        accountNum = "1" + accountNum;
        setSafetyBox();
    }

    private void setSafetyBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features:" +
                            "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                            "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }
}
