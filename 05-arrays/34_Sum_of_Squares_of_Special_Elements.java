// Leetcode - #2778 Sum of Squares of Special Elements 
// Input: nums = [1,2,3,4]
// Output: 21

class SumOfSquares {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(sumOfSquares(nums));
    }

    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int squaredSum = 0;
        for (int i = 0; i <= n; i++) {
            if (n % (i+1) == 0) {
                squaredSum += (nums[i] * nums[i]);
            }
        }

        return squaredSum;
    }
}