// Leetcode - #2108 Find First Palindromic String in the Array
// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"

class Solution {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for(String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

         while (left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            right--;
            left++;
         }
        return true;
    }
}