package array.prefixsum.solution3;

import java.util.Arrays;

/**
 * Date：2021/12/28
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class NumArray {


    //sum[i]等于nums[0,i-1]的和
    public int[] sums;

    public NumArray(int[] nums) {
        //初始化前缀和数组
        sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            // 计算前缀和数组值
            sums[i + 1] = sums[i] + nums[i];
        }
        System.out.println(Arrays.toString(sums));
    }

    public int sumRange(int left, int right) {
        //计算nums[left,right]之间的和
        return sums[right + 1] - sums[left];
    }
}
