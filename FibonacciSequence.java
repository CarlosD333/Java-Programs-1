package com.CarlosDegollado;

import java.math.BigInteger;

public class FibonacciSequence {

    public BigInteger findFibonacciTerm(long n) {
        BigInteger term = new BigInteger("0");
        BigInteger prev = new BigInteger("1");
        BigInteger cur = new BigInteger("1");

        if (n == 1) {
            return prev;
        } else if (n == 2) {
            return cur;
        }

        for (int i = 3; i <= n; i++) {
            term = prev.add(cur);
            prev = cur;
            cur = term;
        }

        return term;
    }
}
