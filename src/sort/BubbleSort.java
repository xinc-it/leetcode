package sort;

import com.sun.deploy.util.ArrayUtil;
import utils.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

/**
 * Date：2022/2/14
 * Description：冒泡排序
 *
 * @author xinC
 * @version 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = ArrayUtils.generateArray(10);
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }



    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] >= nums[j + 1]) {
                    flag = false;
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
            if (flag) {
                //当有一轮循环没有需要移动的数据，证明排序完成
                break;
            }
        }
    }


}
