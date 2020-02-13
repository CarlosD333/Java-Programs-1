package com.carlosdegollado;

import java.math.BigInteger;
import java.util.Scanner;

public class MakeExponent {
    public static void main(String[] args) {
        numbers();
    }

    public static void numbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        String aString = input.nextLine();

        System.out.print("Enter b: ");
        String bString = input.nextLine();

        Scanner close;

        int bInt = Integer.parseInt(bString);

        BigInteger aBig = new BigInteger(aString);
        BigInteger bBig = new BigInteger(bString);
        BigInteger result = new BigInteger("0");

        result = aBig.pow(bInt);

        System.out.print(aString + " to the power of " + bString +
                        " is " + result);
    }
}
