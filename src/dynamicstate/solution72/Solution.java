package dynamicstate.solution72;

import java.util.Arrays;

/**
 * Date：2022/1/18
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {
    public int minDistance(String word1, String word2) {
        char[] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();
        dp = new int[wordArr1.length][wordArr2.length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return dp(wordArr1, wordArr1.length - 1, wordArr2, wordArr2.length - 1);
    }

    int[][] dp;

    public int dp(char[] word1, int len1, char[] word2, int len2) {
        //如果有一个字符遍历完了，那么另外一个字符剩下的长度就要删除/新增
        //baseCase
        if (len1 == -1 || len2 == -1) {
            return Math.max(len1, len2) + 1;
        }
        if (dp[len1][len2] != -1) {
            return dp[len1][len2];
        }
        //明确状态 len1,len2
        if (word1[len1] == word2[len2]) {
            //选择1
            dp[len1][len2] = dp(word1, len1 - 1, word2, len2 - 1);
        } else {
            //选择2
            dp[len1][len2] = min(
                    dp(word1, len1, word2, len2 - 1) + 1,
                    dp(word1, len1 - 1, word2, len2) + 1,
                    dp(word1, len1 - 1, word2, len2 - 1) + 1
            );
        }
        return dp[len1][len2];

    }

    public int min(int dp, int dp1, int dp2) {
        return Math.min(dp, Math.min(dp1, dp2));
    }


    public static void main(String[] args) {
        System.out.println(new Solution().minDistance("intention", "execution"));
    }
}
