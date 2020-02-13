package com.carlosdegollado;

public class DisplayDoubles {
    public static void main(String[] args) {
        String s1 = "MMrrrttttyyppppwwqtress";
        System.out.println(displayDoubles(s1));
        String s2 = "wreQQppppprrbnmggOO";
        System.out.println(displayDoubles(s2));
        String s3 = "Tqderpbzxc";
        System.out.println(displayDoubles(s3));
    }

    public static String displayDoubles(String s1) {
        String result = "";
        char letter;
        String letterStr = "";
        String letterDub = "";
        int count = 0;
        String temp = s1;

        for (int i = 0; i < s1.length(); i++) {
            letter = s1.charAt(i);
            letterStr += letter;
            temp = temp.replace(letterStr, "1");

            if (temp.matches("1[^1]+11[^1]*")) {
                temp = temp.replace("1", letterStr);
                continue;
            }
            if (temp.matches("11[^1]*")) {
                result += letterStr;
                count++;
            }
            if (count == 0 && temp.length() == 1) {
                return s1;
            }
            temp = temp.replace("1", "");
            letterStr = "";
        }

        return result;
    }
}
