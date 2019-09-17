package com.CarlosDegollado;

import java.math.BigInteger;

 public class Passwords {

    public BigInteger possiblePINs(int x) {

        BigInteger prod = new BigInteger("1");
        BigInteger ten = new BigInteger("10");

        for (int i = 1; i <= x; i++) {

            prod = prod.multiply(ten);
        }

        return prod;
    }

    public BigInteger possiblePasswords(int y) {

        BigInteger prod = new BigInteger("1");
        BigInteger twentySix = new BigInteger("26");

        for (int i = 1; i <= y; i++) {

            prod = prod.multiply(twentySix);
        }

        return prod;

    }
}
