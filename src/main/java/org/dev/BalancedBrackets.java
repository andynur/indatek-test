package org.dev;
import java.util.Stack;

public class BalancedBrackets {

    // Method to determine if the brackets are balanced
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket, check if it matches the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty or the brackets do not match, return "NO"
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return "NO";
                }
            }
        }

        // If the stack is empty at the end, the brackets are balanced
        return stack.isEmpty() ? "YES" : "NO";
    }

    // Helper method to check if the brackets are matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Main method to test the function
    public static void main(String[] args) {
        String example1 = "{ [ ( ) ] }";
        String example2 = "{ [ ( ] ) }";
        String example3 = "{ ( ( [ ] ) [ ] ) [ ] }";

        System.out.println(isBalanced(example1)); // Output: YES
        System.out.println(isBalanced(example2)); // Output: NO
        System.out.println(isBalanced(example3)); // Output: YES
    }
}
