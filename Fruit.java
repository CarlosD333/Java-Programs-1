package com.carlosdegollado;

public class Fruit {
    public int f;

    public Fruit(int f) {
        System.out.println("Fruit");
        this.f = f;
    }

    public int getF() {
        return this.f;
    }

    public void f1() {
        System.out.println("FRUIT f1");
    }

    public void f2() {
        f1();
        System.out.println("FRUIT f2");
    }

    public void display() {
        System.out.println("display method from Fruit invoked");
        f2();
    }
}
