// Leetcode - #2367 Number of Arithmetic Triplets
// Input: nums = [0,1,4,6,7,10], diff = 3
// Output: 2

import java.util.*;

class ArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;

        System.out.println(arithmeticTriplets(nums, diff));
        System.out.println(arithmeticTriplets2(nums, diff));
    }

    // Time Complexity: O(N^3)
    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    // Time Complexity: O(N)
    public static int arithmeticTriplets2(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num + diff)) {
                count++;
            }
        }

        return count;
    }
}