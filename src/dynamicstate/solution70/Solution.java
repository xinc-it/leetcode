package dynamicstate.solution70;

import java.util.Arrays;

/**
 * Date：2022/1/10
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public int climbStairs(int n) {
        //确定dp数组以及小标含义，下标为n个台阶的爬法
        int[] dp = new int[n + 1];
        if (n < 2) {
            return n;
        }
        //初始化dp[数组]
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        //确定遍历顺序
        for (int i = 3; i <= n; i++) {
            System.out.println(Arrays.toString(dp));
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(5));
    }
}
