// Leetcode - #268 Missing Number
// Input: nums = [3,0,1]
// Output: 2

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Result (Cyclic): " + missingNumberCyclic(nums));  
    }

    // --- APPROACH 1: BUBBLE SORT ---
    public static int missingNumberBubble(int[] nums) {
        bubble(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    // --- APPROACH 2: CYCLIC SORT ---
    public static int missingNumberCyclic(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    // --- APPROACH 3: Bitwise operator ---
    public static int missingNumberXOR(int[] nums) {
        int xor = nums.length;
        for(int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }

    // Helper method for Cyclic Sort
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Bubble Sort
    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}