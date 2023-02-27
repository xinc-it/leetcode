package array.doublepoint.fastslow;

import java.util.Arrays;

/**
 * Date：2023/2/27
 * Description：leetcode 283 https://leetcode.cn/problems/move-zeroes/
 * 难点：双指针 快慢指针
 * @author neilCao
 * @version 1.0
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length<2) return ;
        int fast, slow;
        fast = slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
            fast++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
