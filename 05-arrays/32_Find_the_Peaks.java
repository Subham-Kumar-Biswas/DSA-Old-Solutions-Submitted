// Leetcode - #2951 Find the Peaks
// Input: mountain = [1,4,3,8,5]
// Output: [1,3]

import java.util.ArrayList;
import java.util.List;

class FindPeaks {
    public static void main(String[] args) {
        int[] mountain = {1,4,3,8,5};
        System.out.println(findPeaks(mountain));
    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> peak = new ArrayList<>();

        for(int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peak.add(i);
                i++;
            }
        }
        return peak;
    }
}