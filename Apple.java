package com.carlosdegollado;

public class Apple extends Fruit {
    public static int count = 0;

    public Apple(int a) {
        super(a);
        System.out.println("Apple");
        count = count + getF();
    }

    public void f1() {
        System.out.println("Apple f1");
    }

    public void f2() {
        f1();
        System.out.println("Apple f2");
        super.f1();
    }

    public void display() {
        System.out.println("display method from Apple invoked");
        f2();
    }
}
