// Leetcode - #2154 Keep Multiplying Found Values by Two
// Input: nums = [5,3,6,1,12], original = 3
// Output: 24

class FindFinalValue {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums, original));
        System.out.println(findFinalValue2(nums, original));
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

    
    // Time complexity: O(N)
    public static int findFinalValue2(int[] nums, int original) {
        boolean[] exists = new boolean[1001];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 1000) {
                exists[nums[i]] = true;
            } 
        }
        while (original <= 1000 && exists[original]) {
            original *= 2;
        }
        return original;
    }
}