package dynamicstate.solution322;


import java.util.Arrays;

/**
 * Date：2022/1/12
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution2 {

    public int coinChange(int[] coins, int amount) {

        //定义dp数组
        dp = new int[amount + 1];
        Arrays.fill(dp, -666);
        //初始化basecase
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=amount) dp[coins[i]] = 1;
        }
        int res = getDp(coins, amount);
        System.out.println(Arrays.toString(dp));
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int[] dp;

    public int getDp(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (dp[amount] != -666) return dp[amount];
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int nums = getDp(coins, amount - coins[i]);
            if (nums==-1) continue;
            res=Math.min(nums+1,res);
        }
        return dp[amount] = res == Integer.MAX_VALUE ? -1 : res ;
    }


    public static void main(String[] args) {
        System.out.println(new Solution2().coinChange(new int[]{1,2147483647}, 3));
    }

}
