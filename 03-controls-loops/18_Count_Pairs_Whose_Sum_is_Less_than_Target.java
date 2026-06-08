// Leetcode - #2824 Count Pairs Whose Sum is Less than Target
// Input: nums = [-1,1,2,3,1], target = 2
// Output: 3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CountPairs {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        System.out.println(countPairs(nums, 0));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if ((nums.get(i) + nums.get(j)) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}