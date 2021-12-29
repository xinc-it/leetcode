package sort;

import java.util.Arrays;

/**
 * @PackageName:sort @ClassName：BubbleSort @Description:
 *
 * @author: xin
 * @date: 2021/8/4
 */
public class BubbleSort {

  public static void bubbleSort(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(nums));
  }

  public static void main(String[] args) {
    int[] array={50,2,44,38,5,47,10,1};
    BubbleSort.bubbleSort(array);
  }
}
