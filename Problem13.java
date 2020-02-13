package com.CarlosDegollado;

public class Problem13 {
    public static void main(String[] args) {
        String s1 = "0, 2, 1, 0, 0, 1, 0";
        System.out.println(order(s1));
        String s2 = "0, 1, 1, 2, 0, 1, 1, 2, 0, 2";
        System.out.println(order(s2));
    }

    public static String order(String str) {
        String result = "";
        String tempStr = str.replace(", ", "");
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";

        temp1 = tempStr.replace("2", "");
        temp1 = temp1.replace("1", "");
        result += temp1;
        temp2 = tempStr.replace("0", "");
        temp2 = temp2.replace("2", "");
        result += temp2;
        temp3 = tempStr.replace("0", "");
        temp3 = temp3.replace("1", "");
        result += temp3;


        return result;
    }
}
