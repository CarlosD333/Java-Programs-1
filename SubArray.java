package com.carlosdegollado;

public class SubArray {
    public static void main(String[] args) {
        String s1 = "7, -2, -5, 2, 3, -2, -2, 4";
        subArray(s1);

        String s2 = "4, 0, 3, -3, 0, 0, 1, -1";
        subArray(s2);
    }

    public static void subArray(String str) {
        String temp = str.replace(", ", " , ");
        //System.out.println(temp);
        String[] tempArr = temp.split(" ");
        int[] ints = new int[tempArr.length];

        for (int i = 0; i < ints.length; i++) {
            if (tempArr[i].matches("-.*")) {
                tempArr[i] = tempArr[i].replace("-", "");
                ints[i] = Integer.parseInt(tempArr[i]);
                ints[i] *= -1;
                System.out.println("int is: " + ints[i]);
            } else {
                ints[i] = Integer.parseInt(tempArr[i]);
                System.out.println("int is: " + ints[i]);
            }
        }
    }
}
