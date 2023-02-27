package array.doublepoint.leftright;

/**
 * Date：2023/2/27
 * Description：leetcode167：https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/ 两数之和II
 * 难点： 快慢指针
 * @author neilCao
 * @version 1.0
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        //定义左右双指针并初始化
        int left, right;
        left = 0;
        right = numbers.length - 1;
        int[] targetIndex;
        if (numbers.length == 2) {
            return new int[]{left + 1, right + 1};
        }
        //设定循环条件
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
}
