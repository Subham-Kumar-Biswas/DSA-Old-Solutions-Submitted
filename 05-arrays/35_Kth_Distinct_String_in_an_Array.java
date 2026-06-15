// Leetcode - #2053 Kth Distinct String in an Array
// Input: arr = ["d","b","c","b","c","a"], k = 2
// Output: "a"

import java.util.HashMap;

class KthDistinct {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> countElements = new HashMap<>();

        for (String s : arr) {
            countElements.put(s, countElements.getOrDefault(s, 0) + 1);
        }

        for (String s : arr) {
            if (countElements.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        
        return "";
    }
}