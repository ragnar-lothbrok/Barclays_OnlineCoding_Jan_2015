package com.test.barclays;
import java.util.Arrays;

public class Solution2_longest_increasing_sequence_diff_1 {

    public int solution(int[] A) {
        int length = 0;
        Arrays.sort(A);
        String uniqueValueIndexes = null;
        if (A.length == 1)
            return 1;
        uniqueValueIndexes = "0";
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                uniqueValueIndexes = uniqueValueIndexes + "," + i + "";
                if (i == A.length - 2)
                    uniqueValueIndexes = uniqueValueIndexes + "," + i + "";
            }
        }

        String[] tokens = uniqueValueIndexes.split(",");
        if (tokens.length == 1)
            length = tokens.length;

        System.out.println(uniqueValueIndexes);

        for (int i = 0; i < tokens.length - 1; i++) {
            int temp = 0;
            if (A[Integer.parseInt(tokens[i + 1])] - A[Integer.parseInt(tokens[i])] < 2) {
                if (tokens.length > i + 2) {
                    temp = Integer.parseInt(tokens[i + 2]) - Integer.parseInt(tokens[i]);
                } else {
                    temp = A.length - Integer.parseInt(tokens[i]);
                }
            } else {
                temp = Integer.parseInt(tokens[i + 1]) - Integer.parseInt(tokens[i]);
            }
            if (length < temp)
                length = temp;
        }
        return length;
    }

}
