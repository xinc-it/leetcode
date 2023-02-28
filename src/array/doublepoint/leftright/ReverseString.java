package array.doublepoint.leftright;

/**
 * Date：2023/2/28
 * Description：leetcode344：反转字符串 https://leetcode.cn/problems/reverse-string/
 * 难点：双指针，左右指针
 *
 * @author neilCao
 * @version 1.0
 */
public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length < 2) return;
        //定义双指针并初始化
        int left, right;
        left = 0;
        right = s.length - 1;
        while (left < right) {
            if (s[left] != s[right]) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }
            left++;
            right--;
        }
    }
}
