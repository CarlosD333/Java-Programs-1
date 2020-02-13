package com.CarlosDegollado;

import java.util.concurrent.SubmissionPublisher;

public class Decimals {

    public static void printDecimalDigits(double num) {

        int count = 0;
        String subString = "";

        if (num % 1 != 0) {

            String numString = num + "";
            //System.out.println("numString is " + numString); //test
            int i = numString.indexOf(".");
            subString = numString.substring(i + 1);
        }

        System.out.println("Digits after decimal point: " + subString);
    }
}
