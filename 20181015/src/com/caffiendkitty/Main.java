
package com.caffiendkitty;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        runPalindromeCheck();
    }

    private static void runPalindromeCheck() {
        String maam = "maam";
        String madam = "madam";
        String adam = "adam";

        System.out.println(maam + " is palindrome? ["+isPalindrome(maam) +"]");
        System.out.println(madam + " is palindrome? ["+isPalindrome(madam)+"]");
        System.out.println(adam + " is palindrome? ["+isPalindrome(adam)+"]");
    }

    private static boolean isPalindrome(String word) {
        Stack<Character> charStack = new Stack<>();
        char[] charArray = word.toLowerCase().toCharArray();

        // push all the characters onto the stack
        for (char c : charArray) {
            charStack.push(c);
        }

        // iterate charArray and pop stack
        for (char c: charArray) {
            if ( charStack.pop() == c ) {
                continue;
            } else {
                break;
            }
        }

        return charStack.empty();
    }
}