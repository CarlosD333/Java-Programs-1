package com.CarlosDegollado;

public class Problem12 {
    public static void main(String[] args) {
        String s1 = "depreciation";
        System.out.println(firstNonRepeated(s1));
        String s2 = "abbreviation";
        System.out.println(firstNonRepeated(s2));
        String s3 = "RRttuuVV";
        System.out.println(firstNonRepeated(s3));
    }

    public static char firstNonRepeated(String s1) {
        char result = '@';
        String clone = s1;
        char letter;
        String sLetter = "";
        int length;

        for (int i = 0; i < s1.length(); i++) {
            letter = s1.charAt(i);
            sLetter += letter;
            length = clone.length();

            clone = clone.replace(sLetter, "");

            if (clone.length() == length - 1) {
                return letter;
            }
            sLetter = "";
        }

        return result;
    }
}
