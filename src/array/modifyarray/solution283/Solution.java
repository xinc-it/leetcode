package array.modifyarray.solution283;

import java.util.Arrays;

/**
 * Date：2022/1/4
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new Solution().moveZeroes(new int[]{0,1});
    }


}
