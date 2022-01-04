package array.modifyarray.solution26;

/**
 * Date：2022/1/4
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        int fast = 0;
        fast++;
        while (nums.length > fast) {

            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
