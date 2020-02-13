package com.CarlosDegollado;

public class Main {

    public static void main(String[] args) {
        String b1 = "127.16.254.1";
        String b2 = "1a5.89.-87.bb1";
	    String b3 = "15.35.122.5.99";
	    String b4 = "255.255.0.0";
	    String b5 = "87.04.005.3";
	    String b6 = "256.14.254.3";

        System.out.println(b1.matches("[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*"));
        System.out.println(b2.matches("[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*"));
        System.out.println(b3.matches("[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*"));
        System.out.println(b4.matches("[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*"));
        System.out.println(b5.matches("[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*"));
        System.out.println(b6.matches("[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*\\.{1}[0-9]*"));

        String[] arr1 = b1.split("\\.");
        String[] arr2 = b2.split("\\.");
        String[] arr3 = b3.split("\\.");
        String[] arr4 = b4.split("\\.");
        String[] arr5 = b5.split("\\.");
        String[] arr6 = b6.split("\\.");

        System.out.println();

        boolean result1 = true;

        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("element is " + arr1[i]);
            if(arr1[i].length() == 1 && arr1[i] == "0") {
                result1 = false;
            }
        }

        System.out.println(result1);

        boolean result2 = true;

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i].length() == 1 && arr2[i] == "0") {
                result2 = false;
            }
        }

        System.out.println(result2);

        boolean result3 = true;

        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i].length() == 1 && arr3[i] == "0") {
                result3 = false;
            }
        }

        System.out.println(result3);

        boolean result4 = true;

        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i].length() == 1 && arr4[i] == "0") {
                result4 = false;
            }
        }

        System.out.println(result4);

        boolean result5 = true;

        for (int i = 0; i < arr5.length; i++) {
            System.out.println("element is " + arr5[i]);
            int val = Integer.valueOf(arr5[i]);

            if(arr5[i].length() > 1 && arr5[i].matches(".*0{1}.*") || val > 255) {
                result5 = false;
            }
        }

        System.out.println(result5);

        boolean result6 = true;

        for (int i = 0; i < arr6.length; i++) {
//            System.out.println("str is " + arr6[i]);
            int val = Integer.valueOf(arr6[i]);

            if(arr6[i].length() > 1 && arr6[i].matches(".*0{1}.*") || val > 255) {
                result6 = false;
            }
        }

        System.out.println(result6);

    }
}
