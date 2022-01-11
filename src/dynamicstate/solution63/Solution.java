package dynamicstate.solution63;

import java.util.Arrays;

/**
 * Date：2022/1/10
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = 0;
        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }


        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) continue;
                if (obstacleGrid[i - 1][j] != 1 && obstacleGrid[i][j - 1] != 1) dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] != 1) dp[i][j] = dp[i][j - 1];
                if (obstacleGrid[i - 1][j] != 1 && obstacleGrid[i][j - 1] == 1) dp[i][j] = dp[i - 1][j];
                if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1) dp[i][j] = 0;
            }
        }

        for (int i = 0; i < obstacleGrid.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePathsWithObstacles(new int[][]{{0, 0 ,0}, {0, 1, 0}, {0, 0, 1}}));
    }
}
