package com.CarlosDegollado;

public class SeperateDuplicateChars {

    public static void main(String[] args) {

      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));

    }

    public static String seperateDuplicatesChars(String str)
    {
        String result = "";
        str = str + " ";
        int length = str.length();
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            result += str.charAt(i);

            if (str.charAt(i) == str.charAt(i+1)) {
                result += "-";
            }
        }

        return result;
    }
}
