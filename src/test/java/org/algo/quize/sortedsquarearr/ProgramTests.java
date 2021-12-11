package org.algo.quize.sortedsquarearr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProgramTests {
    @Test
    public void testOne() {
        int[] input = new int[] {1,2,3,4,5,6,7,8,9};
        int[] expect = new int[] {1,4,9,16,25,36,49,64,81};
        Program p = new Program();
        int[] actual = p.sortedSquaredArray(input);
        Assertions.assertEquals(expect.length,actual.length);
        Assertions.assertEquals(expect[0],actual[0]);
        Assertions.assertEquals(expect[expect.length-1],actual[actual.length-1]);
        System.out.println(Arrays.toString(actual));
    }
}
