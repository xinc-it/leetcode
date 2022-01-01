package array.doublepoint.solution344;

/**
 * Date：2021/12/29
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
