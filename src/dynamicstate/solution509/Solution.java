package dynamicstate.solution509;

/**
 * Date：2022/1/6
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public int fib(int n) {
        //定义dp数组
        int[] dp=new int[31];
        //1.定义初始化base
        dp[0]=0;
        dp[1]=1;
        //明确状态
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib(4));
    }

}
