// Leetcode - #1299 Replace Elements with Greatest Element on Right Side
// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]

import java.util.Arrays;

class ReplaceElements {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int maxSoFar = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            int currentVal = arr[i];
            arr[i] = maxSoFar;

            if(currentVal > maxSoFar) {
                maxSoFar = currentVal;
            }
        }
        return arr;
    }
}