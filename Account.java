package com.carlosdegollado;

import javax.sound.midi.Soundbank;

public class Account {

    private int acctNum;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public int getAcctNum() {
        return this.acctNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.email;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Balance + " + deposit + " = " + balance);
    }

    public void withdraw(double withdraw) {

        if(this.balance - withdraw > 0) {
            this.balance -= withdraw;
            System.out.println("Balance - " + withdraw + " = " + balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
