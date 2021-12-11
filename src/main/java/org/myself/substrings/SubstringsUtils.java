package org.myself.substrings;

import java.util.*;

public class SubstringsUtils {
    private static ArrayList<String> uniqueSubStrings = new ArrayList<>();

    public static ArrayList<String> getUniqueSet(String input) {
        ArrayList<String> internal = new ArrayList<>();
        for (int i=0; i<input.length();i++) {
            for (int j=i+1; j<=input.length(); j++) {
                String sub = input.substring(i,j);
                internal = splitStrig(sub);
                for (String t: internal) {
                    if (uniqueSubStrings.contains(t)) continue;
                    uniqueSubStrings.add(t);
                }
            }
        }
        return uniqueSubStrings;
    }



    private static ArrayList<String> splitStrig(String s) {
        ArrayList<String> output = new ArrayList<>();
        for (int i=0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                if (output.contains(sub)) return splitStrig(sub);
                output.add(sub);
            }
        }
        return output;
    }



}
