package com.CarlosDegollado;

public class RepeatChars {

    public static void main(String[] args)
    {
        System.out.println(repeatChars("easy!!"));
        System.out.println(repeatChars("abc"));
        System.out.println(repeatChars("apple7"));
        System.out.println(repeatChars("Homework"));
        System.out.println(repeatChars("Integer"));

    }
    public static String repeatChars(String x)
    {
        //create empty result string
        String result = "";
        //create empty letter string to store vowels
        String letter = "";

        //x string loop
        for (int i = 0; i < x.length(); i++) {
            //letter char to string
            letter += x.charAt(i);
            //letter duplicator
            result += letter;
            result += letter;

            //checks if letter is vowel to add another letter to result
            if (letter.matches("[^aAeEiIoOuU]")) {
                result += x.charAt(i);
            }

            //letter string reset
            letter = "";
        }

        //final return
        return result;
    }
}
