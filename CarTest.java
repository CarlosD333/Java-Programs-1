package com.carlosdegollado;

public class CarTest {
    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new PickUp(3);
        Car c2 = new FOneFifty();

        c1.goo();
        c2.goo();
        c.goo();
        c2.gum();
    }
}