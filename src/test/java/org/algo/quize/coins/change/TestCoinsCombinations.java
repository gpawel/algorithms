package org.algo.quize.coins.change;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoinsCombinations {
    @Test
    public void testFirstCombination() {
        int result = Program.numberOfWaysToMakeChange(6,new int[] {1,5});
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testSecondCombitaions() {
        int result = Program.numberOfWaysToMakeChange(10, new int[] {1,5,10});
        Assertions.assertEquals(4,result);
    }

    @Test
    public void testNumber3() {
        int result = Program.numberOfWaysToMakeChange(25,new int[] {1,5,10});
        Assertions.assertEquals(9,Program.numberOfWaysToMakeChange(25,new int[] {1,5,10}));
    }


}