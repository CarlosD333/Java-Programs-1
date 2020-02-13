package com.CarlosDegollado;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	    int a = 312;
	    int b = 1234;
	    int c = -420;
	    int d = 1534236469;
	    int e = 123;

	    System.out.print(reverse(b));
    }

    public static int reverse(int x) {
        int tempNum = 0;

        if (x < 0) {
            tempNum = x * - 1;
        } else {
            tempNum = x;
        }

        int result = 0;
        long longResult = 0;

        while(tempNum > 0) {
            longResult += tempNum % 10;
            tempNum /= 10;

            if (tempNum != 0) {
                longResult *= 10;
            }

            if (longResult > Integer.MAX_VALUE) {
                return 0;
            }
        }

        if (x < 0) {
            longResult *= - 1;
        }

        result += longResult;
        return result;
    }
}
