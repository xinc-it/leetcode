package array.doublepoint.solution167;

/**
 * Date：2021/12/29
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int result = Integer.compare(numbers[left] + numbers[right], target);
            if (result == 0) {
                return new int[]{left + 1, right + 1};
            } else if (result > 0) {
                right--;
            } else if (result < 0) {
                left++;
            }
        }
        return new int[]{0, 0};
    }
}
