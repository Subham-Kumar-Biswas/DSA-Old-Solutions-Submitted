// Leetcode - #1844 Replace All Digits with Characters
// Input: s = "a1c1e1"
// Output: "abcdef"

class ReplaceDigits {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i += 2) {
            char previousLetter = arr[i - 1];
            int shiftAmount = arr[i] - '0';

            arr[i] = (char) (previousLetter + shiftAmount);
        }

        return new String(arr);
    }
}