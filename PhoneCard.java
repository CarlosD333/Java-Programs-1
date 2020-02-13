package com.CarlosDegollado;

public class PhoneCard extends Card {
    private int idNumber;
    private double amount;

    public PhoneCard(int idNumber, double amount) {
        this.idNumber = idNumber;
        this.amount = amount;
    }

    @Override
    public void printInfo() {
        System.out.println("ID : " + this.idNumber);
        System.out.println("Amount: $" + this.amount);
    }
}
