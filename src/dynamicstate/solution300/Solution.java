package dynamicstate.solution300;

import java.util.Arrays;

/**
 * Date：2022/1/12
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        //第几个数的最大子序列长度
        dp = new int[nums.length + 1];
        //初始化baseCase
        dp[0] = 1;
        Arrays.fill(dp, 1);
        return getDp(nums);
    }

    int[] dp;

    private int getDp(int[] nums) {
        int maxLen = 0;
        //明确状态
        for (int i = 1; i < nums.length; i++) {

            //明确选择
            int res = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    int len = dp[j] + 1;
                    res = res < len ? len : res;
                }
            }
            dp[i] = res;
            maxLen = dp[i] > maxLen ? dp[i] : maxLen;
        }
        System.out.println(Arrays.toString(dp));
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
}
