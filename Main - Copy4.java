package com.CarlosDegollado;

public class Main {

    public static void main(String[] args)
    {

        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));


    }
    public static boolean isExactReverse(String x, String y)
    {
        boolean result = false;

        if (x.length() == y.length()) {

            int same = 0;
            int count = 0;
            int reverse = y.length() - 1;

            while (count <= y.length() - 1) {
                if (x.charAt(count) == y.charAt(reverse)) {
                    same++;
                }

                reverse--;
                count++;
            }

            if (same == count) {
                result = true;
            }
        }

        return result;
    }
}
