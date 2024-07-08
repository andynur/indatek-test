package org.dev;

import java.util.HashSet;
import java.util.Set;

public class WeightedStrings {

    // Method to calculate weights of characters and their substrings
    private static Set<Integer> calculateWeights(String s) {
        Set<Integer> weights = new HashSet<>();
        int n = s.length();
        int i = 0;

        while (i < n) {
            char c = s.charAt(i);
            int charWeight = c - 'a' + 1;
            weights.add(charWeight);

            int count = 1;
            while (i + 1 < n && s.charAt(i + 1) == c) {
                count++;
                weights.add(charWeight * count);
                i++;
            }

            i++;
        }

        return weights;
    }

    // Method to process queries and return the results
    public static String[] weightedStrings(String s, int[] queries) {
        Set<Integer> weights = calculateWeights(s);
        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if (weights.contains(queries[i])) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }

        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        String s = "abbcccd";
        int[] queries = {1, 3, 9, 8};

        String[] results = weightedStrings(s, queries);

        for (String result : results) {
            System.out.println(result);
        }
    }
}

