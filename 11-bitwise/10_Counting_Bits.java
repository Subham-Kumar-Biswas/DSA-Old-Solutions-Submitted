// Leetcode - #338 Counting Bits
// Input: n = 2
// Output: [0,1,1]

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) { // Time Complexity: O(n)
       int[] ans = new int[n+1];

       for(int i = 0; i <= n; i++) {
        ans[i] = ans[i >> 1] + (i & 1);
       }
       return ans;
    }

    public int[] lessEfficient(int n) { // Time Complexity: O(n log n)
       int[] ans = new int[n+1];

       for(int i = 0; i <= n; i++) {
        int count = 0;
        int temp = i;
        while(temp != 0) {
            if((temp&1) == 1) {
                count++;
            }
            temp >>>= 1;
        }
        ans[i] = count;
       }
       return ans;
    }
}