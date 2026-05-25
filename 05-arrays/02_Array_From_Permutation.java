// Leetcode - #1920 Build Array From Permutation
// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]

import java.util.Arrays;

class ArrayFromPermutaion {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };

        int[] result = newBuildArray(nums);

        System.out.println(Arrays.toString(result));
    } 

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    // OR 

    public static int[] newBuildArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int targetIndex = nums[i];
            int newNum = nums[targetIndex] % n;

            nums[i] = nums[i] + (newNum * n);
        }
        for(int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }
}