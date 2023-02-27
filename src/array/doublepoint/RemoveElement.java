package array.doublepoint;

/**
 * Date：2023/2/27
 * Description：移除元素 https://leetcode.cn/problems/remove-element/
 * 难点：双指针，快慢指针移动条件
 * @author neilCao
 * @version 1.0
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int fast, slow;
        fast = slow = 0;
        int length = nums.length;
        while (fast < nums.length) {
            //当快慢指针值不同时
            if (nums[fast] != val) {
                //覆盖慢指针值并移动
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
