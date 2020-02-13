package com.carlosdegollado;

public class PickUp extends Car {
    public PickUp(int p) {
        n = n + p;
        System.out.println(n + " P1");
    }

    public PickUp() {
        super(5);
        System.out.println(n + " P2");
    }

    public void gum() {
        System.out.println(n + " Gum!");
        goo();
        super.gum();
    }
}
