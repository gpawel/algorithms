package org.scotia.quize.arbnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArbNumber {
    @Test
    public void testWithMinNumber() {
        Assertions.assertEquals(10,Solution.getArbitraryNumber(1));
    }
    @Test
    public void testWithBigNumbers() {
        Assertions.assertEquals(1000000010,Solution.getArbitraryNumber(1000000000));
        Assertions.assertEquals(1000000000,Solution.getArbitraryNumber(999999999));
    }
    @Test
    public void testWithEvenNumber() {
        Assertions.assertEquals(440,Solution.getArbitraryNumber(88));
        Assertions.assertEquals(1111111110,Solution.getArbitraryNumber(555555554));
        Assertions.assertEquals(1000000000,Solution.getArbitraryNumber(999999998));
    }
    @Test
    public void testWithOddNumbers() {
        Assertions.assertEquals(110,Solution.getArbitraryNumber(21));
    }
 }
