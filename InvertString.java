package com.CarlosDegollado;

public class InvertString {

    public static void main(String[] args)
    {
        String s1 = "10010111";
        System.out.println("The invert of " + s1 + " is " + invert(s1));
        System.out.println();

        String s2 = "01011010010111010010";
        System.out.println("The invert of " + s2 + " is " + invert(s2));
        System.out.println();

        String s3 = "101";
        System.out.println("The invert of " + s3 + " is " + invert(s3));
        System.out.println();
    }

    public static String invert(String str)
    {
        //create empty result string
        String result = "";

        //store zeros in out of range value
        result = str.replace('0','$');
        //switch 1 with 0 value
        result = result.replace('1','0');
        //bring zero back and switch it to 1
        result = result.replace('$', '1');

        //final return
        return result;
    }
}
