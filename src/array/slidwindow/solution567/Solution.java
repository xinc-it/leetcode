package array.slidwindow.solution567;

import java.util.HashMap;
import java.util.Map;

/**
 * Date：2021/12/31
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> windows = new HashMap<>();
        Map<Character, Integer> needs = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int valid = 0;
        int length = Integer.MAX_VALUE;
        while (right < s2.length()) {
            char in = s2.charAt(right);
            right++;
            if (needs.containsKey(in)) {
                windows.put(in, windows.getOrDefault(in, 0) + 1);
                if (windows.get(in).equals(needs.get(in))) {
                    valid++;
                }
            }
            while (valid == needs.size()) {
                if (right - left <= length) {
                    length = right - left;
                }
                if (length == s1.length()) {
                    return true;
                }
                char out = s2.charAt(left++);
                if (windows.containsKey(out)) {
                    if (windows.get(out).equals(needs.get(out))) {
                        valid--;
                    }
                    windows.put(out, windows.get(out)-1);
                }
            }


        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkInclusion("abc", "aocbac"));
    }
}
