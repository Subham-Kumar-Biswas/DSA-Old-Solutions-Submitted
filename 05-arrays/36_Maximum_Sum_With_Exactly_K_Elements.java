// Leetcode - #2656 Maximum Sum With Exactly K Elements 
// Input: nums = [1,2,3,4,5], k = 3
// Output: 18

class MaximizeSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;

        System.out.println(maximizeSum(nums, k));
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }        

        int sum = max;
        int currentNum = max;
        for  (int i = 1; i < k; i++) {
            currentNum++;
            sum += currentNum;
        }

        return sum;
    }
}