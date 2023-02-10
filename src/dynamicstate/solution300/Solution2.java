package dynamicstate.solution300;

import java.util.Arrays;

/**
 * Date：2022/1/18
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution2 {
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int num = dp(nums, nums.length - 1);
        int max = 1;
        System.out.println(Arrays.toString(dp));
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i]) max = dp[i];
        }
        return max;
    }

    public int dp(int[] nums, int length) {

        //baseCase
        if (length < 0) {
            return 0;
        }

        //状态i
        for (int i = 0; i < length; i++) {
            //选择
            if (nums[i] < nums[length]) {
                dp[length] = Math.max(dp[length], dp(nums, i) + 1);
            }
        }

        return dp[length];

    }

    int[] dp;

    public static void main(String[] args) {
        System.out.println(new Solution2().lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }
}
