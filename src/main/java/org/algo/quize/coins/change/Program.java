package org.algo.quize.coins.change;

import java.util.*;

class Program {
    private static class Combination {
        private ArrayList<int[]> combination;

        public Combination() {
            combination = new ArrayList<>();
        }

        public Combination(int[] portion) {
            this();
            checkPortion(portion);
            combination.add(portion);
        }

        public void addPortion(int[] portion) {
            checkPortion(portion);
            combination.add(portion);
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int[] p : combination) {
                builder.append("<" + p[0] + "*" + p[1] + "> ");
            }
            builder.append("\n");
            return builder.toString();
        }

        private void checkPortion(int[] portion) {
            if (portion.length != 2) throw new RuntimeException("A combination may contain only arrays of length 2");
        }
    }

    static int deepness = 0;
    static ArrayList<Combination> combinations = new ArrayList<>();
    static Combination comb;
    Combination comb = new Combination();
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {

        Arrays.sort(denoms);
        if (denoms[0] > n) throw new RuntimeException("input is invalid");
        for (int i = 0; i < denoms.length; i++) {
            comb = new Combination();
            searchCombinations(n,denoms, i);
            combinations.add(comb);
        }
        printCombinations(combinations);
        return combinations.size();
    }

    private static int[] searchCombinations(int n, int[] denoms, int currentCoinIndex) {
        deepness++;

        int coin = denoms[currentCoinIndex];
        int reminder = n % coin;
        int wholePart = n / coin;
        if (reminder == 0) {
            if (currentCoinIndex > 0 ) {
                for (int k=1; k<wholePart; k++) {
                    comb.addPortion(searchCombinations(n-k*coin, denoms,currentCoinIndex-1));
                }
            }
        }
        else {
            if (currentCoinIndex > 0) {
                comb.addPortion(searchCombinations(reminder,denoms,currentCoinIndex-1));
            }
            else {
                throw new RuntimeException("Cannot build coins combination");
            }
        }
        return new int[] {coin,wholePart}
        deepness--;
    }




    private static void printCombinations(ArrayList<Combination> comb) {
        StringBuilder b = new StringBuilder();
        comb.stream().forEach(c -> {
            b.append(c.toString());
        });
        System.out.println(b.toString());
    }


}