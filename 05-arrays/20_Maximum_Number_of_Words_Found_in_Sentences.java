// Leetcode - #2114 Maximum Number of Words Found in Sentences
// Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
// Output: 6

class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] sentence = sentences[i].split(" ");
            if(sentence.length > maxWords) {
                maxWords = sentence.length;
            }
        }
        return maxWords;
    }
}