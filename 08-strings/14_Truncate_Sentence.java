// Leetcode - #1816 Truncate Sentence
// Input: s = "Hello how are you Contestant", k = 4
// Output: "Hello how are you"

class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        StringBuilder truncate = new StringBuilder();
        for(int i = 0; i < k; i++) {
            if (i > 0) {
                truncate.append(" ");
            }
            truncate.append(words[i]);
        }

        return truncate.toString();
    }
}