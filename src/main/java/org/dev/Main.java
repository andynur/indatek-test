package org.dev;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("INDATEK.ID BACKEND TEST");
        System.out.println("------------------------");

        // Testing Balanced Brackets
        System.out.println("Balanced Brackets Test Cases:");
        String example1 = "{ [ ( ) ] }";
        String example2 = "{ [ ( ] ) }";
        String example3 = "{ ( ( [ ] ) [ ] ) [ ] }";
        System.out.println(example1 + " -> " + BalancedBrackets.isBalanced(example1)); // Output: YES
        System.out.println(example2 + " -> " + BalancedBrackets.isBalanced(example2)); // Output: NO
        System.out.println(example3 + " -> " + BalancedBrackets.isBalanced(example3)); // Output: YES

        // Testing Highest Palindrome
        System.out.println("\nHighest Palindrome Test Cases:");
        String s1 = "3943";
        int k1 = 1;
        System.out.println(s1 + " with k=" + k1 + " -> " + HighestPalindrome.highestPalindrome(s1, k1)); // Output: 3993

        String s2 = "932239";
        int k2 = 2;
        System.out.println(s2 + " with k=" + k2 + " -> " + HighestPalindrome.highestPalindrome(s2, k2)); // Output: 992299

        // Testing Weighted Strings
        System.out.println("\nWeighted Strings Test Cases:");
        String ws = "abbcccd";
        int[] queries = {1, 3, 9, 8};
        String[] results = WeightedStrings.weightedStrings(ws, queries);
        System.out.println("String: " + ws);
        System.out.print("Queries: " + Arrays.toString(queries) + " -> ");
        System.out.println(Arrays.toString(results)); // Output: [Yes, Yes, Yes, No]
    }
}