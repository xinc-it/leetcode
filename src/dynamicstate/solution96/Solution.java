package dynamicstate.solution96;

import java.util.Arrays;

/**
 * Date：2022/1/11
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int numTrees(int n) {
        //dp表示n个节点最多有n种不同的二叉树
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        int dp = getDp(n);
        System.out.println(Arrays.toString(this.dp));
        return dp;
    }

    int[] dp;

    public int getDp(int n) {

        if (dp[n] != -1) {
            return dp[n];
        }
        for (int i = 2; i <= n; i++) {
            int res = 0;
            for (int j = 1; j <= i; j++) {
                int leftNums = getDp(j - 1);
                int rightNums = getDp(i - j);
                res = res + leftNums * rightNums;

            }
            dp[i] = res;
        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(new Solution().numTrees(4));
    }
}
