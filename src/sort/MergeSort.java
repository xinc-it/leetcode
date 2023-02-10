package sort;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Date：2022/2/14
 * Description：归并排序
 *
 * @author xinC
 * @version 1.0
 */
public class MergeSort {


    public static void main(String[] args) {
        int[] nums = ArrayUtils.generateArray(9);
        System.out.println(Arrays.toString(nums));
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


    public static void mergeSort(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        System.out.println(start+"---------"+mid+"------"+end);
        mergeSort(nums, start, mid );
        mergeSort(nums, mid+1, end);
        //将两个子数组合并成一个，然后进行排序
        int[] tempArr = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) tempArr[k++] = nums[i++];
            else if (nums[i] >= nums[j]) tempArr[k++] = nums[j++];
        }
        while (i <= mid  && j >end) {
            tempArr[k++] = nums[i++];
        }
        while (j <= end&&i>mid) {
            tempArr[k++] = nums[j++];
        }
        k = 0;
        for (int l = start; l <= end; l++) {
            nums[l] = tempArr[k++];
        }
    }


    //public static void mergeSort(int[] nums, int l, int r) {
    //     // 终止条件
    //     if (l >= r) return;
    //     // 递归划分
    //     int m = (l + r) / 2;
    //     mergeSort(nums, l, m);
    //     mergeSort(nums, m + 1, r);
    //     // 合并子数组
    //     int[] tmp = new int[r - l + 1]; // 暂存需合并区间元素
    //     for (int k = l; k <= r; k++)
    //         tmp[k - l] = nums[k];
    //     int i = 0, j = r - l + 1-m;       // 两指针分别指向左/右子数组的首个元素
    //     for (int k = l; k <= r; k++) {  // 遍历合并左/右子数组
    //         if (i == m - l + 1)
    //             nums[k] = tmp[j++];
    //         else if (j == r - l + 1 || tmp[i] <= tmp[j])
    //             nums[k] = tmp[i++];
    //         else {
    //             nums[k] = tmp[j++];
    //         }
    //     }
    // }


}
