// Leetcode - #2000 Reverse Prefix of Word
// Input: word = "abcdefd", ch = "d"
// Output: "dcbaefd"

class Solution {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        int targetIndex = word.indexOf(ch);

        if (targetIndex == -1) {
            return word;
        }

        StringBuilder prefix = new StringBuilder(word.substring(0, targetIndex + 1));
        prefix.reverse();

        String remainder = word.substring(targetIndex + 1);

        return prefix.append(remainder).toString();
    }
}