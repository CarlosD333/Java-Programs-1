package com.carlosdegollado;

public class AllTriples {

    public static void main(String[] args) {
	    String str1 = "moommo"; //true
        System.out.println(allTriples(str1));
	    String str2 = "bbbac"; //false
        System.out.println(allTriples(str2));
	    String str3 = "abcccbaab"; //true
        System.out.println(allTriples(str3));
	    String str4 = "bbbrrrr"; //false
        System.out.println(allTriples(str4));
        String str5 = "abcbcacab"; //true
        System.out.println(allTriples(str5));
        String str6 = "abcbcacabc"; //false
        System.out.println(allTriples(str6));
        String str7 = "abcbcacabggg"; //true
        System.out.println(allTriples(str7));
        String str8 = "abcbcacabgggg"; //false
        System.out.println(allTriples(str8));
    }

    public static boolean allTriples(String str) {
        boolean result = false;
        boolean regs = false;
        String temp = str;
        char letter = 'x';
        String letterString = "";

        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            letterString += letter;

            temp = temp.replace(letterString, "1");

            regs = temp.matches(".*1{1}.*1{1}.*1{1}.*");

            if (regs && temp.length() == 3) {
                return true;
            }

            temp = temp.replace("1", "");
            letterString = "";
        }

        return result;
    }
}
