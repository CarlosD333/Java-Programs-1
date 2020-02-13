package com.carlosdegollado;

public class Solution {
    static int solution(int[] A) {

        int high = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > high) {
                high = A[i];
                count++;
            }
        }

        return count;
    }
}
