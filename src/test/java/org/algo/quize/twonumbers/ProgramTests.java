package org.algo.quize.twonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProgramTests {
    @Test
    public void testTwoNumbers_array_and_target_exists() {
        int arr[] = {-3,-2,-1,0,1,2,3};
        int target = 5;
        int output[] = Program.twoNumberSum(arr,target);
        Assertions.assertTrue (output.length == 2);
        Assertions.assertEquals(output[0],2);
        Assertions.assertEquals(output[1],3);
        System.out.println(Arrays.toString(output));
    }
    @Test
    public void testTwoNumbers_array_and_target_does_not_exists() {
        int arr[] = {-3,-2,-1,0,1,2,3};
        int target = 50;
        int output[] = Program.twoNumberSum(arr,target);
        Assertions.assertTrue (output.length == 0);
        System.out.println(Arrays.toString(output));
    }
}
