package com.carlosdegollado;

public class Toll {
    private int axles;
    private int weight;
    private double fee;

    public Toll(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    public void calculateToll() {
        double temp = 0;
        this.fee = this.axles * 5;
        this.fee += this.weight / 500 * 10;
    }

    public void displayReceipt() {
        System.out.println("Axles: " + this.axles);
        System.out.println("Weight: " + this.weight + " Kilograms");
        System.out.println("Toll paid: $" + this.fee);
        System.out.println();
    }
}
