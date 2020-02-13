package com.carlosdegollado;

public class RedDelicious extends Apple {
    public static int count;

    public RedDelicious() {
        super(3);
        System.out.println("RedDelicious");
        count = count + getF();
    }

    public void f1() {
        System.out.println("RedDelicious f1");
    }

    public void f2() {
        f1();
        System.out.println("RedDelicious f2");
        super.f1();
    }

    public void display() {
        System.out.println("display method from RedDelicious invoked");
        f1();
    }
}
