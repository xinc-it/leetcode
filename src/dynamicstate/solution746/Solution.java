package dynamicstate.solution746;

import java.util.Arrays;

/**
 * Date：2022/1/10
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        //dp为拍到第i个台阶所花费的最小体力
        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }


    public static void main(String[] args) {
        System.out.println(new Solution().minCostClimbingStairs(new int[]{4, 1}));
    }

}
