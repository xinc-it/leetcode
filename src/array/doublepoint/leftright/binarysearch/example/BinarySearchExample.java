package array.doublepoint.leftright.binarysearch.example;

/**
 * Date：2023/2/27
 * Description： 二分查找模板代码
 *
 * @author neilCao
 * @version 1.0
 */
public class BinarySearchExample {

    public int binarySearcheExample(int[] nums, int target) {
        int left, right;
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + right / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }

}
