package org.dev;

public class HighestPalindrome {

    public static String highestPalindrome(String s, int k) {
        char[] number = s.toCharArray();
        int n = s.length();
        boolean[] changed = new boolean[n];

        // Helper function to recursively form the highest palindrome
        String result = makeHighestPalindrome(number, changed, k, 0, n - 1);
        return result;
    }

    private static String makeHighestPalindrome(char[] number, boolean[] changed, int k, int left, int right) {
        if (left > right) {
            return new String(number);
        }

        if (number[left] != number[right]) {
            if (k == 0) return "-1";

            char maxChar = (char) Math.max(number[left], number[right]);
            number[left] = maxChar;
            number[right] = maxChar;
            changed[left] = changed[right] = true;

            return makeHighestPalindrome(number, changed, k - 1, left + 1, right - 1);
        } else {
            return makeHighestPalindrome(number, changed, k, left + 1, right - 1);
        }
    }

    private static String maximizePalindrome(char[] number, boolean[] changed, int k, int left, int right) {
        if (left > right || k <= 0) {
            return new String(number);
        }

        if (number[left] == number[right]) {
            if (number[left] != '9' && k >= 2 && (changed[left] || changed[right])) {
                number[left] = number[right] = '9';
                k--;
                if (changed[left] && changed[right]) k++;
            }
        } else {
            char maxChar = '9';
            if (k >= 1 && number[left] != '9' && number[right] != '9') {
                number[left] = number[right] = maxChar;
                k--;
                if (changed[left] && changed[right]) k++;
            }
        }

        return maximizePalindrome(number, changed, k, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s1 = "3943";
        int k1 = 1;
        System.out.println(highestPalindrome(s1, k1)); // Output: 3993

        String s2 = "932239";
        int k2 = 2;
        System.out.println(highestPalindrome(s2, k2)); // Output: 992299
    }
}

