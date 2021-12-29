package array.binarysearch.solution704;
//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否
//则返回 -1。
//
//
//示例 1:
//
// 输入: nums = [-1,0,3,5,9,12], target = 9
//输出: 4
//解释: 9 出现在 nums 中并且下标为 4
//
//
// 示例 2:
//
// 输入: nums = [-1,0,3,5,9,12], target = 2
//输出: -1
//解释: 2 不存在 nums 中因此返回 -1
//
//
//
//
// 提示：
//
//
// 你可以假设 nums 中的所有元素是不重复的。
// n 将在 [1, 10000]之间。
// nums 的每个元素都将在 [-9999, 9999]之间。
//
// Related Topics 数组 二分查找 👍 552 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 解题思路
     * 通过二分法确定，不断缩小二分的范围，当范围越界或者对应target数值在数组中存在时,退出。
     * 1.确定二分的范围start,mid,end对应数组中的索引值
     * 2.判断mid索引下的值是否等于target，等于则直接返回，不等于则执行根据条件执行2.1/2.2步骤缩小查找范围
     * 2.1当nums[mid]<target，说明target在数组中mid<x<=end索引范围内.因此让start=mid+1     'x为target在数组中存在位置，如果存在即为对应的索引，不存在为-1'
     * 2.2当nums[mid]>target,说明target在数组中start<=x<mid.因此让end=mid-1
     * 3.然后判断start与end的关系，如果start>end的话，说明二分查找结束了。则返回-1，反之则继续执行2步骤
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        if (nums.length <= 0) {
            return -1;
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

        return -1;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
