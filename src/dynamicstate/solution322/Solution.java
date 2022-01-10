package dynamicstate.solution322;

import java.util.Arrays;

/**
 * Date：2022/1/6
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];

        Arrays.fill(dp, -666);
        dp[0] = 0;
        return dp(coins, amount);
    }

    int[] dp;

    public int dp(int[] coins, int amount) {

        //明确basecase

        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }

        if (dp[amount] != -666) {
            return dp[amount];
        }

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subCoin = dp(coins, amount - coin);
            if (subCoin == -1) continue;
            res = Math.min(res, 1 + subCoin);
        }
        dp[amount]=(res == Integer.MAX_VALUE) ? -1 : res;
        return dp[amount];
    }


    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[]{ 2}, 3));
    }
}
