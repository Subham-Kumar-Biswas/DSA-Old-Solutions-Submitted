// Leetcode - #1748 Sum of Unique Elements
// Input: nums = [1,2,3,2]
// Output: 4

class SumOfUnique {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int[] counts = new int[101];

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (counts[nums[i]] == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}