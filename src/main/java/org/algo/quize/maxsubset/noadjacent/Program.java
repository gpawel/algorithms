package org.algo.quize.maxsubset.noadjacent;

import java.util.*;
// s1 = current
// current = max(s1, s2+array[i]

class Program {
    public static int maxSubsetSumNoAdjacent(int[] a) {
        if (a.length == 0) return 0;
        return f(a,a.length-1);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int f(int[] a, int n) {
        if (n == 0) return a[0];
        if (n == 1) return max(a[0], a[1]);

        int s1 = f(a,n-1);
        int s2 = f(a,n-2) + a[n];
        return max (s1,s2);
    }


}
