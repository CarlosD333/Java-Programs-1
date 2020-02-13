package com.carlosdegollado;

public class Solution {

    static int solution(Integer[] loads) {


        int arraySum = 0;
        int[] clone = new int[loads.length];
        System.out.print("Clone is {");
        for (int i = 0; i < loads.length; i++) {
            clone[i] = loads[i];
            arraySum += clone[i];
            System.out.print(clone[i] + ", ");
        }
        System.out.println("}");
//
//        System.out.println("ArraySum is " + arraySum); //test
//
        int sum1 = 0;
        int sum2 = 0;
        int diff = arraySum;
        int compareDiff = 0;
//        int stop1 = 1;
//        int stop2 = 1;
//
        int[] server1 = new int[loads.length];
        int[] server2 = new int[loads.length];
//
//        //first set
//        while (stop1 != loads.length) {
//            for (int outer = 0; outer < stop1; outer++) {
//                server1[outer] = loads[outer];
//            }
//            for (int inner = stop2; inner < clone.length; inner++) {
//                server2[inner] = loads[inner];
//            }
//
//            //adjust index points
//            stop1++;
//            stop2++;
//
//            System.out.print("Server 1 is {"); //test
//            for (int x = 0; x < server1.length; x++) { //test
//                System.out.print(server1[x] + ", "); //test
//            } //test
//            System.out.println("}"); //test
//
//            System.out.print("Server 2 is {"); //test
//            for (int y = 0; y < server2.length; y++) { //test
//                System.out.print(server2[y] + ", "); //test
//            } //test
//            System.out.println("}"); //test
//
//            //sums
//            for (int i = 0; i < server1.length; i++) {
//                sum1 += server1[i];
//            }
//            for (int i = 0; i < server2.length; i++) {
//                sum2 += server2[i];
//            }
//
//            System.out.println("sum 1 is " + sum1); //test
//            System.out.println("sum 2 is " + sum2); //test
//
//            //subtraction
//            if (sum1 <= sum2) {
//                compareDiff = sum2 - sum1;
//            } else {
//                compareDiff = sum1 - sum2;
//            }
//
//            System.out.println("CompareDiff is " + compareDiff); //test
//
//            //diff replace
//            if (compareDiff < diff) {
//                diff = compareDiff;
//            }
//
//            System.out.println("Diff is " + diff); //test
//
//            //reset
//            server1 = new int[loads.length];
//            server2 = new int[loads.length];
//            sum1 = 0;
//            sum2 = 0;
//        }


            //second set
//            arraySum = 0;
//            clone = new int[loads.length];
//            for (int i = 0; i < loads.length; i++) {
//                clone[i] = loads[i];
//                arraySum += clone[i];
//            }
//
//            System.out.println("ArraySum is " + arraySum); //test
//
            sum1 = 0;
            sum2 = 0;
            compareDiff = 0;
            int min = 1001;
            int change = 1;
            int nextMin = 1001;

            server1 = new int[loads.length];
            server2 = new int[loads.length];


            for (int i = 0; i < clone.length; i++) {

                for (int y = 0; y < clone.length; y++) {
                    if (clone[y] < nextMin && clone[y] != 0) {
                        nextMin = clone[y];
                        System.out.println("nextMin is " + nextMin);
                    }
                }

                if (clone[i] >= 0 && change == 1) {
                    min = clone[i];
                    server1[i] = clone[i];
                    System.out.println("server 1[" + i + "} is " + server1[i]);
                    sum1 += clone[i];
                    clone[i] = 0;
                    change = 2;
                } else if (clone[i] >= 0 && change == 2) {
                    min = clone[i];
                    server2[i] = clone[i];
                    System.out.println("server 2[" + i + "] is " + server2[i]);
                    sum2 += clone[i];
                    clone[i] = 0;
                    change = 1;
                }

            }

        System.out.print("clone is {"); //test
        for (int x = 0; x < clone.length; x++) { //test
            System.out.print(clone[x] + ", "); //test
        } //test
        System.out.println("}"); //test

                System.out.print("Server 1 is {"); //test
                for (int x = 0; x < server1.length; x++) { //test
                    System.out.print(server1[x] + ", "); //test
                } //test
                System.out.println("}"); //test

                System.out.print("Server 2 is {"); //test
                for (int y = 0; y < server2.length; y++) { //test
                    System.out.print(server2[y] + ", "); //test
                } //test
                System.out.println("}"); //test

                //sums
                for (int i = 0; i < server1.length; i++) {
                    sum1 += server1[i];
                }
                for (int i = 0; i < server2.length; i++) {
                    sum2 += server2[i];
                }

                System.out.println("sum 1 is " + sum1); //test
                System.out.println("sum 2 is " + sum2); //test

                //subtraction
                if (sum1 <= sum2) {
                    compareDiff = sum2 - sum1;
                } else {
                    compareDiff = sum1 - sum2;
                }

                System.out.println("CompareDiff is " + compareDiff); //test

                //diff replace
                if (compareDiff < diff) {
                    diff = compareDiff;
                }

                System.out.println("Diff is " + diff); //test

                //reset
                server1 = new int[loads.length];
                server2 = new int[loads.length];
                sum1 = 0;
                sum2 = 0;


                return diff;

    }
}