package org.algo.quize.sortedsquarearr;

import java.util.Arrays;

class Program {

    public int[] sortedSquaredArray(int[] array) {
        int [] out = new int [array.length];
        for (int i=0; i < array.length; i++) {
            out[i] = array[i]*array[i];
        }
        Arrays.sort(out);
        return out;
    }
}
