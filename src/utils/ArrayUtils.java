package utils;

import java.util.Random;

/**
 * Date：2022/2/14
 * Description：数组工具类
 *
 * @author xinC
 * @version 1.0
 */
public class ArrayUtils {


    /**
     * 生成无序数组
     *
     * @param length
     * @return
     */
    public static int[] generateArray(int length) {
        int[] nums = new int[length];
        if (length * 10 <= Integer.MAX_VALUE) {
            Random random = new Random(length * 10);
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(length * 10);
            }
        } else {
            Random random = new Random(length);
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(length);
            }
        }
        return nums;
    }


}
