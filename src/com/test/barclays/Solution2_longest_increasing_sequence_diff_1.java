package com.test.barclays;
import java.util.Arrays;

public class Solution2_longest_increasing_sequence_diff_1 {

    public int solution(int[] A) {
        int min = 0;
        int prevlength = 0;
        int currLength = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (currLength == 0)
                min = A[i];
            if (A[i] - min < 2) {
                currLength++;
            } else {
                min = A[i];
                if (prevlength < currLength) {
                    prevlength = currLength;
                }
                currLength = 0;
            }
            if (i == A.length - 1 && currLength > prevlength) {
                prevlength = currLength;
            }
        }
        return prevlength;
    }

}
