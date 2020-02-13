package com.carlosdegollado;

public class SumOfDiagonals {
    public static void main(String[] args)
    {

        String[][] s1 = {{"2", "3", "4"},
                         {"5", "6", "7"},
                         {"8", "9", "10"}};

        String[][] s2 = {{"1", "2", "3"},
                         {"5", "6", "7"},
                        {"9", "10", "11"},
                       {"13", "14", "15"}};

        String[][] s3 = {{"1", "2", "3", "4"},
                         {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                       {"13", "14", "15", "pp"}};

        String[][] s4 = {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};

        try
        {
            sumOfDiagonals(s1);
            sumOfDiagonals(s2);
            sumOfDiagonals(s3);
            sumOfDiagonals(s4);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Not a valid integer");
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Array not a square");
        }
    }

    public static void sumOfDiagonals(String[][] x)
    {
        int num;
        int count = 0;
        int sum = 0;

            if(x.length != x[0].length) {
                    throw new IllegalArgumentException();
                }

            for (int outer = 0; outer < x.length; outer++) {
                for (int inner = 0; inner < x[outer].length; inner++) {
                    num = Integer.parseInt(x[outer][inner]);
                    if (count == inner) {
                        sum += num;
                    }

                }
                count++;
            }

        System.out.println(sum);
    }
}
