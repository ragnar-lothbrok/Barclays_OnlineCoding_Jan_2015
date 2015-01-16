package com.test.barclays;
public class Solution3_heads_tails_adjacency {

    public int solution(int[] A) {
        boolean spAdjPowerBy2 = false, spAdjPowerBy1 = false;
        int totalAdj = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                totalAdj++;
            }
            if (i < A.length - 2 && A[i] == A[i + 2] && A[i] != A[i + 1] && !spAdjPowerBy2) {
                spAdjPowerBy2 = true;
            } else if (i == A.length - 2 && A[i] != A[i + 1] && !spAdjPowerBy1) {
                spAdjPowerBy1 = true;
            } else if (i == 0 && A.length > 1 && A[i] != A[i + 1] && !spAdjPowerBy1) {
                spAdjPowerBy1 = true;
            }
        }
        totalAdj = totalAdj + ((spAdjPowerBy2) ? 2 : (spAdjPowerBy1 ? 1 : 0));
        return totalAdj;
    }

}
