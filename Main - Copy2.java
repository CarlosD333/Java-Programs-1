package com.CarlosDegollado;

public class Main {

    public static void main(String[] args) {
	    String myString = "12345";

//	    int a = 100;
//        System.out.println(myString + a);
//
//        int b = Integer.parseInt(myString);
//        System.out.println("The value of b is: " + b + " and the value of " +
//                "a + b is: " + (a + b));

//        double c = Double.parseDouble(myString);
//        Double b = Double.parseDouble(myString);

        String qbf = "The quick brown fox jumped over the lazy dog";

        if (qbf.contains("quicks")) {
            System.out.println("word quick found!");
        } else {
            System.out.println("word quick not found!");
        }
    }
}
