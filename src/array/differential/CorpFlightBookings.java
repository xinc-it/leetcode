package array.differential;

import java.util.Arrays;

/**
 * Date：2023/2/12
 * Description：https://leetcode.cn/problems/corporate-flight-bookings/
 * 难点：差分数组
 *
 * @author xinC
 * @version 1.0
 */
public class CorpFlightBookings {
    //差分数组，diff[i]=num[i]-num[i-1];num[i]=diff[i]+nums[i-1]
    public int[] diff;

    public int[] corpFlightBookings(int[][] bookings, int n) {
        //   初始化差分数组
        diff = new int[n];
        //差分数组赋值
        increment(bookings);
        return generateNums(n);
    }

    /**
     * 通过差分数组反推生成原数组
     *
     * @param n 数组长度
     * @return 返回原始数组
     */
    public int[] generateNums(int n) {
        int[] answer = new int[n];
        answer[0] = diff[0];
        for (int i = 1; i < answer.length; i++) {
            answer[i] = diff[i] + answer[i - 1];
        }
        return answer;
    }


    /**
     * 差分数组进行索引加减
     *
     * @param bookings 预定记录数组
     */
    public void increment(int[][] bookings) {
        for (int[] booking : bookings) {
            diff[booking[0] - 1] += booking[2];
            if (booking[1] < diff.length) {
                diff[booking[1]] -= booking[2];
            }
        }
        System.out.println(Arrays.toString(diff));
    }
}
