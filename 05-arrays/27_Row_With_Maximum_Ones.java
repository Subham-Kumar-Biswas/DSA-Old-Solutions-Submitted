// Leetcode - #2643. Row With Maximum Ones
// Input: mat = [[0,1],[1,0]]
// Output: [0,1]

import java.util.Arrays;

class RowAndMaximumOnes {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[] answer = rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] answer = {0, 0};

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > answer[1]) {
                answer[0] = i;
                answer[1] = count;
            }
        }
        return answer;
    }
}