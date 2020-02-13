package com.carlosdegollado;

public class Problem17 {
    public static void main(String[] args) {
        String s1 = "North";
        String s2 = "Eastern";
        String s3 = "Illinois";
        String s4 = "University";

        System.out.println(createAcronim(s1, s2, s3, s4));
    }

    public static String createAcronim(String s1, String s2,
                                    String s3, String s4) {
        String result = "";

        result += s1.charAt(0);
        result += s2.charAt(0);
        result += s3.charAt(0);
        result += s4.charAt(0);

        return result;
    }
}
