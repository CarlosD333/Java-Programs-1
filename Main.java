package com.CarlosDegollado;

public class Main {

    public static void main(String[] args) {
	    String time1 = "2?:?8";
        String time2 = "06:34";

	    System.out.println(solution(time1));
    }

    public static String solution(String T) {
        String result = "";

        for (int i = 0; i < T.length(); i++) {
            if(T.charAt(i) != '?') {
                result += T.charAt(i);
            }
            if (T.charAt(i) == '?' && i == 0) {
                result += '2';
            }
            if (T.charAt(i) == '?' && i == 1) {
                result += '3';
            }
            if (T.charAt(i) == '?' && i == 3) {
                result += '5';
            }
            if (T.charAt(i) == '?' && i == 4) {
                result += '9';
            }
        }

        return result;
    }
}
