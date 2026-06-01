// Leetcode - #908 Smallest Range I
// Input: nums = [1], k = 0
// Output: 0

// Input: nums = [0,10], k = 2
// Output: 6

class SmallestRangeI {
    public static void main(String[] args) {
        int[] nums = {0, 10};
        int k = 2;
        System.out.println(smallestRangeI(nums, k));
    }

    public static int smallestRangeI(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            } 
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }    

        int score = (maxVal - k) - (minVal + k);

        return Math.max(0, score);  
    }
}