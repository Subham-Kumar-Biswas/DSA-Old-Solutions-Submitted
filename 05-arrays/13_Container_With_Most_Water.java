// Leetcode - #11 Container With Most Water
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49

class Solution {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while(start < end) {
            int width = end - start;
            int h = Math.min(height[start], height[end]);
            int currentArea = width * h;

            if(currentArea > maxArea) {
                maxArea = currentArea;
            }

            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;

    }
}
