package com.CarlosDegollado;

public class Main {

    public static void main(String[] args) {

        int a = 121;
        int b = -121;

        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;

        String numString = x + "";
        int j = numString.length() -1;

        for(int i = 0; i < numString.length(); i++) {
            if(numString.charAt(i) != numString.charAt(j)) {
                System.out.println("num[" + i + "] is " + numString.charAt(i));
                System.out.println("num[" + j + "] is " + numString.charAt(j));
                return false;
            }
            j--;
        }

        return result;
    }
}
