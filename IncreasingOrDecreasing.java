package com.CarlosDegollado;
import java.math.BigDecimal;
import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {

        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value: ");
        String val1 = input.nextLine();

        System.out.print("Enter value: ");
        String val2 = input.nextLine();

        System.out.print("Enter value: ");
        String val3 = input.nextLine();

        Scanner close;

        BigDecimal big1 = new BigDecimal(val1);
        BigDecimal big2 = new BigDecimal(val2);
        BigDecimal big3 = new BigDecimal(val3);

        boolean IncTest1 = big1.compareTo(big2) < 0;
        boolean IncTest2 = big2.compareTo(big3) < 0;

        boolean DecTest1 = big1.compareTo(big2) > 0;
        boolean DecTest2 = big2.compareTo(big3) > 0;

        System.out.println();

        if (IncTest1 == true && IncTest2 == true) {
            System.out.print("INCREASING!");
        } else if (DecTest1 == true && DecTest2 == true) {
            System.out.print("DECREASING!");
        } else {
            System.out.print("NEITHER!");
        }

    }
}
