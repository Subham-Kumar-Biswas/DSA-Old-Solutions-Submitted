// Leetcode - #2744 Find Maximum Number of String Pairs
// Input: words = ["cd","ac","dc","ca","zz"]
// Output: 2

class MaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (compare(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean compare(String wordi, String wordj) {
        return wordi.charAt(0) == wordj.charAt(1) && wordi.charAt(1) == wordj.charAt(0);
    }
}