package org.algo.quize.subsequence;

import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        for (int i = 0; i < array.size(); i++) {
            if (i >= sequence.size()) return false;
            if (sequence.contains(array.get(i))) continue;
            else return false;
        }
        return true;
    }
}
