package com.carlosdegollado;

public class Problem15 {
    public static void main(String[] args) {
        String s1a = "Java is fun";
        String s2a = "Java";
        System.out.println(makeChanges(s1a, s2a));

        String s1b = "Accumulated depreciation";
        String s2b = "depreciation";
        System.out.println(makeChanges(s1b, s2b));
    }

    public static String makeChanges(String s1, String s2) {
        String result = "";

        result = s1.replace(s2, "");

        return result;
    }
}
