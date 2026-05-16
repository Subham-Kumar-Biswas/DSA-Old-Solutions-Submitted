// Leetcode - #75 Sort Colors
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

import java.util.Arrays;

class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
 
    public static void sortColors(int[] nums) {
        int swappingIndex = 0;
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    int temp = nums[j];
                    nums[j] = nums[swappingIndex];
                    nums[swappingIndex] = temp;
                    swappingIndex++;
                }
            }
        }
    }
}