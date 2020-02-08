package com.company;

import java.math.BigInteger;

public class Problem2 {

    public static int indexOfHighestProduct(double[][] arr) {

        int index = 0;
        double result = 1;
        double prod = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                prod *= arr[row][col];
            }

            if (result > prod) {
                index = row;
            }

            result = prod;
            prod = 1;
        }

        return index;
    }

    public static int indexOfHighestProduct(int[][] arr) {

        int index = 0;
        int result = 1;
        int prod = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                prod *= arr[row][col];
            }

            if (result > prod) {
                index = row;
            }

            result = prod;
            prod = 1;
        }

        return index;
    }

    public static void multy(int[][] arr) {

        BigInteger result = new BigInteger(1 + "");
        long num = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (num < 1) {
                    num = arr[row][col];
                } else {
                    //num *= 10;
                    num += arr[row][col];
                    System.out.println("num is: " + num);
                }

                //result *= num;
                //System.out.println("result is: " + result);
            }

            BigInteger numBig = new BigInteger(num + "");

            result = result.multiply(numBig);
            System.out.println("result is: " + result);

            num = 0;
            System.out.println("end num is: " + num);
        }

        System.out.println(result);
    }
}
