package com.home.random;
import java.util.Arrays;

public class Solution_can_triangle_formed {

    public int solution1(int[] A) {
        if (null == A || A.length < 3)
            return 0;
        Arrays.sort(A);
        long sumOfSides = 0;
        for (int i = 0; i < A.length - 2 && A[i] > 0; i++) {
            sumOfSides = (long) A[i] + A[i + 1];
            if (sumOfSides > A[i + 2])
                return 1;
        }
        return 0;
    }

    
}
