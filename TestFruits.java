package com.carlosdegollado;

public class TestFruits {
    public static void main(String[] args) {
        Apple a = new Apple(2);
        System.out.println(Apple.count);
        System.out.println();

        Fruit[] fr = new Fruit[3];
        fr[0] = a;
        fr[1] = new RedDelicious();
        fr[2] = new Fruit(4);
        System.out.println();

        System.out.println("Using array fr: ");
        for (int i = 0; i < fr.length;i++) {
            fr[i].display();
            System.out.println(Apple.count);
            System.out.println();
        }
    }
}
