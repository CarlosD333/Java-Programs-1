package com.CarlosDegollado;

public class Main {

    public static void main(String[] args)
    {

      String s1 = "123";
      String s2 = "16.95";
      String s3 = "123G";
      String s4 = "-795";
      String s5 = "1M23";
      String s6 = "NEIU";
		System.out.println(s1 + " is a valid integer? " + hasOnlyDigits(s1));
      System.out.println(s2 + " is a valid integer? " + hasOnlyDigits(s2));
      System.out.println(s3 + " is a valid integer? " + hasOnlyDigits(s3));
      System.out.println(s4 + " is a valid integer? " + hasOnlyDigits(s4));
      System.out.println(s5 + " is a valid integer? " + hasOnlyDigits(s5));
      System.out.println(s6 + " is a valid integer? " + hasOnlyDigits(s6));

    }

    public static boolean hasOnlyDigits(String s)
    {
        //returns true if '-' zero or more times and digits one or more times
        boolean result = s.matches("-*[0-9]+");

        //final return
        return result;
    }
}
