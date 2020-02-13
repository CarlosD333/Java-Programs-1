package com.CarlosDegollado;

public class Main {

    public static void main(String[] args) {
	    int a = 123;
	    int b = -123;
	    int c = 120;
	    int d = 1534236469;

        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
        System.out.println(reverse(d));
    }

    public static int reverse(int x) {
        int result = 0;
        int dig = 0;

        do {
            if(result > Integer.MAX_VALUE) {
                return 0;
            }
            dig = x % 10;
            result += dig;
            x /= 10;
            if (x != 0) {
                result *= 10;
            }
        } while(x != 0);

        return result;
    }
}
