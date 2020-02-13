package com.carlosdegollado;

public class Car {
    public static int n = 0;

    public Car() {
        System.out.println(n + " C1");
        n++;
    }

    public Car(int num) {
        n += num;
        System.out.println(n + " C2");
    }

    public void goo() {
        System.out.println("Goo#");
    }

    public void gum() {
        System.out.println("Gum#");
    }
}
