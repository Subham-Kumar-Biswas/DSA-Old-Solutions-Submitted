// Leetcode - #Find the Difference of Two Arrays
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]

import java.util.*;

class FindDifference {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
        System.out.println(findDifference2(nums1, nums2));
    }

    // Time Complexity: O(M x N)
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int i = 0; i < nums1.length; i++) {
            boolean isPresent  = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent && !ans.get(0).contains(nums2[i])) {
                ans.get(0).add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean isPresent  = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent && !ans.get(1).contains(nums1[i])) {
                ans.get(1).add(nums2[i]);
            }
        }

        return ans;
    }

    // Time Complexity: O(M + N)
    public static List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinct1 = new ArrayList<>();
        List<Integer> distinct2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                distinct1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                distinct2.add(num);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(distinct1);
        ans.add(distinct2);

        return ans;
    }
}