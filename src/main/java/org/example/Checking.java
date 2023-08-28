package org.example;

public class Checking extends Account{

    int debitCardNum;
    int debtCardPIN;

    public Checking(String name, String SSN, double initialDeposit) {
        super(name, SSN, initialDeposit);
        accountNum = "2" + accountNum;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNum = (int)(Math.random() * Math.pow(10,14)); // NOT UPDATING
        debtCardPIN = (int)(Math.random() * Math.pow(10,4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features:" +
                            "\n Your debit card number is: " + debitCardNum +
                            "\n Your PIN is: " + debtCardPIN);
    }
}
