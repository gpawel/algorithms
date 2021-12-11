package org.scotia.quize.arbnumber;


public class Solution {
    private static int MAX = 1000000000;
    public static int getArbitraryNumber(int n) {
        if (n > MAX) throw new RuntimeException("Input number is too big. Try a number less than 10^9");
        return generateNumber(n);
    }

    private static int generateNumber(int n) {
        if ((n % 10) == 0) return n+10;
        if ((n % 5) == 0) return n*2;
        if ((n % 2) == 0) {
            if (n < ((MAX-1)/5)) return n*5;
        }
        if (((n+1) % 10) == 0) return n+1;
        else return generateNumber(n+1);
    }
}
