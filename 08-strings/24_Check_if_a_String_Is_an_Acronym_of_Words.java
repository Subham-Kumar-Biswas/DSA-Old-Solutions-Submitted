// Leetcode - #2828 Check if a String Is an Acronym of Words
// Input: words = ["alice","bob","charlie"], s = "abc"
// Output: true

import java.util.List;
import java.util.ArrayList;

class IsAcronym {
    public static void main(String[] args) {
        List<String> words = List.of("alice","bob","charlie");
        String s = "abc";
        System.out.println(isAcronym(words, s));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder(words.size());

        if (words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i).charAt(0));
        }

        if (sb.toString().equals(s)) {
            return true;
        }

        return false;
    }
}