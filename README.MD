# INDATEK.ID Coding Test Solutions

This project contains solutions to various coding test problems, implemented in Java. The solutions include problems related to balanced brackets, highest palindromes, and weighted strings. Each problem is solved in a separate Java class, and all the solutions are tested in a main class.

## Table of Contents

1. [Balanced Brackets](#balanced-brackets)
2. [Highest Palindrome](#highest-palindrome)
3. [Weighted Strings](#weighted-strings)
4. [Usage](#usage)
5. [Using IntelliJ IDEA](#using-intellij-idea)
6. [Complexity Analysis](#complexity-analysis)

## Balanced Brackets

This problem involves determining whether a string of brackets is balanced. A balanced string of brackets consists of pairs of opening and closing brackets, where each opening bracket has a corresponding closing bracket of the same type, and the brackets are nested properly.

- **Class:** `BalancedBrackets`
- **Method:** `public static String isBalanced(String s)`
- **Example:**
  ```java
  String example1 = "{ [ ( ) ] }";
  String example2 = "{ [ ( ] ) }";
  String example3 = "{ ( ( [ ] ) [ ] ) [ ] }";
  System.out.println(BalancedBrackets.isBalanced(example1)); // Output: YES
  System.out.println(BalancedBrackets.isBalanced(example2)); // Output: NO
  System.out.println(BalancedBrackets.isBalanced(example3)); // Output: YES
  ```

## Highest Palindrome

The goal is to find the highest possible palindrome that can be formed by changing at most `k` digits in a given string representing a number.

- **Class:** `HighestPalindrome`
- **Method:** `public static String highestPalindrome(String s, int k)`
- **Example:**
  ```java
  String s1 = "3943";
  int k1 = 1;
  System.out.println(HighestPalindrome.highestPalindrome(s1, k1)); // Output: 3993

  String s2 = "932239";
  int k2 = 2;
  System.out.println(HighestPalindrome.highestPalindrome(s2, k2)); // Output: 992299
  ```

## Weighted Strings

Given a string and an array of queries, determine the status of each query based on the weights of characters and their consecutive substrings.

- **Class:** `WeightedStrings`
- **Method:** `public static String[] weightedStrings(String s, int[] queries)`
- **Example:**
  ```java
  String ws = "abbcccd";
  int[] queries = {1, 3, 9, 8};
  String[] results = WeightedStrings.weightedStrings(ws, queries);
  System.out.println(Arrays.toString(results)); // Output: [Yes, Yes, Yes, No]
  ```

## Usage

1. **Clone the repository:**
   ```sh
   git clone git@github.com:andynur/indatek-test.git
   cd indatek-test
   ```

2. **Compile the project:**
   ```sh
   javac BalancedBrackets.java HighestPalindrome.java WeightedStrings.java Main.java
   ```

3. **Run the main class:**
   ```sh
   java Main
   ```

4. **Output:**
   The program will print the results of the test cases for each problem.

## Using IntelliJ IDEA

1. **Open IntelliJ IDEA:**
    - If you don't have IntelliJ IDEA installed, download and install it from [JetBrains](https://www.jetbrains.com/idea/download/).

2. **Open the Project:**
    - Select `Open or Import` from the welcome screen or `File -> Open` if you already have a project open.
    - Navigate to the directory where you cloned this repository and select it.

3. **Add Java Classes:**
    - If the classes `BalancedBrackets`, `HighestPalindrome`, `WeightedStrings`, and `Main` are not already created, right-click on the `src` directory in the project explorer, select `New -> Java Class`, and create each class.

4. **Add the Code:**
    - Copy and paste the code provided for each class (`BalancedBrackets`, `HighestPalindrome`, `WeightedStrings`, and `Main`) into the corresponding Java files in your IntelliJ project.

5. **Run the Main Class:**
    - Right-click on the `Main` class in the project explorer and select `Run 'Main.main()'`.

6. **Output:**
    - The results of the test cases for each problem will be printed in the IntelliJ console.

## Complexity Analysis

### Balanced Brackets

- **Time Complexity:** O(n), where n is the length of the string. Each character in the string is processed once.
- **Space Complexity:** O(n), for the stack used to store opening brackets.

### Highest Palindrome

- **Time Complexity:** O(n), where n is the length of the string. The string is processed twice: once to make it a palindrome and once to maximize the palindrome.
- **Space Complexity:** O(n), for the character array and boolean array used.

### Weighted Strings

- **Time Complexity:** O(n), where n is the length of the string. Each character and its consecutive repetitions are processed.
- **Space Complexity:** O(n), for the set used to store unique weights.
