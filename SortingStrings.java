package com.CarlosDegollado;

public class SortingStrings {

    public static void sortingWords(String str) {

        String originalCharString = "";
        String[] storedValues = new String[str.length()];


        for (int i = 0; i < str.length(); i++) {
            originalCharString += str.charAt(i);
            if (str.charAt(i) )
            storedValues[i] = str.charAt(i) + "";
        }
        System.out.println("originalCharString is : " + originalCharString);

        String[] originalCharArray = originalCharString.split("[.]");

        for (int i = 0; i < originalCharString.length(); i++) {
            System.out.println(storedValues[i]);
//            if (originalCharString[i].matches("[A-Z]")) {
//                storedValues[i] = originalCharArray[i];
//                System.out.println("Stored Value is " + storedValues[i]);
//            }
        }

        String temp = str.replaceAll("[A-Z]", ".");
        System.out.println(temp);
        String[] tempArray = temp.split("[.]");

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i].equals(".")) {
                tempArray[i] = storedValues[i];
            }
        }

        for (int i = 0; i < tempArray.length; i++) {
            System.out.print(tempArray[i]);
        }

    }
}
