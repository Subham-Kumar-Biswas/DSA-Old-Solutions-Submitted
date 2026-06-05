// Leetcode - #2574 Left and Right Sum Differences
// Input: nums = [10,4,8,3]
// Output: [15,1,11,22]

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int currentLeftSum = 0;
        int currentRightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = currentLeftSum;
            rightSum[nums.length - 1 - i] = currentRightSum;

            currentLeftSum += nums[i];
            currentRightSum += nums[nums.length - 1 - i];
        }
        
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}