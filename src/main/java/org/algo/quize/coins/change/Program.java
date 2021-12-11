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
    static ArrayList<Combination> combination = new ArrayList<>();
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {

        Arrays.sort(denoms);
        if (denoms[0] > n) throw new RuntimeException("input is invalid");
        for (int i = 0; i < denoms.length; i++) {
            combination.add(searchCombinations(n, denoms, i));
        }
        printCombinations(combination);
        return combination.size();
    }

    private static Combination searchCombination(int n, int[] denoms, int currentCoinIndex) {
        deepness++;
        Combination comb = new Combination();
        int coin = denoms[currentCoinIndex];
        int reminder = n % coin;
        int wholePart = n / coin;
        if (reminder == 0) {
            if
        }
        else {
            if (currentCoinIndex > 0) {

            }
            else {

            }
        }
        deepness--;
    }

    private static Combination searchCombinations1(int n, int[] denoms, int currentCoinIndex, ArrayList<Combination> combinations) {
        deepness++;
        Combination comb = new Combination();
        int coin = denoms[currentCoinIndex];
        int reminder = n % coin;
        int wholePart = n / coin;
        ArrayList<int[]> x;
        comb.addPortion(new int[]{coin, wholePart});
        if (currentCoinIndex > 0) currentCoinIndex--;
        else {
            if (reminder > 0) throw new RuntimeException("Unable to get " + n + " by given coins representation");
            return comb;
        }
        if (reminder == 0) {
            for (int k = 1; k <= wholePart - 1; k++) {
                ArrayList<int[]> y = new ArrayList<>();
                y.add(new int[]{coin, k});
                y.addAll(searchCombinations(n - k * coin, denoms, currentCoinIndex, combinations));
                combinations.add(y);
            }
        }


        }
        deepness--;
        return comb;
    }


    private static void printCombinations(ArrayList<Combination> comb) {
        StringBuilder b = new StringBuilder();
        comb.stream().forEach(c -> {
            b.append(c.toString());
        });
        System.out.println(b.toString());
    }


}