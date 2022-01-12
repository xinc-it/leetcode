package dynamicstate.solution931;

import java.util.Arrays;

/**
 * Date：2022/1/12
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int minFallingPathSum(int[][] matrix) {
        //表示从起点走到[i][j]的最小路径
        dp = new int[matrix.length][matrix[0].length];
        //初始化basecase
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i] = matrix[0][i];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            res = Math.min(getDp(matrix, matrix.length-1,i), res);

        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return res;
    }

    int[][] dp;

    public int getDp(int[][] matrix, int i, int j) {
        if (j < 0 || j >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }

        if (i == 0) {
            return matrix[0][j];
        }
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        for (int k = 0; k <= j; k++) {
            dp[i][k] = matrix[i][k] + getMin(getDp(matrix, i - 1, k- 1), getDp(matrix, i - 1, k), getDp(matrix, i - 1, k + 1));
        }
        return dp[i][j];
    }

    public int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }


    public static void main(String[] args) {
        System.out.println(new Solution().minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
    }
}
