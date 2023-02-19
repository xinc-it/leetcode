package array.doublepoint;

/**
 * Date：2023/2/19
 * Description：移除有序数组中的重复项 https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * 难点：双指针的移动条件 快慢指针值不同时，移动慢指针
 * @author xinC
 * @version 1.0
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        //如果数组长度小于2，则不存在重复项
        if (nums.length < 2) return nums.length;
        int fast, slow;
        fast = 1;
        slow = 0;
        //原数组长度
        int length = nums.length;
        while (fast < nums.length) {
            //当快慢指针值不同时，需要移动慢指针
            if (nums[slow] != nums[fast]) {
                slow++;
                //覆盖掉重复值,维护nums[0-slow]的值不重复
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
