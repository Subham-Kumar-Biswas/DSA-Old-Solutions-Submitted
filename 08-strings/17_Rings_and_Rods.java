// Leetcode - #2103 Rings and Rods
// Input: rings = "B0B6G0R6R0R6G9"
// Output: 1

class Solution {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }

    public static int countPoints(String rings) {
        String[] rods = new String[10];

        for(int i = 0; i < rods.length; i++) {
            rods[i] = "";
        }

        for(int i = 1; i < rings.length(); i += 2) {
            int rodIndex = rings.charAt(i) - '0';
            char color = rings.charAt(i - 1);

            rods[rodIndex] += color;
        }

        int count = 0;
        for(int i = 0; i < rods.length; i++) {
            if (rods[i].contains("R") && rods[i].contains("G") && rods[i].contains("B")) {
                count++;
            }
        }
        return count;
    }
}