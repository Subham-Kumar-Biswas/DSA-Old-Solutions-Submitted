// Leetcode - #2154 Keep Multiplying Found Values by Two
// Input: nums = [5,3,6,1,12], original = 3
// Output: 24

class FindFinalValue {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums, original));
    }

    // Time complexity: O(N^2)
    public static int findFinalValue(int[] nums, int original) {

        for(int i = 0; i < nums.length; i++) {
            if (original == nums[i]) {
                original *= 2;
                i = -1;
            }
        }
        return original;
    }
}