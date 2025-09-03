package org.example.palindrome;

public class Main {
    public static void main(String[] args) {
        String input = "madamds";
        System.out.println(isPalindrome(input, 0, input.length() - 1));  // true
    }
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}
