package array.modifyarray.solution27;

/**
 * Date：2022/1/4
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{0}, 3));
    }



}
