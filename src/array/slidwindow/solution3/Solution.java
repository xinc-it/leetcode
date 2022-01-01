package array.slidwindow.solution3;

import java.util.HashMap;
import java.util.Map;

/**
 * Date：2022/1/1
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> needs = new HashMap();
        int right = 0;
        int left = 0;
        int length = 0;

        while (right < s.length()) {
            char c = s.charAt(right++);
            if (needs.getOrDefault(c, 0) != 0) {
                needs.put(c, needs.get(c)+1);
                //存在重复字符串，缩小窗口
                while (needs.get(c) > 1) {
                    char out = s.charAt(left++);
                    needs.put(out, needs.get(out) - 1);
                }
                System.out.println("left: "+left+" right:"+right);
                if (right - left > length) {
                    length = right - left;
                }
            } else  {
                needs.put(c, 1);
                System.out.println("left: "+left+" right:"+right);
                if (right - left > length) {
                    length = right - left;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
    }
}
