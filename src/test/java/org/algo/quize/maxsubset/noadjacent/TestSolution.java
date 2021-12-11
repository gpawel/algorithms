package org.algo.quize.maxsubset.noadjacent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void testSimpleCase() {
        int[] arr = new int[] {7,10,12,7,9,14};
        Assertions.assertEquals(33,Program.maxSubsetSumNoAdjacent(arr));
    }

    @Test
    public void testShortCase() {
        int[] arr = new int[] {10,1,2,100,4};
        Assertions.assertEquals(110,Program.maxSubsetSumNoAdjacent(arr));
    }
}
