package org.myself.substrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SubstringsUtilsTest {
    @Test
    public void checkSimpleString() {
        String input = "abba";
        Assertions.assertEquals(4,getResult(input).size());
    }

    @Test
    public void checkLongerString() {
        String input = "acbacbacaa";
        Assertions.assertEquals(10,getResult(input).size());
    }

    private ArrayList<String> getResult(String input) {
        //ArrayList<String> out = SubstringsUtils.getAllUniqueSubstrings(input);
        ArrayList<String> out = SubstringsUtils.getUniqueSet(input);
        System.out.println(Arrays.toString(out.toArray(new String[]{})));
        return out;
    }
}
