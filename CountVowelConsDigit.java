package com.carlosdegollado;

public class CountVowelConsDigit {
    public static void main(String[] args) {
        String s1 = "JTuireoqw4ptyqss4";
        countVCD(s1);

        String s2 = "uywqgh70oqw4p98nmj";
        countVCD(s2);
    }

    public static void countVCD(String str) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        String temp = str.toLowerCase();

        temp = temp.replaceAll("[^aeiou]", "");
        temp = temp.replaceAll("[0-9]", "");
        vowels = temp.length();

        temp = str.toLowerCase();

        temp = temp.replaceAll("[aeiou]", "");
        temp = temp.replaceAll("[0-9]", "");
        consonants = temp.length();

        temp = str.toLowerCase();

        temp = temp.replaceAll("[a-z]", "");
        digits = temp.length();


        System.out.println("Number of vowels: " + vowels +
                "\nNumber of consonants: " + consonants +
                "\nNumber of digits: " + digits + "\n");
    }
}
