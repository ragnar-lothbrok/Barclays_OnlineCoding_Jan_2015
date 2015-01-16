package com.test.barclays;
public class Solution1_1swap_inreasing_order_array {
    
    public boolean solution(int[] A) {
        int temp = 0, swapCount = 0;
        boolean result = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] <= A[i + 1]) {
                continue;
            } else {
                if (swapCount == 1) {
                    result = false;
                } else if (i == 0 || (i > 0 && A[i + 1] >= A[i - 1])) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    swapCount++;
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
    
}
