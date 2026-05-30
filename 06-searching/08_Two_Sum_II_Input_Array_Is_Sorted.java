// Leetcode - #167 Two Sum II - Input Array Is Sorted
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]

class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right) {
            int currentSum = numbers[left] + numbers[right];

            if(currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if(target > currentSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}