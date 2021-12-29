import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName：Sloution704
 * @Description:
 * @author: xin
 * @date: 2021/7/19
 */

public class Solution704 {


    //    public int search(int[] nums, int target) {
//        int i = Arrays.binarySearch(nums, target);
//
//        if (i <0){
//            return - 1;
//        }
//        return i;
//    }
    //二分查找
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        //length一定大或等于2
        if (end - start < 0) {
            return -1;
        }
        //当前子数组的长度
        int length = end - start + 1;
        if (nums[start + length / 2] >target) {
            return binarySearch(nums, target, start, start + length / 2 - 1);
        } else if (nums[start + length / 2] <target) {
            return binarySearch(nums, target, start + length / 2 + 1, end);
        } else {
            return start + length / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 5, 9, 12};
        System.out.println(new Solution704().search(nums, 3));
    }
}
