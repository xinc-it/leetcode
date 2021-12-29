package treenode; /**
 * @author: xin
 * @date: 2021/1/19
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


import java.util.*;

/**
 * 解题思路：
 * 创建一个映射，然后遍历该数组，然后将每个数字作为key，次数作为value
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] ints = {2, 2, 1};
        SingleNumber singleNumber = new SingleNumber();
        int i = singleNumber.singleNumber2(ints);
        System.out.println(i);
    }

    public Integer singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //如果map中没有这个数字时
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                //获取该数字出现的次数
                Integer integer = map.get(nums[i]);
                map.put(nums[i], ++integer);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public int singleNumber2(int[] nums) {
        List<int[]> ints = Arrays.asList(nums);
        System.out.println(ints);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
        }
        int flag;
        PrimitiveIterator.OfInt iterator = Arrays.stream(nums).iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
//        int flag;
//        for (int i = 0; i < nums.length; i++) {
//            flag=nums[i];
//
//        }
        return 9;
    }
}
