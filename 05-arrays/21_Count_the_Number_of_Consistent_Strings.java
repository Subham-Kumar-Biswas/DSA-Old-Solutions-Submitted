// Leetcode - #1684 Count the Number of Consistent Strings
// Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
// Output: 2

class Solution {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];

        for(char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }

        int count = 0;

        for(String word : words) {
            boolean isConsistent = true;
            for(char c :word.toCharArray()) {
                if(!isAllowed[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) {
                count++;
            }
        }
        return count;
    }
}