package array.prefixsum.solution3;

/**
 * Date：2021/12/28
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class NumArray {


    private int[] nums;
    private int[] numsSum;

    public NumArray(int[] nums) {
        this.nums = nums;
        numsSum = new int[nums.length];
        numsSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            numsSum[i] += numsSum[i - 1] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        int result = numsSum[right];
        for (int i = 0; i < left; i++) {
            result -= nums[i];
        }
        return result;
    }
}
