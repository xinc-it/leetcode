package dynamicstate.solution343;

import java.util.Arrays;

/**
 * Date：2022/1/10
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int integerBreak(int n) {
        //dp为整数n的乘积最大化
        int[] dp = new int[n+1];
        //dp初始化
        dp[0] = 0;
        dp[1] = 1;
        //确定遍历顺序
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[i - j] * j));
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().integerBreak(15));
    }
}
