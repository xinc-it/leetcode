package sort;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Date：2022/2/14
 * Description：快速排序
 *
 * @author xinC
 * @version 1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = ArrayUtils.generateArray(10);
        System.out.println("未排序数组" + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("排序数组" + Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end) {


        if (start >= end) {
            return;
        }
        int baseIndex = start;
        int startIndex = start;
        int endIndex = end;
        while (startIndex < endIndex) {
            while (startIndex < endIndex && nums[endIndex] > nums[baseIndex]) {
                endIndex--;
            }

            while (startIndex < endIndex && nums[startIndex] <= nums[baseIndex]) {
                startIndex++;
            }
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
        }
        int tempNum = nums[startIndex];
        nums[startIndex] = nums[start];
        nums[start] = tempNum;
        baseIndex = startIndex;
        System.out.println(start + "-----" + baseIndex + "----" + end);
        quickSort(nums, start, baseIndex - 1);
        quickSort(nums, baseIndex + 1, end);

    }
}
