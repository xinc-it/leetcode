import java.util.Arrays;
import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution1 @Description:
 *
 * @author: xin
 * @date: 2021/7/26
 */
public class Solution1 {

  public int[] twoSum(int[] nums, int target) {
    int[] indexNum = new int[2];
    HashMap<Integer, Integer> numMap = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      numMap.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.println(target - nums[i]);
      if (numMap.containsKey(target - nums[i])) {
        if (numMap.get(target - nums[i]) != i) {
          indexNum[0] = i;
          indexNum[1] = numMap.get(target - nums[i]);
          return indexNum;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    //
    int[] nums = {3, 2, 4,5,6};
    int[] ints = new Solution1().twoSum(nums, 12);
    System.out.println(Arrays.toString(ints));
  }
}
