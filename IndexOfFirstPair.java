package com.carlosdegollado;

public class IndexOfFirstPair {
    public static void main(String[] args) {
        String test1 = "AAAyyyoooopppprrtttttqqsw";
        System.out.println(indexOfFirstPair(test1));
        String test2 = "banaaaaana";
        System.out.println(indexOfFirstPair(test2));
        String test3 = "cucuuuuuuuummbber";
        System.out.println(indexOfFirstPair(test3));
        String test4 = "mammamma";
        System.out.println(indexOfFirstPair(test4));
    }

    public static int indexOfFirstPair(String s) {
        int result = -1;
        char letter1;
        char letter2;
        char letter3;
        char letter4;

        for (int i = 0; i < s.length()-3; i++) {
            letter1 = s.charAt(i);
            letter2 = s.charAt(i+1);
            letter3 = s.charAt(i+2);
            letter4 = s.charAt(i+3);

            if (letter2 == letter3) {
                if(letter2 != letter4) {
                    if (letter1 != letter2) {
                        return i+1;
                    }
                }
            }
        }

        return result;
    }
}
