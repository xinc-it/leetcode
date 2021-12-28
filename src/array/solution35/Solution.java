package array.solution35;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 请必须使用时间复杂度为 O(log n) 的算法。
//
//
//
// 示例 1:
//
//
//输入: nums = [1,3,5,6], target = 5
//输出: 2
//
//
// 示例 2:
//
//
//输入: nums = [1,3,5,6], target = 2
//输出: 1
//
//
// 示例 3:
//
//
//输入: nums = [1,3,5,6], target = 7
//输出: 4
//
//
// 示例 4:
//
//
//输入: nums = [1,3,5,6], target = 0
//输出: 0
//
//
// 示例 5:
//
//
//输入: nums = [1], target = 0
//输出: 0
//
//
//
//
// 提示:
//
//
// 1 <= nums.length <= 10⁴
// -10⁴ <= nums[i] <= 10⁴
// nums 为无重复元素的升序排列数组
// -10⁴ <= target <= 10⁴
//
// Related Topics 数组 二分查找 👍 1241 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 解题思路
     * 1.先通过二分法判断数组中是否存在target对应的数，如果存在则直接返回
     * 2.如果不存在，
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int result = Integer.compare(nums[mid], target);
            if (result == 0) {
                return mid;
            } else if (result > 0) {
                //证明nums[mid]>target，执行2.2步骤
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end < 0) {
            return 0;
        }
        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)