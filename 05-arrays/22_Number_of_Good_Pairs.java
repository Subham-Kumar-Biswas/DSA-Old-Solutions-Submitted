// Leetcode - #1512 Number of Good Pairs
// Input: nums = [1,2,3,1,1,3]
// Output: 4

class NumIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] frequency = new int[101];
        int totalGroup = 0;
        for(int num : nums) {
            totalGroup += frequency[num];

            frequency[num]++;
        }
        return totalGroup;
    }
}