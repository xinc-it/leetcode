package dynamicstate.solution62;

import java.util.Arrays;

/**
 * Date：2022/1/10
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        //确定dp数组含义
        int[][] dp = new int[m][n];
        //0，0到m,n的路径数目
        //初始化dp数组
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        System.out.println(Arrays.toString(dp[2]));
        return dp[m-1][n-1];

    }


    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(3, 7));
    }
}
