// Leetcode - #2185 Counting Words With a Given Prefix
// Input: words = ["pay","attention","practice","attend"], pref = "at"
// Output: 2

class Solution {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}