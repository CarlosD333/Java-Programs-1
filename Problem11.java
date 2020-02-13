package com.CarlosDegollado;

public class Problem11 {
    public static void main(String[] args) {
        String s1a = "apple";
        String s1b = "elppa";
        System.out.println(areTheyReversed(s1a, s1b));
        String s2a = "map";
        String s2b = "mapp";
        System.out.println(areTheyReversed(s2a, s2b));
        String s3a = "carlos";
        String s3b = "solrac";
        System.out.println(areTheyReversed(s3a, s3b));
    }
    public static boolean areTheyReversed(String s1, String s2) {
        boolean result = false;
        int back = s1.length()-1;

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(back)) {
                result = true;
            }
        }

        return result;
    }
}
