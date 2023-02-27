package array.doublepoint.fastslow.example;

/**
 * Date：2023/2/27
 * Description：快慢指针模板代码
 *
 * @author neilCao
 * @version 1.0
 */
public class FastSlowDoubleExample {


    public static void main(String[] args) {

        int val = 12;
        int[] nums = new int[12];
        //1. 定义初始化快慢指针
        int fast, slow;
        fast = slow = 0;
        //2. 设定循环条件
        while (fast < nums.length) {
            //3. 确定指针移动条件 1. 不等于特定值 | 快慢指针不相等
            if (nums[fast] != val || nums[fast] != nums[slow]) {
                //移动和赋值顺序需根据题目变化
                nums[slow] = nums[fast];
                slow++;
            }
        }
    }
}
