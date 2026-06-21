// Leetcode - #2418 Sort the People
// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]

import java.util.Arrays;

class sortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - 1 - i; j++) {

                if (heights[j] < heights[j + 1]) { 

                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        return names;
    }
}