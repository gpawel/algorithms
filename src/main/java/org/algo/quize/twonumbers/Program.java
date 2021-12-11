package org.algo.quize.twonumbers;

import java.util.*;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i=0; i < array.length-1; i++) {
            for (int j=i+1; j  < array.length; j++) {
                if (compare(array[i], array[j], targetSum)) {
                    return new int[] {array[i],array[j]};
                }
            }
        }
        return new int[0];
    }

    private static boolean compare(int a, int b, int targetSum) {
        return (a+b) == targetSum;
    }
}