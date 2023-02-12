package array.differential;

import java.util.Arrays;

/**
 * Date：2023/2/12
 * Description：https://leetcode.cn/problems/car-pooling/
 * 难点：差分数组，
 *
 * @author xinC
 * @version 1.0
 */
public class CarPooling {
    public int[] df;

    public boolean carPooling(int[][] trips, int capacity) {
        // 初始化差分数组
        df = new int[1001];
        //对差分数组进行计算
        increment(trips);
        //生成原数组
        int[] nums = generateNums();
        //确保容量足够
        return ensureCapacity(capacity, nums);

    }

    public int[] generateNums() {
        int[] nums = new int[df.length];
        nums[0] = df[0];
        for (int i = 1; i < df.length; i++) {
            nums[i] = df[i] + nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public boolean ensureCapacity(int capacity, int[] nums) {
        for (int num : nums) {
            if (capacity < num) {
                return false;
            }
        }
        return true;
    }

    public void increment(int[][] trips) {
        for (int[] trip : trips) {
            df[trip[1]] += trip[0];
            if (trip[2] + 1 < df.length) {
                //难点：差分数组的减号索引需要减一
                df[trip[2]] -= trip[0];
            }
        }
    }
}
