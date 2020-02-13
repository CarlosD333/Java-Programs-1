package com.CarlosDegollado;

public class Card {
    private String name;

    public Card() {
        this.name = "N/A";
    }

    public Card(String name) {
        this.name = name;
    }

    public boolean isExpired() {
        return false;
    }

    public void printInfo() {
        System.out.println(this.name);
    }
}
