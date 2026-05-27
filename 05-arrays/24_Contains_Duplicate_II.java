// Leetcode - #219. Contains Duplicate II
// Input: nums = [1,2,3,1], k = 3
// Output: true

import java.util.HashMap;

class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (map.containsKey(current)) {
                if ((Math.abs(i - map.get(current)) <= k)) {
                    return true;
                }
            }
            map.put(current, i);
        }
        return false;
    }
}