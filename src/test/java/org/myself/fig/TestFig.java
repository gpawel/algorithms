package org.myself.fig;

import org.junit.jupiter.api.Test;
import org.myself.fib.Fibanacci;

import java.util.Arrays;

public class TestFig {
    @Test
    public void testFib15() {
        System.out.println(Arrays.toString(Fibanacci.fib(15)));
    }
}
